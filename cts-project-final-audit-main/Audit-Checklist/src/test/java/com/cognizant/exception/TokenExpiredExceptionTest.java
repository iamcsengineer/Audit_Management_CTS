package com.cognizant.exception;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//import org.junit.Test;
import  org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


//@RunWith(SpringRunner.class)
@ContextConfiguration 
@SpringBootTest
public class TokenExpiredExceptionTest {

	@Mock
	TokenExpiredException handler;
	
	@Test
	public void contextLoads() {
		assertNotNull(handler);
	}
	
	@Test 
	public void testConstructor() {
		assertNotNull(new TokenExpiredException("Exception"));
	}
}
