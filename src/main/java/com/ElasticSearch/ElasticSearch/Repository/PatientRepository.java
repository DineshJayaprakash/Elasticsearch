package com.ElasticSearch.ElasticSearch.Repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.ElasticSearch.ElasticSearch.Model.Patient;

/**
 * interface PatientRepository
 * 
 * @author dines
 * @Created Date 23/12
 * @description used to Add details and fetch the details in Db
 *
 */
public interface PatientRepository extends ElasticsearchRepository<Patient, Long>{
	
	List<Patient> findByPatientName(String name);

}
