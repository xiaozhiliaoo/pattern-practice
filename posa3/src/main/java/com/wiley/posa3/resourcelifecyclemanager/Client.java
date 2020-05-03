package com.wiley.posa3.resourcelifecyclemanager;

/**
 * Client creates a ResourceLifecycleManager and uses that to acquire,
 * manage and release resources. The program acquires connection
 * objects and then token objects. It then puts the two types of
 * objects into a ResourceGroup and finally releases the entire
 * resource group.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public class Client {

  /**
   * Main driver program
   * @param args command line arguments. None required.
   */
  public static void main (String args[]) {
    
    ResourceLifecycleManager rlm = new ResourceLifecycleManager();
    
    Connection connection = null;
    SecurityToken token = null;

    // Acquire the resources
    connection = (Connection) rlm.acquire(ResourceType.CONNECTION);
    token = (SecurityToken) rlm.acquire(ResourceType.SECURITY_TOKEN);
    ManagedResource resources [] = new ManagedResource [2];
    resources[0] = connection;
    resources[1] = token;

    // Put the resources in a group so they can be managed properly
    ResourceGroup group = rlm.createGroup ("xyz123", resources);
    
    // Use the resources ...
    connection.authenticate (token);

    // ...

    // Release all the resources by releasing the group
    rlm.release (group);
  }
}
