package com.wiley.posa3.coordinator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * CentralAdministrator is the client that uses the SWCoordinator to
 * coordinate the software update of all the participants. 
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class CentralAdministrator {
  /**
   * Execute the task of updating the software at all subsystems
   */
  public void updateSoftware () {
    // Ask the Coordinator to begin the task
    coordinator.beginTask ();
    
    // Assume we have a list of sub-components stored
    // in an ArrayList. We now need to iterate over
    // this list and register all the sub-components
    // with the Coordinator
    ArrayList components = getComponents (); 
    for (Iterator i= components.iterator(); 
	 i.hasNext();) {
      Coordination swDownload = (Coordination) i.next();
      // Register the sub-component
      coordinator.register (swDownload);
    }
    // Now tell the Coordinator to start the actual task
    coordinator.commitTask ();
  }
  
  /**
   * Return list of components
   * @return ArrayList The list of sub-components.
   */
  private ArrayList getComponents() {
    ArrayList components = null;
    // Get list of components
    // ...
    return components;
  }

  // Assume we have a reference to the Coordinator
  private Coordinator coordinator;
}
