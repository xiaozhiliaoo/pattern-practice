package com.wiley.posa3.caching;

/**
 * ResourceNotFound is an exception that is thrown when a resource is
 * being looked for is not found.
*/
public class ResourceNotFound extends Exception {
  
  /**
   * Constructor. 
   * @param reason The reason why the resource was not found.
   */
	public ResourceNotFound (String reason) {
		super (reason);
	}
}
