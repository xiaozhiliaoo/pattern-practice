package com.wiley.posa3.resourcelifecyclemanager;

import java.util.Date;
import com.wiley.posa3.common.Identity;
import com.wiley.posa3.evictor.EvictionInterface;

/**
 * SecurityToken is a resource that implements both ManagedResource
 * and EvictionInteface.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public class SecurityToken implements ManagedResource, EvictionInterface {

  /**
   * Default Constructor
   */
  public SecurityToken() { }

  /**
   * Get the identity of this resource
   * @return The identity of this resource
   */
  public Identity getId () {
    return this.id;
  }

  /**
   * Get the type of resource.
   * @return ResourceType the type of resource, 
   * which is ResourceType.SECURITY_TOKEN;
   */
  public ResourceType type() {
	return ResourceType.SECURITY_TOKEN;
  }

  /**
   * The method isEvictable() is used to determine whether this
   * scurity token is evictable.  
   * @return boolan true if the security token is evictable, false
   * otherwise 
   */
  public boolean isEvictable () {
    // Assume all connections can be evicted
    return true;
  }

  /**
   * The beforeEviction() method serves as a hook method that can be
   * called by the Evictor before it evicts an object.  This gives the
   * security token a chance to release any resources it may have
   * acquired.  
   */
  public void beforeEviction() {
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

  private Identity id;
  private Date lastAccess;
}
