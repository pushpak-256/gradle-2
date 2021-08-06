package com.abc.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class calculatorTest {
 calculator c;
	@BeforeEach
	void setUp() throws Exception {
  c= new calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	c=null;
	}

	@Test
	void testAddition() {
     assertEquals(10, c.addition(5, 5));
	}

	@Test
	void testSubraction() {
	     assertEquals(0, c.subraction(5, 5));
	}

}
