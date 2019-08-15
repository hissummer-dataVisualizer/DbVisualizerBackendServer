package com.rrd.coresystem.testasist.mockplatform.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rrd.coresystem.testasist.SpringBootTestBase;
import com.rrd.coresystem.testasist.mockplatform.MockRule;

public class MockRuleMongoRepositoryTest extends SpringBootTestBase{
	
	@Autowired
	MockRuleMongoRepository mockRuleMongoRepository;

	@Test
	public void test() {
		

		MockRule rule = MockRule.builder().uri("/testnewmockrule").host("*").build();
		mockRuleMongoRepository.insert(rule);
		
	}

	
	@Test
	public void update() {
		
		MockRule rule = MockRule.builder().uri("/testnewmockrule").host("*").build();
		mockRuleMongoRepository.insert(rule);
		
	}
	
}
