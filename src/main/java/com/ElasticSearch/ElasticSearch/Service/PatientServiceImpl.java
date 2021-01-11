package com.ElasticSearch.ElasticSearch.Service;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ElasticSearch.ElasticSearch.Dto.PatientDto;
import com.ElasticSearch.ElasticSearch.Model.Patient;
import com.ElasticSearch.ElasticSearch.Repository.PatientRepository;


/**
 * class PatientServiceImpl
 * 
 * 
 * @author dines
 * @created Date 22/12
 * @description used to implement the Patient Service interface
 *
 */
@Service
public class PatientServiceImpl implements PatientService {
	
	private final PatientRepository patientRepository;
	
	private final ModelMapper modelMapper;
	
	@Autowired
	public PatientServiceImpl(PatientRepository patientRepository,ModelMapper modelMapper)
	{
		this.patientRepository = patientRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public PatientDto savePatient(PatientDto myPatient) {
		Patient MyPatient = modelMapper.map(myPatient, Patient.class);
		patientRepository.save(MyPatient);
		return myPatient;
	}

	@Override
	public List<PatientDto> findAllPatients() {
		Iterable<Patient> myPatientsIterableList = patientRepository.findAll();
		List<Patient> myPatientsList = new ArrayList<Patient>();
		myPatientsIterableList.forEach(myPatientsList::add);
		Type listType = new TypeToken<List<PatientDto>>(){}.getType();
		List<PatientDto> myPatientDto = modelMapper.map(myPatientsList, listType);
		return myPatientDto;
	}

	@Override
	public List<PatientDto> findPatientByName(String name) {
		
		List<Patient> MyPatient = patientRepository.findByPatientName(name);
		Type listType = new TypeToken<List<PatientDto>>(){}.getType();
		List<PatientDto> myPatientDto = modelMapper.map(MyPatient, listType);
		return myPatientDto;

	}

}
