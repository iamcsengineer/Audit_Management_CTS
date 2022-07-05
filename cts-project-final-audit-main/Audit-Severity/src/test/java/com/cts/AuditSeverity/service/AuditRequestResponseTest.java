package com.cts.AuditSeverity.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

import com.cts.AuditSeverity.model.AuditResponseModel;
import com.cts.AuditSeverity.pojo.AuditResponse;
import com.cts.AuditSeverity.repository.RequestRepository;
import com.cts.AuditSeverity.repository.ResponseRepository;

import lombok.extern.slf4j.Slf4j;
/**
 * 
 * 			Test class to test AuditRequestResponse
 *
 */
//@RunWith(SpringRunner.class)
@ContextConfiguration @Slf4j
@SpringBootTest
public class AuditRequestResponseTest {

	@Mock
	RequestRepository requestRepository;
	@Mock
	ResponseRepository responseRepository;
	
	@InjectMocks
	AuditRequestResponse requestResponse;
	
	@Mock
	Environment env;
	
	
	/**
	 * 
	 */
	@Test
	public void saveResponseTest() {
		log.info(env.getProperty("string.start"));
		AuditResponse response = new AuditResponse("GREEN","No action required");
		AuditResponseModel detailModel = new AuditResponseModel(response.getProjectExecutionStatus(),response.getRemedialActionDuration());
		when(responseRepository.save(detailModel)).thenReturn(detailModel);
		assertEquals(detailModel, requestResponse.saveResponse(response));
		log.info(env.getProperty("string.end"));
	}
	
}
