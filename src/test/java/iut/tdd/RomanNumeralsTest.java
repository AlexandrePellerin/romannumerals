package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
		//Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_V_when_5(){
		//Given
		String input="5";
		String expected="X";
		RomanNumerals romanNumeral=new RomanNumerals();
		//When
		String actual=romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_1_when_I () {
		//Given
		String input = "I";
		String expected = "1";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_5_when_V () {
		//Given
		String input = "V";
		String expected = "5";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_13_when_XIII(){
		//Given
		String input = "XII";
		String expected = "13";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	public void should_return_XIII_when_13(){
		//Given
		String input="5";
		String expected="X";
		RomanNumerals romanNumeral=new RomanNumerals();
		//When
		String actual=romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
}
