package com.wiley.posa3.resourcelifecyclemanager;

import java.util.Date;
import com.wiley.posa3.common.Identity;
import com.wiley.posa3.evictor.EvictionInterface;

/**
 * Connection is a resource that implements both ManagedResource and
 * EvictionInteface. 
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public class Connection implements ManagedResource, EvictionInterface {
	
  /**
   * Authenticate the connection using the security token
   * @param token security token to use for authentication
   */
  public void authenticate(SecurityToken token) {
    // ...
  }
  
  /**
   * Get the type of resource.
   * @return the type of resource, which is ResourceType.CONNECTION
   */
  public ResourceType type() {
    return ResourceType.CONNECTION;
  }

  /**
   * Get the identity of this resource
   * @return The identity of this resource
   */
  public Identity getId () {
    return this.id;
  }

  /**
   * The method isEvictable() is used to determine whether this
   * connection object is evictable.  
   * @return boolean true if the connection is evictable, false
   * otherwise 
   */
  public boolean isEvictable () {
    // Assume all connections can be evicted
    return true;
  }

  /**
   * The beforeEviction() method serves as a hook method that can be
   * called by the Evictor before it evicts an object.  This gives the
   * connection object a chance to release any resources it may have
   * acquired.  
   */
  public void beforeEviction () {
    // Release any other resources and cleanup
    // ...
  }

  /**
   * The info() method is used by the Evictor to extract
   * strategy-specific information from the object, to determine
   * whether or not to evict it.
   * @return Object strategy-specific information 
   */
  public Object info () {
    // Return the date/time of last access that will then be used by
    // the Evictor to determine whether or not to evict us
    return lastAccess;
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

  private boolean consistentState;
  private Date lastAccess;
  private Identity id;
}
