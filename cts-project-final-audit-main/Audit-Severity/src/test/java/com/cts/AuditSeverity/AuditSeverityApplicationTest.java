package com.cts.AuditSeverity;

//import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * 
 * Test class for AuditSeverityApplication
 *
 */
//@RunWith(SpringRunner.class)
@ContextConfiguration
@SpringBootTest
public class AuditSeverityApplicationTest {

	@Mock
	AuditSeverityApplication application;

	@Test
	public void contextLoads() {
		assertNotNull(application);
	}

}
