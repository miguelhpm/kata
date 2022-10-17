package org.codingdojo.kata;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class StringCalculator {

	public static String add(String numbersToAdd) {
		String resultToString = "0";
		AtomicReference<Integer> result = new AtomicReference<>(0);
		if (numbersToAdd.isEmpty()) {
			return resultToString;
		}
		if(numbersToAdd.length()==1) {
			return numbersToAdd;
		}
		String[] numbersAtString = numbersToAdd.split(",");
		Arrays.stream(numbersAtString).forEach(numberString -> result.set(result.get() + Integer.valueOf(numberString)));
		resultToString = result.toString();
		return resultToString;
	}

	/*
	* Test03
	* public static String add(String numbersToAdd) {
		String resultToString = "0";
		Integer result = 0;
		if (numbersToAdd.isEmpty()) {
			return resultToString;
		}
		if(numbersToAdd.length()==1) {
			return numbersToAdd;
		}
		Integer numberA = Integer.valueOf(numbersToAdd.substring(0, numbersToAdd.indexOf(",")));
		Integer numberB = Integer.valueOf(numbersToAdd.substring(numbersToAdd.indexOf(",")+1, numbersToAdd.length()));
		result = numberA + numberB;
		resultToString = result.toString();
		return resultToString;
	}
	* */

}
