package com.cg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {
	Calculator c=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("start");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("done");
	}

	@BeforeEach
	void setUp() throws Exception {
		c=new Calculator();
		System.out.println("Running Test");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Test over");
	}

	@Test
	final void testAdd() {
	assertEquals(30, c.add(10, 20));
	}

}
