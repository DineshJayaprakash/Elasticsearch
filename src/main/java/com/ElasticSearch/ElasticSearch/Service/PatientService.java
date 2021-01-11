package com.ElasticSearch.ElasticSearch.Service;

import java.util.List;

import com.ElasticSearch.ElasticSearch.Dto.PatientDto;

/**
 * interface PatientService
 * 
 * 
 * @author dines
 * @created Date 23/12
 * @description crud Operations to perform db related operations
 *
 */
public interface PatientService {
	
	/**
	 * function  savePatient
	 * 
	 * @param myPatient
	 * @return saved Patient Details
	 */
	public PatientDto savePatient(PatientDto myPatient); 
	
	
	/**
	 * function findAllPatients
	 * 
	 * @param none
	 * @return List of Patient Details
	 */
	public List<PatientDto> findAllPatients(); 
	
	
	/**
	 * function findPatientByName
	 * 
	 * @param none
	 * @return returns the Patient Details based on search
	 */
	public List<PatientDto> findPatientByName(String name); 

}
