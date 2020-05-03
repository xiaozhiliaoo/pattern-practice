package com.wiley.posa3.coordinator;

/**
 * Coordinator interface provides the means for a client to begin or
 * terminate a task. In addition, it allows participants of the
 * task to register.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface Coordinator {
  /**
   * The register() method is used by the participants to register
   * themselves with the coordinator once a task has begun.
   * @param participant the participant that needs to be registered and
   * whose task needs to be coordinated
   */
  public void register(Coordination participant);
 
  /**
   * The beginTask() method is used by the client to define the
   * beginning of a task. At this point the coordinator does not do
   * anything.  
   */
  public void beginTask();
 
  /**
   * The commitTask() method is executed by the client once all the
   * participants have registered. This serves as an indicator of two
   * things to the coordinator: Firstly, that all participants of
   * the task have registered, and secondly, that the coordinator can
   * begin coordinating the execution of the task by the
   * participants. The coordinator now uses the two-phase commit
   * protocol defined by Coordination interface to ensure that the
   * participants complete the task.  
   * @return boolean the result of committing the task
   */
  public boolean commitTask();
 }
