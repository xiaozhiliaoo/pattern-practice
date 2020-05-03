package com.wiley.posa3.evictor;

/**
 * EvictionInterface is an interface that will be implemented by all
 * objects that can be evicted.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface EvictionInterface {
  
  /**
   * The method isEvictable() is used to determine whether this object
   * is evictable.
   * @return boolan true if the object is evictable, false otherwise 
   */
  public boolean isEvictable();

  /**
   * The info() method is used by the Evictor to extract
   * strategy-specific information from the object, to determine
   * whether or not to evict it.
   * @return Object strategy-specific information
   */
  public Object info();

  /**
   * The beforeEviction() method serves as a hook method that can be
   * called by the Evictor before it evicts an object.  This gives the
   * object a chance to release any resources it may have acquired. 
   */
  public void beforeEviction();

}
