package com.wiley.posa3.lazyacquisition;

import com.wiley.posa3.common.*;

/**
 * ResourceX is a resource whose acquisition is intercepted by the
 * ResourceProxy and is acquired only when the user tries to access
 * the resource.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class ResourceX implements Resource {

  /**
   * Get the identity of this resource
   * @return The identity of this resource
   */
  public Identity getId () {
    return this.id;
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

  private Identity id;
}
