package com.wiley.posa3.pooling;

import java.util.Date;
import com.wiley.posa3.common.*;

/**
 * A ConnectionAdapter class is used for legacy code integration,
 * where it may not be possible to have the resource implement the
 * Resource interface. The ConnectionAdapter class implements the
 * Resource interface and then wraps the actual resource. The context
 * information is also maintained by the ConnectionAdapter class.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class ConnectionAdapter implements Resource
{
  /**
   * Constuctor.
   * @param connection the connection object that we are
   * adapting/wrapping.
   */
  public ConnectionAdapter (Connection connection) {
    this.connection = connection;
  }
	
  /**
   * Constuctor.
   * @param connection the connection object that we are
   * adapting/wrapping.
   * @param id a unique identifier for this connection.
   */
  public ConnectionAdapter (Connection connection, Identity id) {
    this.connection = connection;
    this.id = id;
  }

  /**
   * Get the identity of this resource
   * @return The identity of this resource
   */
  public Identity getId () {
    return id;
  }

  /**
   * Get the connection object
   * @return The connection object
   */
  public Connection getConnection () { 
    return connection; 
  }

  /**
   * Some generic method. 
   */
  public void method1() {
    this.connection.method1();
  }

  /**
   * Some generic method. 
   */
  public void method2() {
    this.connection.method2();
  }

  // Maintain context information to be used for eviction
  private Date lastUsage;
  private boolean currentlyUsed;
  private Connection connection;
  private Identity id;
}
