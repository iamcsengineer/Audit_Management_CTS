package com.cts.AuditSeverity.pojo;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 
 * 	Test class to test AuthResponse 
 *
 */
@SpringBootTest
public class AuthResponseTest {

	private AuthResponse auth;
	
	@BeforeEach
	public void setup() {
		auth = new AuthResponse();
	}
	/**
	 * to test getter and setter
	 */
	@Test
	public void testGetSetUid() {
		auth.setUid("UID");
		assertEquals("UID", auth.getUid());
	}
	/**
	 * to test getter and setter
	 */
	@Test
	public void testValid() {
		auth.setValid(false);
		assertFalse(auth.isValid());
	}
}
