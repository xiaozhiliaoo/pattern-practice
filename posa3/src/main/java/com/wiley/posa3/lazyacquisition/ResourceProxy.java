package com.wiley.posa3.lazyacquisition;

import com.wiley.posa3.common.*;

/**
 * A ResourceProxy intercepts resource acquisitions by the resource
 * user and hands the lazily acquired resources to the resource user.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class ResourceProxy implements Resource {

  /**
   * Get the identity of this resource
   * @return The identity of this resource
   */
  public Identity getId () {
    if (!acquired)
      this.acquireResource ();    
    return resource.getId ();
  }

  /**
   * Some generic method. When this method is invoked, if the actual
   * resource has not been acquired, the proxy first acquires the
   * resource and then invokes the method on that resource.
   */
  public void method1 () { 
    if (!acquired)
      acquireResource ();
    resource.method1 ();
  }

  /**
   * Some generic method. When this method is invoked, if the actual
   * resource has not been acquired, the proxy first acquires the
   * resource and then invokes the method on that resource.
   */
  public void method2 () { 
    if (!acquired)
      acquireResource ();
    resource.method2 ();
  }

  /**
   * Internal method that actually acquires the resource.
   */
  private void acquireResource () { 
    this.resource = new ResourceX ();
  }

  private ResourceX resource;
  private boolean acquired = false;
}


