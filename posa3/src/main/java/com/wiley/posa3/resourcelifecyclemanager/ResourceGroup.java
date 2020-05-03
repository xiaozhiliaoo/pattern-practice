package com.wiley.posa3.resourcelifecyclemanager;

import java.util.Iterator;

/**
 * The ResourceGroup associates two or more resources with each
 * other.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public class ResourceGroup {
	
  /**
   * Constructor.
   * @param id the id of the group
   */
  public ResourceGroup (String id) {
    groupID = id;
  }

  /**
   * Get the id of the group
   * @return the id of the group
   */
  public String getID () {
    return groupID;
  }

  /**
   * Add a managed resource to the group.
   * @param resource the managed resource to add to the group.
   * @param type the type of the resource.
   */
  public void add (ManagedResource resource, ResourceType type) {
    // Add resource to group
  }
  
  /**
   * Return an iterator over the collection of resources that this
   * group holds
   * @return Iterator an iterator over the collection of resources that
   * this group holds
   */
  public Iterator iterator () {
    // return iterator over collection of resources
    return null;
  }

  /**
   * Release all the resources contained in this group
   */
  public void release() {
  }	

  private String groupID;
}
