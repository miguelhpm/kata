package org.mglhpm.kata.codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HammingCode {
	
	//URL: https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e/train/java

	public String encode(String text) {
		return text.chars().mapToObj(i -> encodeAsciiToBit(i).chars().mapToObj(j -> repeatCharacter(String.valueOf((char) j)) ).collect(Collectors.joining(""))).collect(Collectors.joining(""));
	}

	public String decode(String bits) {
		return Stream.of(bits.split("(?<=\\G........................)")).map(i -> cleanBits(i)).map(j -> extractAscii(j)).map(k -> decodeBitToAscii(k).toString()).collect(Collectors.joining(""));
		
	}

	private String cleanBits(String encodeBits) {
		return Stream.of(encodeBits.split("(?<=\\G...)")).map(c -> generateBits(c)).collect(Collectors.joining(""));
	}

	private String generateBits(String string) {
		Integer number = Integer.parseInt(string, 2);
		switch (number) {
		case 0:
		case 1:
		case 2:
		case 4:
			return "000";
		case 3:
		case 5:
		case 6:
		case 7:
			return "111";
		default:
			break;
		}
		return null;
	}

	private String encodeAsciiToBit(int ascii) {
		return String.format("%1$8s", Integer.toBinaryString(ascii)).replace(' ', '0');
	}

	private String repeatCharacter(String character) {
		return IntStream.range(0, 3).mapToObj(i -> character).collect(Collectors.joining(""));
	}
	
	private String extractAscii(String characterSpecial) {
		return IntStream.range(0, characterSpecial.length()).filter(x -> x % 3 == 0).mapToObj(i -> String.valueOf( characterSpecial.charAt(i) ) ).collect(Collectors.joining(""));
	}

	private Character decodeBitToAscii(String string) {
		return new Character((char) Integer.parseInt(string, 2));
	}

}
