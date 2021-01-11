package com.ElasticSearch.ElasticSearch.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ElasticSearch.ElasticSearch.Dto.PatientDto;
import com.ElasticSearch.ElasticSearch.Service.PatientService;


/**
 * class PatientELK
 * 
 * 
 * @author dines
 * @Created Date 23/12
 * @description used to map the end point to store the datas into Db 
 *
 */
@RestController
@RequestMapping("patients")
public class PatientELK {
	/**
	 * Bean of the Patient Service
	 */
	private final PatientService patientService;
	
	/**
	 * Parameterized Constructor
	 * 
	 * @param patientService
	 * @description used to add the dependency Injection
	 */
	@Autowired
	public PatientELK(PatientService patientService) {
		this.patientService = patientService;
	}
	
	/**
	 * function savePatient
	 * 
	 * @param myPatient
	 * @return saved Patient 
	 */
	@PostMapping("")
	public PatientDto savePatient(@RequestBody PatientDto myPatient) {
		return patientService.savePatient(myPatient);
	}
	
	/**
	 * function savePatient
	 * 
	 * @param myPatient
	 * @return List of All Patients 
	 */
	@GetMapping("")
	public List<PatientDto> getAllPatients() {
		return patientService.findAllPatients();
	}
	
	/**
	 * function getPatientByPatientName
	 * 
	 * @param myPatient
	 * @return List of Patients by search
	 */
	@GetMapping("/{patientName}")
	public List<PatientDto> getPatientByPatientName(@PathVariable String patientName) {
		return patientService.findPatientByName(patientName);
	}


}
