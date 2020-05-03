package com.wiley.posa3.partialacquisition;

/**
 * TopologyManager is responsile for managing the network topology and
 * is the primary interface to be used by clients for fetching NE
 * details.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class TopologyManager
{
  /**
   * Retrieve the details for a specific network element.
   * @param neId the ID of the network element whose details need to be
   * fetched.
   * @return Details the details of the network element
   */
  public Details getDetailsForNE (String neId) {
    Details details = new Details();
    
    // Fetch NE details either from physical network
    // element or from database ...
    
    // ... but defer fetching details of NE subcomponents
    // until later. Create a request to be inserted into
    // the Active Object message queue by the Scheduler.
    
    FetchNEComponents request = new FetchNEComponents (neId);
    
    // Now insert the request into the Scheduler so that
    // it can be processed at a later stage.
    scheduler.insert (request);
    
    return details;
  }
	
  private Scheduler scheduler;
}




