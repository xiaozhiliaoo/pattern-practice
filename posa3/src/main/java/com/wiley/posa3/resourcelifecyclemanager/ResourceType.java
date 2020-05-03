package com.wiley.posa3.resourcelifecyclemanager;

/**
 * ResourceType is an Enum class containing the types of resources
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public final class ResourceType {

  /** SecurityToken resource */
  public static final ResourceType SECURITY_TOKEN = new ResourceType ("SECURITY_TOKEN", 0);

  /** Connection resource */
  public static final ResourceType CONNECTION = new ResourceType ("CONNECTION", 1);

  // ... rest omitted...

  /**
   * Convert to String
   * @return String string representation
   */
  public String toString () { return name; }

  /**
   * Get the int value
   * @return int the int value of the resource type
   */
  public int toValue () { return value; }

  private ResourceType (String n, int v) {
    name = n;
    value = v;
  }

  // The int-value corresponding to the enum.
  private int value;
  
  // The string associated with the enum.
  private String name; 
}
