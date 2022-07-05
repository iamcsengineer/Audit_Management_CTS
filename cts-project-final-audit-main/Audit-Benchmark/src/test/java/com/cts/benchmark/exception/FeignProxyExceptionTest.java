package com.cts.benchmark.exception;



import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * 
 * This class test the FeignProxyException class
 * 
 *
 */
//@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest
public class FeignProxyExceptionTest{
	
	
	
	@Mock
	FeignProxyException feignProxyException;
	
	@Test
	public void contextLoads() {
		assertNotNull(feignProxyException);
	}
	
	@Test 
	public void testConstructor() {
		
		assertNotNull(new FeignProxyException());
	}

}
