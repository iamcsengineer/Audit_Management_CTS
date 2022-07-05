package com.cognizant.exception;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 *
 *
 */

//@RunWith(SpringRunner.class)
@ContextConfiguration @Slf4j
@SpringBootTest
public class LoginFailedExceptionTest {

	/**
	 * to test the LoginFailedException Exception
	 * 
	 */
	@Mock
	Environment env;
	@Test
	public void testInvalidAuthorizationException() {
		log.info(env.getProperty("string.start"));
		LoginFailedException loginFailedException = new LoginFailedException(env.getProperty("string.not.valid"));
		assertNotNull(loginFailedException);
		log.info(env.getProperty("string.end"));

	}


}
