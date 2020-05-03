package com.wiley.posa3.pooling;

import java.util.Date;
import com.wiley.posa3.common.*;

/**
 * A Connection is a resource that when no longer needed is returned
 * to a Pool.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class Connection implements Resource
{
  /**
   * Default constuctor.
   */
  public Connection () {
  // ...
  }

  /**
   * Constuctor.
   * @param id a unique identifier for this connection.
   */
  public Connection (Identity id) {
    this.id = id;
  // ...
  }

  /**
   * Get the identity of this resource
   * @return The identity of this resource
   */
  public Identity getId () {
    return id;
  }

   /**
   * Some generic method. 
   */
  public void method1() {
    // ...
  }

  /**
   * Some generic method. 
   */
  public void method2() {
    // ...
  }

  // ...
	
  // Maintain context information to be used for eviction
  private Date lastUsage;
  private boolean currentlyUsed;
  private Identity id;
}
