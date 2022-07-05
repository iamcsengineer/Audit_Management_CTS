package com.cts.AuditSeverity.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import com.cts.AuditSeverity.fiegnclient.AuthClient;
import com.cts.AuditSeverity.pojo.AuthResponse;

import lombok.extern.slf4j.Slf4j;
/**
 * This class contains test cases for the TokenServiceImpl class.
 */
//@RunWith(SpringRunner.class)
@ContextConfiguration
@Slf4j
@SpringBootTest
public class TokenServiceImplTest {
	
	@InjectMocks
	TokenServiceImpl tokenService;
	@Mock
	AuthClient authClient;
	
	@Mock
	AuthResponse authResponse;
	@Mock
	Environment env;
	@Mock
	ResponseEntity<AuthResponse> entity;
	/**
	 * to check token validity when token is valid
	 */
	@Test
	public void testCheckTokenValidityWhenTokenIsValid() {
		log.info(env.getProperty("string.start"));
		entity = new ResponseEntity<AuthResponse>(new AuthResponse(null, true),HttpStatus.OK);
		when(authClient.getValidity("token")).thenReturn(entity);

		assertEquals(true, tokenService.checkTokenValidity("token"));
		log.info(env.getProperty("string.end"));

	}
	/**
	 * to check token validity when token gives null pointer exception
	 */
	@Test
	public void testCheckTokenValidityWhenTokenNullPointerException() {
		log.info(env.getProperty("string.start"));

		assertThrows(NullPointerException.class,() -> tokenService.checkTokenValidity("token"));
		log.info(env.getProperty("string.end"));

	}
	/**
	 * to check token when token validity is invalid
	 */
	@Test
	public void testCheckTokenValidityWhenTokenIsInvalid() {
		log.info(env.getProperty("string.start"));
		entity = new ResponseEntity<AuthResponse>(new AuthResponse(null,false),HttpStatus.FORBIDDEN);
		when(authClient.getValidity("token")).thenReturn(entity);
		assertEquals(false, tokenService.checkTokenValidity("token"));
		log.info(env.getProperty("string.end"));

	}


}
