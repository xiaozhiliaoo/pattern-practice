package com.wiley.posa3.resourcelifecyclemanager;

/**
 * ResourceFactory is an interface that is implemented by all the
 * resource factories.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public interface ResourceFactory {

  /**
   * Create an instance of a managed resource.
   * @return ManagedResource an instance of a managed resource
   */
  public ManagedResource create();

}
