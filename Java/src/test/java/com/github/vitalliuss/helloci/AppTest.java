package com.github.vitalliuss.helloci;


import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 * @author vitali_shulha
 */
public class AppTest {

	@Test
	public void testShoudBePassed() {
		assertTrue(true);
	}

	/*@Test
	public void testShouldBeFailed() {
		assertTrue(false);
	}*/

	@Ignore("Not implemented yet")
	@Test
	public void testShouldBeSKipped() {
		assertTrue(true);
	}
	
	@Test
	public void testAnotherMethod() {
		App.doNothing();
	}
	
	@Test
	public void testAnotherClass() {
		EmptyClass.emptyMethod();
	}
	
	@Test
	public void secondTestShoudBePassed() {
		assertTrue(true);
	}
	
	@Test
	public void thirdTestShoudBePassed() {
		assertTrue(true);
	}
	
	@Test
	public void fourthTestShoudBePassed() {
		assertTrue(true);
	}
	
	@Test
	public void fifthTestShoudBePassed() {
		assertTrue(true);
	}
	
	@Test
	public void sixthTestShoudBePassed() {
		assertTrue(true);
	}
}
