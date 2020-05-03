package com.wiley.posa3.evictor;

import java.util.Date;

/**
 * NetworkElement is a resource that can be evicted and therefore
 * implements the EvictionInterface.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class NetworkElement implements EvictionInterface {

  /**
   * The method isEvictable() is used to determine whether this
   * network element is evictable.  
   * @return boolan true if the network element is evictable, false
   * otherwise 
   */
  public boolean isEvictable () {
    // Assume all NEs can be evicted
    return true;
  }

  /**
   * The info() method is used by the Evictor to extract
   * strategy-specific information from the object, to determine
   * whether or not to evict it.
   * @return Object the timestamp corresponding to when this network
   * element was last accessed
   */
  public Object info () {
    // Return the date/time of last access that
    // will then be used by the Evictor to determine
    // whether or not to evict us
    return lastAccess;
  }

  /**
   * The beforeEviction() method serves as a hook method that can be
   * called by the Evictor before it evicts an object.  This gives the
   * network element a chance to release any resources it may have
   * acquired.  
   */
  public void beforeEviction () {
    // First, release all resources currently held
    
    // Now, call beforeEviction() on all network element
    // components to give them a chance to release
    // necessary resources
    for (int i = 0; i < components.length; i++) {
      components[i].beforeEviction ();
    }
  }     

  // ... other network element operations ...

  private NetworkElementComponent [] components;
  private Date lastAccess;
}

