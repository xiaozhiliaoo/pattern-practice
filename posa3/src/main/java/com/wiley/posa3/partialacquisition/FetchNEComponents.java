package com.wiley.posa3.partialacquisition;

/**
 * The FetchNEComponents class contains the main logic for retrieving
 * the details of the components of the network element. It implements
 * the Request interface, so that it can be scheduled by the
 * Scheduler. 
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class FetchNEComponents implements Request {

  /**
   * Constructor.
   * @param neId the Id of the Network element whose components need to
   * be fetched.
   */
  public FetchNEComponents (String neId) {
    // Cache necessary information
  }
	
  /**
   * Method that is invoked by the scheduler and does the actual work.
   */
  public void call () { 
    // Fetch NE subcomponents using Partial Acquisition
  }
	
  /**
   * Method that is invoked by the scheduler to see if the request can
   * be executed.  
   * @return boolean true if request can be executed, false otherwise.
   */
  public boolean canRun () {
    // ...
    return true;
  }
}
