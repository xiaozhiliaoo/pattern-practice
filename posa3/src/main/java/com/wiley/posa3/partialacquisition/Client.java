package com.wiley.posa3.partialacquisition;

/**
 * Client creates a TopologyManager and uses that to fetch the details
 * of all the NEs.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class Client {

  /**
   * Main driver program
   * @param args command line arguments. None required.
   */
  public static void main(String[] args) {     
    TopologyManager topology = new TopologyManager ();
    
    Details details = topology.getDetailsForNE("rootID");
		
    // Display details on the user interface
  }	
}
