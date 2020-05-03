package com.wiley.posa3.pooling;

import com.wiley.posa3.common.*;

/**
 * Pool provides an interface for the acquisition and release of *
 * resources by resource users. An implementation of the Pool
 * interface would maintain a collection of Resource objects. When a
 * user tries to acquire a resource, the resource would be fetched
 * from this collection.  Similarly, when the user releases the
 * resource, it would be returned back to the collection.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface Pool
{
  /**
   * Acquire a resource from the pool.
   * @return Resource a resource from the pool.
   */  
  public Resource acquire();

  /**
   * Release the resource back to the pool.
   * @param resource the resource that should be put back in the pool.
   */
  public void release(Resource resource);
}
