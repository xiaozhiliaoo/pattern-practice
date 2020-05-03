package com.wiley.posa3.caching;

import com.wiley.posa3.common.*;

/**
 * Cache is the base interface for any type of caching implementation.
 * It provides an API that allows acquisition and release of these
 * resources.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public interface Cache {

  /**
   * Put the released resource into the cache so that it can be
   * acquired later.
   * @param resource the resource that has been released and is to
   * be put into the cache
   */
  public void release(Resource resource);

  /**
   * Acquire the resource from the cache corresponding to id.
   * @param id the identity of the resource that needs to be
   * acquired. 
   * @return Resource corresponding to the Identity that should be in
   * the cache.
   * @exception ResourceNotFound is thrown if the resource
   * corresponding to Identity was not found in the cache
   */
  public Resource acquire(Identity id) throws ResourceNotFound;
}
