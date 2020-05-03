package com.wiley.posa3.resourcelifecyclemanager;

import com.wiley.posa3.common.Resource;

/**
 * The ManagedResrouce extends the Resource interface by adding one
 * more method that returns the type of the resource.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface ManagedResource extends Resource {

  /**
   * Return the type of the resource.
   * @return ResourceType the type of the resource
   */
  public ResourceType type();
}
