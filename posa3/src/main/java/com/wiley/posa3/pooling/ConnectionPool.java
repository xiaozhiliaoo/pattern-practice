package com.wiley.posa3.pooling;

import com.wiley.posa3.common.*;

/**
 * ConnectionPool is a concrete implementation of the Pool interface
 * and provides a pool of connecton objects. When a user tries to
 * acquire a connection, the connection object would be fetched from
 * the ConnectionPool. Similarly, when the user releases the
 * connection, it would be returned back to the collection.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public class ConnectionPool implements Pool {

  /**
   * Acquire a connection from the pool.
   * @return Resource a connection from the pool.
   */  
  public Resource acquire () {
    Connection connection = findFreeConnection ();
    if (connection == null) {
      connection = new Connection ();
      connectionPool.add (connection);
    }
    return connection;		
  }
	
  /**
   * Release the connection back to the pool.
   * @param resource the connection that should be put back in the pool.
   */
  public void release (Resource resource) {
    if (resource instanceof Connection)
      this.recycleOrEvictConnection ((Connection) resource);
  }
	
  /**
   * Find a free connection.
   * @return Connection A connection, if available.
   */
  private Connection findFreeConnection () {
    Connection connection = null;
    // Find a free connection from the connectionPool
    // ...
    return connection;
  }
	
  /**
   * Recycles or evicts the connection by possibly storing
   * it in the pool.  
   * @param con The connection to recycle.
   */
  private void recycleOrEvictConnection (Connection con) {
    // ...
  }
	
  // ...
	
  // Maintain a collection of Connection objects
  private java.util.Vector connectionPool;
}
