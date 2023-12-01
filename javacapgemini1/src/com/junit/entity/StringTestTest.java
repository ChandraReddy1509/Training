package com.junit.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringTestTest {

	StringTest str;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		str= new StringTest();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testConcatenateString() {
		assertEquals("helloworld",str.concatenateString("hello", "world"));
	}

	@Test
	final void testCheckLength() {
		assertEquals(10,str.checkLength("helloworld"));
	}

	@Test
	final void testReverseString() {
		assertEquals("leh",str.reverseString("hel"));
	}

}
