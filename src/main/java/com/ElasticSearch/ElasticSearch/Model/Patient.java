package com.ElasticSearch.ElasticSearch.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * class Patient
 * 
 * 
 * @author dines
 * @Created Date 23/12
 * @description used to add the patient details into Db
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "patientsdetails",indexStoreType="patient",shards = 2)
public class Patient {
	
	/**
	 * Id of the Patient
	 */
	@Id
	private int id;
	
	/**
	 * Name of the Patient
	 */
	private String patientName;
	
	/**
	 * Adress of the Patient
	 */
	private String adress;
	
	/**
	 * Mobile no of the Patient
	 */
	private String mobile;
	
	

}
