package com.wiley.posa3.lazyacquisition;

import java.util.Date;

/**
 * MedicalExam is an interface representing an exam that a patient
 * undergoes. 
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
 */
public interface MedicalExam {
  /**
   * Get the date of this exam
   * @return Date the date of this exam
   */
  public Date getDate();

  /**
   * Get the digitized image for this exam
   * @return Image the digitized image for this exam
   */
  public Image getImage();
}
