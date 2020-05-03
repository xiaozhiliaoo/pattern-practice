package com.wiley.posa3.resourcelifecyclemanager;

import java.util.ArrayList;
import java.util.List;
import com.wiley.posa3.pooling.Pool;
import com.wiley.posa3.common.Resource;

/**
 * The ConnectionPool class implements the Pooling pattern by
 * providing an implementation of the Pool interface.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public class ConnectionPool implements Pool {
	
  /**
   * Default Constructor
   */
  public ConnectionPool () {
    connections = new ArrayList ();
  }

  /**
   * Release a managed resource (that is, a connection) to the pool.
   * @param resource the resource (connection) to put into the pool
   */
  public void release (Resource resource) {
    Connection connection = (Connection) resource;
    // Put the connection back into the pool
  }
	
  /**
   * Acquire a managed resource (that is, a connection) from the pool.
   * @return ManagedResource the resource (connection) to acquire from
   * the pool
   */
  public Resource acquire () {		
    // look up a connection from the pool
    Connection connection = (Connection) connections.remove (0);
    
    return connection;
  }
	
  private List connections;
}
