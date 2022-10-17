package org.mglhpm.kata.codewars;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ImmortalTest {
	
	//URL: https://www.codewars.com/kata/59568be9cc15b57637000054/train/java

	@Test
	public void example() {
		assertEquals(5, Immortal.elderAge(8, 5, 1, 100));
		assertEquals(224, Immortal.elderAge(8, 8, 0, 100007));
		assertEquals(11925, Immortal.elderAge(25, 31, 0, 100007));
		assertEquals(4323, Immortal.elderAge(5, 45, 3, 1000007));
		assertEquals(1586, Immortal.elderAge(31, 39, 7, 2345));
		assertEquals(808451, Immortal.elderAge(545, 435, 342, 1000007));
		// You need to run this test very quickly before attempting the actual tests :)
		assertEquals(5456283, Immortal.elderAge(28827050410L, 35165045587L, 7109602, 13719506));
	}

}