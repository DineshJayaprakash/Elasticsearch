package com.ElasticSearch.ElasticSearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ElasticSearch.ElasticSearch.Dto.PatientDto;
import com.ElasticSearch.ElasticSearch.Model.Patient;
import com.ElasticSearch.ElasticSearch.Repository.PatientRepository;
import com.ElasticSearch.ElasticSearch.Service.PatientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {

	@Autowired
	private PatientService patientService;
	
	@MockBean
	private PatientRepository patientRepository;
	
	@Test
	public void testSavePatient() {
		Patient myPatient = new Patient(1,"dinesh","dindigul","8825524284");
		PatientDto myPatientDto = new PatientDto(1,"dinesh","dindigul","8825524284");
		Mockito.when(patientRepository.save(myPatient)).thenReturn(myPatient);
		assertEquals(myPatientDto,patientService.savePatient(myPatientDto));
	}
}
