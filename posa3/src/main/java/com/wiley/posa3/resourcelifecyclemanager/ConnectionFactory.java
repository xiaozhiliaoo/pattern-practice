package com.wiley.posa3.resourcelifecyclemanager;

import java.util.ArrayList;
import java.util.List;

/**
 * The ConnectionFactory creates new connections based on a configured
 * strategy. It may eagerly acquire several connections, or it may
 * lazily acquire resources.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public class ConnectionFactory implements ResourceFactory {

  /**
   * Default Constructor
   */
  public ConnectionFactory () {
    connections = new ArrayList ();
    for (int i = 0; i < INITIAL_CONNECTIONS; i++) {
      Connection connection = new Connection ();
      connections.add(connection);
    }
  }
	
  /**
   * Create an instance of a managed resource -- in this case a
   * Connection object.
   * @return ManagedResource an instance of a Connection object  
   */
  public ManagedResource create() {
    // return eagerly acquired connections first
    if (!connections.isEmpty())
      return (Connection)connections.remove(0);
    
    Connection connection = new Connection ();
    return connection;
  }	
	
  private List connections;
  private static final int INITIAL_CONNECTIONS = 10; 
}
