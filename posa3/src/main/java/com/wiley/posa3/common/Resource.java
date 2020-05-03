package com.wiley.posa3.common;

/**
 * Resource is the base interface for all types of resource. It
 * provides several methods that must be implemented by all types of
 * resources. 
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0
 */
public interface Resource {

  /**
   * Get the identity of this resource
   * @return The identity of this resource
   */
  public Identity getId();

  /**
   * Some generic method.
   */
  public void method1();

  /**
   * Some generic method.
   */
  public void method2();

}


