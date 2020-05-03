package com.wiley.posa3.partialacquisition;

/**
 * Request is an interface of commands to be handled by the active
 * object asynchronously.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface Request {
	
  /**
   * Method that is invoked by the scheduler and does the actual work.
   */
  public void call();

  /**
   * Method that is invoked by the scheduler to see if the request can
   * be executed.  
   * @return boolean true if request can be executed, false otherwise.
   */
  public boolean canRun();
}
