package com.chaitanya.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chaitanya.core.service.PaymentService;
import com.chaitanya.core.service.PaymentServiceImpl;

@SpringBootTest
class CoreApplicationTests {
	
	@Autowired
	private PaymentServiceImpl pay;
		
	

	@Test
	void testDependencyInjectionTest() {
		assertNotNull(pay.getDao());
		//assertEquals(50, pay.calculateSum(40, 10));
		
	}
	
	@Test
	void testSumCalculation() {
		//assertNotNull(pay.getDao());
		assertEquals(36, pay.calculateSum(9, 27));
		
	}

}
