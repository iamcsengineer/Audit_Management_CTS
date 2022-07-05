package com.cognizant.model;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author POD5
 * @version 1.8
 * @apiNote This class is used to hold the login credentials which will be sent
 *          by the user in the request body for getting the token
 *
 */
import lombok.extern.slf4j.Slf4j;

//@RunWith(SpringRunner.class)
@ContextConfiguration @Slf4j
@SpringBootTest
public class UserCredentialsTest {

	UserCredentials loginCredential = new UserCredentials();
	/**
	 * to test the all param constructor of UserLoginCredential
	 */
	@Mock
	Environment env;
	@Test
	public void testUserLoginCredentialAllConstructor() {
		log.info(env.getProperty("string.start"));
		UserCredentials credential = new UserCredentials("abc", "abc");
		assertEquals(credential.getUserId(), "abc");
		log.info(env.getProperty("string.end"));
	}
	/**
	 * to test the getter setter of Uid
	 */
	@Test
	public void testGetUid() {
		log.info(env.getProperty("string.start"));
		loginCredential.setUserId("abc");
		assertEquals(loginCredential.getUserId(), "abc");
		log.info(env.getProperty("string.end"));
	}
	/**
	 * to test the getter setter of Password
	 */
	@Test
	public void testUserPassword() {
		log.info(env.getProperty("string.start"));
		loginCredential.setPassword("abc");
		assertEquals(loginCredential.getPassword(), "abc");
		log.info(env.getProperty("string.end"));
	}
	/**
	 * to test the getter setter of toString()
	 */
	@Test
	public void testoString() {
		log.info(env.getProperty("string.start"));
		String string = loginCredential.toString();
		assertEquals(loginCredential.toString(), string);
		log.info(env.getProperty("string.end"));
	}

}
