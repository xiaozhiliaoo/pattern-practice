package com.wiley.posa3.lazyacquisition;

import java.util.List;

/**
 * PatientRecord is an interface representing all the information for
 * a patient
 *
 * @author Michael Kircher
 * @author Prashant Jain
 * @version 1.0 
*/
public interface PatientRecord
{
  /**
   * Get the name of the patient
   * @return String the name of the patient
   */
  public String getName();

  /**
   * Get the address of the patient
   * @return String the address of the patient
   */
  public String getAddress();

  /**
   * Get a list of medical exams for this patient
   * @return List a list of medical exams for this patient
   */
  public List getMedicalExams();
}
