package com.wiley.posa3.coordinator;

/**
 * Coordination interface is implemented by all participants that will
 * execute part of the work of a task. 
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface Coordination {

  /**
   * The prepare() method is used by the coordinator to initiate the
   * prepare phase of each participant. This phase is used by each
   * participant to check for consistency, and also to determine if
   * the execution would result in failure. 
   * @return boolean - A return value of true indicates that the
   * prepare phase succeeded, and therefore that the commit phase will
   * also succeed. A return value of false indicates that the prepare
   * phase failed, and that therefore the participant will not be able
   * to execute the commit phase successfully. 
   */
  public boolean prepare();

  /**
   * The abort() method is called by the coordinator to stop the
   * execution of the task. This is carried out by the coordinator if
   * any of the participants return false in the prepare phase. The
   * abort() method is called for each participant that has already
   * returned successfully from the prepare phase. This would indicate
   * to the participants that the task is being aborted and that they
   * should perform any clean-up that is necessary.  
   */
  public void abort();

  /**
   * The commit() method is called by the coordinator to ask each
   * participant to do the actual work. If all the participants
   * complete the prepare phase successfully, the coordinator then
   * initiates the commit phase for each of the participants. The
   * participants do the actual work in this phase. Since each
   * participant has indicated in the prepare phase that the work
   * would succeed, the commit phase succeeds, leading to the overall
   * success of the task.  
   */
  void commit();
}
