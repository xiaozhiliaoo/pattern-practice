package com.wiley.posa3.resourcelifecyclemanager;

import java.util.Hashtable;
import com.wiley.posa3.common.Resource;
import com.wiley.posa3.pooling.Pool;

/**
 * The ResourceLifecycleManager class provides the primary interface
 * for the RLM pattern. Using this class, one can acquire and release
 * resources of different types. The RLM, makes use of multiple
 * resource pools to manage the lifecycle of resources. If a resource
 * is not found in the appropriate pool, a factory is used to create
 * the resource. Once a resource has been created, it must be added to
 * a resourceGroup by the user to allow it to be properly managed. It
 * is assumed that each resource belongs to at least one group
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public class ResourceLifecycleManager {
	
  /**
   * Default Constructor
   */
  public ResourceLifecycleManager () {
    // Create and set up all the appropriate pools and factories
    // ...
  }
	
  /**
   * This method tries to acquire a resource of the given type. The
   * method first finds the resource pool corresponding to the given
   * type. It tries to fetch the resource from the pool, if
   * available. If a resource is not available in the pool, the method
   * finds the appropriate factory for the resource type and uses it to
   * create the resource. Note that it is up to the factory to be
   * configured with different strategies and policies pertaining to
   * when the resource is actually created/acquired.  Note that the
   * resource must be added to a group by the user for it to be managed
   * by the RLM.
   * @param type the type of resource to acquire
   * @return Resource the acquired resource
   */
  public Resource acquire (ResourceType type) {

	// Fetch the appropriate pool corresponding the resource type. 
	Pool pool = (Pool) resourcePools.get (type);
	if (pool != null) {
		// First check if the pool has any available resources
	  Resource resource = pool.acquire ();
	  if (resource != null)
	return resource;
    
	  // The Resource pool did not have a resource. So try creating
	  // one using the appropriate factory.

	  // Get the factory
	  ResourceFactory factory = (ResourceFactory) resourceFactories.get (type);
	  if (factory != null) {
		return factory.create();
	  }
	  else
	{
	  // Handle error ...
	}
	  }
	else {
		// Handle error... No pool found.
	}    
	return null;
  }

  /**
   * Create a group and add all the resources to that group
   * @param groupID the id to assign to the new group
   * @param resources [] an array of resources to add to the group
   * @return ResrouceGroup the newly created resource group
   */
  public ResourceGroup createGroup (String groupID, ManagedResource resources []) {
	ResourceGroup group = new ResourceGroup (groupID);
	for (int i = 0; i < resources.length; i++) {
	  ManagedResource r = resources[i];
	  group.add (r, r.type ());
	}
	return group;
  }

  /**
   * Add a resource to an existing group.
   * @param resource the resource to add to the group
   * @param group the resource group to which the resouce should be added
   */
  public void addResourceToGroup (ManagedResource resource, ResourceGroup group) {
	group.add (resource, resource.type ());
  }

  /**
   * Release all resources belonging to the ResourceGroup. The RLM
   * internally uses the Coordinator pattern to ensure that either all
   * resources are released or none are. Each resource acts as a
   * participant in the two-phase protocol initiated by the RLM, which
   * acts as the Coordinator
   * @param group the group whose resources should be released.
   @return boolean true if all resources are released, false otherwise
  */
  public boolean release (ResourceGroup group) {
	// Iterate over all resources in the group and release them using
	// two-phase-commit protocol
	// ...
	return true;
  }

  /**
   * Release the resource as well as any dependent resources. The
   * dependent resources are those that belong to the ResourceGroup to
   * which the resource belongs to
   * @param resource the resource that should be released.
   */
  public void release (ManagedResource resource) {
	ResourceGroup group = this.findGroup (resource);
	if (group != null)
	  group.release ();
  }
    
  /**
   * Set the factory for the type of resource
   * @param type the type of the resource
   * @param factory the factory to set
   */
  public void setFactory (ResourceType type, ResourceFactory factory) {
	resourceFactories.put (type, factory);
  }
  
  /** 
   * Set the factory for the type of resource
   * @param resource the resource to find the group for
   * @return ResourceGroup the found resource group
   */
  
  private ResourceGroup findGroup(ManagedResource resource) {	
	// Find the group to which this resource belongs to
	// ..
	return null;
  }

  // Map of resource groups
  private Hashtable resourceGroups;

  // Map of resource factories
  private Hashtable resourceFactories;

  // Hashtable of different resource pools, whose keys are
  // ResourceType and whose values are the actual pools.
  private Hashtable resourcePools;  
}
