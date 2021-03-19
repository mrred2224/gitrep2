package org.all;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FrameWorkThree {

	@BeforeClass
	public static void one() {
		System.out.println("one");

	}@Before
	public void two() {
		System.out.println("two");

	}
@Test
	public void three() {
		System.out.println("three");
}
@Ignore
@Test
		public void tc0() {
			System.out.println("AA");

		}
@Test
		public void tc2() {
		System.out.println("BB");	

		}
@Test
		public void tc1() {
			
System.out.println("CC");
		}

	@After
	public void four() {
		System.out.println("four");
	}


	@AfterClass
	public static void five() {
		System.out.println("five");
		

	}
	

