package com.wiley.posa3.lazyacquisition;

/**
 * Image interface encapsulates the byte data representing an image
 * such as JPEG or GIF.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface Image {
  // ...

  /**
   * Get the image byte data.
   * @return byte[] image byte data
   */
  public byte [] getData();
}
