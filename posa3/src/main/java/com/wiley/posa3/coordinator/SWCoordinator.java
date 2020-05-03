package com.wiley.posa3.coordinator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * SWCoordinator implements the Coordinator interface and ensures that
 * software updates involving multiple participants takes place. 
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class SWCoordinator implements Coordinator {

  /**
   * The register() method is used by the software download
   * participants to register themselves with the SWCoordinator once a
   * task has begun.
   * @param participant the software download participant that needs to
   * be registered and whose task needs to be coordinated 
   */
  public void register (Coordination participant) {
    if (!taskInProgress)
      return;
    if (!list.contains (participant))
      list.add (participant);
  }
  
  /**
   * The beginTask() method is used by the client to define the
   * beginning of a task. At this point the SWCoordinator does not do
   * anything.  
   */
  public void beginTask () {
    taskInProgress = true;
  }

  /**
   * The commitTask() method is executed by the client once all the
   * participants have registered. This serves as an indicator of two
   * things to the SWCoordinator: Firstly, that all participants of
   * the task have registered, and secondly, that the coordinator can
   * begin coordinating the execution of the task by the
   * participants. The coordinator now uses the two-phase commit
   * protocol defined by Coordination interface to ensure that the
   * participants complete the task.  
   * @return boolean the result of committing the task
   */
  public boolean commitTask () {
    if (!taskInProgress)
      return false;
    
    // Keep track of participants that complete prepare
    // phase successfully
    ArrayList prepareCompleted = new ArrayList ();
    
    // Iterate over registered participants and use 2PC
    for (Iterator i= list.iterator(); i.hasNext() ;) {
      Coordination participant = (Coordination) i.next();
      boolean success = participant.prepare ();

      if (success)
      	prepareCompleted.add (participant);
      else {
		// Ask all participants that have completed prepare phase
		// successfully to abort.
		for (Iterator iter = prepareCompleted.iterator(); iter.hasNext() ;) {
		  Coordination p = (Coordination) iter.next();
		  p.abort ();
		} // end for
		list.clear ();
		taskInProgress = false;		
		
		return false;
      } // end else
    } // end for
		
    // If we reach here, it means prepare phase of all
    // participants completed successfully. Now invoke
    // commit phase and assume it will succeed.
    for (Iterator i= list.iterator() ;i.hasNext() ;) {
      Coordination participant = (Coordination) i.next();
      participant.commit ();
    } // end for
    list.clear ();
    taskInProgress = false;
    return true;
  }

  // Flag indicating if a task is in progress. Note that
  // this simple version only handles one task at a time.
  private boolean taskInProgress = false;
  
  // List of registered participants
  private ArrayList list = new ArrayList ();
}
