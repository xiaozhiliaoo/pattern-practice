package com.wiley.posa3.partialacquisition;

/**
 * MessageQueue provides an interface for a message queue to be used
 * in implementation of the Active Object pattern.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface MessageQueue {

  /**
   * Insert a request into the queue
   * @param request the request to insert into the queue.
   */
  public void insert(Request request);
}
