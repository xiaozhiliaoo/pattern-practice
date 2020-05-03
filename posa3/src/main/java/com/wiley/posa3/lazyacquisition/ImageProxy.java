package com.wiley.posa3.lazyacquisition;

/**
 * ImageProxy encapsulates the byte data representing an image
 * such as JPEG or GIF.
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public class ImageProxy implements Image
{  
  /**
   * Constructor. 
   * @param dbWrapper the DBWrapper instance
   * @param imageId the ID of the image for which this is the proxy
   */
  public ImageProxy (DBWrapper dbWrapper, int imageId) {
    this.dbWrapper = dbWrapper;
    this.imageId = imageId;
  }

  /**
   * Get the image byte data.
   * @return byte[] image byte data
   */
  public byte [] getData () {
    if (data == null) {
      // Fetch the image lazily using the stored ID
      data = this.dbWrapper.getImage (imageId);
    }
    return data;
  }
  
  private byte data[];
  private DBWrapper dbWrapper;
  private int imageId;
}
