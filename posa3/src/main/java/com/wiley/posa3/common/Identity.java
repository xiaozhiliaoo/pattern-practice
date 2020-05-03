package com.wiley.posa3.common;

/**
 * Interface Identity represents a unique identification for each
 * resource. The concrete implementation can make use of different
 * representations such as String or a complex Object to ensure that
 * the identity is unique.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0
 */
public interface Identity
{
  /**
   * A stringified representation of the resource identity
   * @return String the stringified representation of the resource
   * identity
   */
  public String toString();
}
