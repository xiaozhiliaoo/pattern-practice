package com.wiley.posa3.evictor;

import java.util.Date;

/**
 * NetworkElementComponent is a component of a network element. Since
 * each network element component can also be evicted, therefore it
 * also implements the EvictionInterface.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class NetworkElementComponent implements EvictionInterface {

  /**
   * The method isEvictable() is used to determine whether this
   * network element component is evictable.  
   * @return boolan true if the network element component is evictable,
   * false otherwise 
   */
  public boolean isEvictable () {
    // Assume all network element components can be evicted
    return true;
  }

  /**
   * The info() method is used by the Evictor to extract
   * strategy-specific information from the component, to determine
   * whether or not to evict it.
   * @return Object the timestamp corresponding to when this
   * component was last accessed 
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
   * network element component a chance to release any resources it
   * may have acquired.  
   */
  public void beforeEviction() {
    // ...
  }

  private Date lastAccess;
}
