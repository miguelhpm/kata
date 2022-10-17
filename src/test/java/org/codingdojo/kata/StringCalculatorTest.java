package org.codingdojo.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
	
	//https://codingdojo.org/kata/StringCalculator/
	
	@Test
	public void test01() {
		
		String result = StringCalculator.add("");
		assertEquals("Al enviar una cadena vacia debe responder '0'.", "0", result);
		
	}

	@Test
	public void test02() {

		String result = StringCalculator.add("1");
		assertEquals("Al enviar la cadena '1' deber retornar la cadena '1'.", "1", result);

	}

	@Test
	public void test03() {

		String result = StringCalculator.add("1,2");
		assertEquals("Al enviar la cadena '1,2' deber retornar la cadena '3'.", "3", result);

	}

	@Test
	public void test04() {

		String result = StringCalculator.add("1,2,3");
		assertEquals("Al enviar la cadena '1,2,3' deber retornar la cadena '6'.", "6", result);

	}

}
