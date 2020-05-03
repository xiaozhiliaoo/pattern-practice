package com.wiley.posa3.partialacquisition;

/**
 * The Scheduler runs in the active object's thread of control.  The
 * requests that aret inserted into the Scheduler's message queue will
 * fetch the network element's components when triggered by the
 * Scheduler.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class Scheduler implements Runnable {

  /**
   * Constructor.
   * @param numThreads the number of threas to spawn.
   * @param tm an instance of a ThreadManager that is responsible for
   * managing all the threads.
   */
  public Scheduler (int numThreads, ThreadManager tm) {
    // Spawn off numThreads to be managed by ThreadManager. The
    // threads would dequeue MQRequest objects from the message queue
    // and invoke the call() method on each one
  }

  /**
   * Insert a request into the message queue of the scheduler.
   * @param request the request to schedule.
   */
  public void insert (Request request) {
    queue.insert (request);
  }
  
  /**
   * Method that is called when an instance of the Thread object is
   * created and is passed an MQScheduler.
   */
  public void run() {
    /*
     * @@ Michael: Prashant, do we need a run here? It is a runnable.
     * @@ Prashant: That is exactly why we need a run(). 
     */ 
  }

  private MessageQueue queue;
}
