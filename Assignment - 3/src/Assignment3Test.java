import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class Assignment3Test extends Assignment3 {

	@Test
	/*
	 * Test for findPowerOfThree
	 */
	public void FindPowerOfThreeTest() 
	{
		Assignment3 a = new Assignment3();
		/*
		 * Test for basic scenario
		 */
		int[] one = a.findPowerOfThree(4);
		int[] expectedOne = {1,3,9,27};
		Assert.assertArrayEquals(expectedOne, one);
		/*
		 * Test for negative value
		 */
		int[] two = a.findPowerOfThree(-2);
		int[] expectedTwo = null;
		Assert.assertArrayEquals(expectedTwo, two);
	}
	
	@Test
	/*
	 * Test for countDigits
	 */
	public void CountDigitsTest() 
	{
		Assignment3 a = new Assignment3();
		/*
		 * Test for basic scenario
		 */
		assertEquals(1, a.countDigits(100));
		/*
		 * Test for a negative value
		 */
		assertEquals(-1, a.countDigits(-100));
		/*
		 * Test for zero
		 */
		assertEquals(0, a.countDigits(0));		
	}
	
	@Test
	/*
	 * Test for printNumbers
	 */	
	public void PrintNumbersTest()
	{
		Assignment3 a = new Assignment3();
		/*
		 * Prepare to capture output
		 */
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
		/*
		 * Test for odd number
		 */
		a.printNumbers(3);
		String expectedOutputOddNumer = "1 3 5 ";
		assertEquals(expectedOutputOddNumer, os.toString());
		/*
		 * Test for even number
		 */
		PrintStream originalOut2 = System.out;
		OutputStream os2 = new ByteArrayOutputStream();
		PrintStream ps2 = new PrintStream(os2);
		System.setOut(ps2);
		a.printNumbers(2);
		String expectedOutputEvenNumer = "0 2 ";
		assertEquals(expectedOutputEvenNumer, os2.toString());
		/*
		 * Test for zero
		 */
		PrintStream originalOut3 = System.out;
		OutputStream os3 = new ByteArrayOutputStream();
		PrintStream ps3 = new PrintStream(os3);
		System.setOut(ps3);
		a.printNumbers(0);
		String expectedOutputZero = "";
		assertEquals(expectedOutputZero, os3.toString());
		System.setOut(originalOut);
		System.setOut(originalOut2);
		System.setOut(originalOut3);
	}

	@Test
	/*
	 * Test for generatePascalsTriangle
	 */
	public void GeneratePascalsTriangleTest()
	{
		Assignment3 a = new Assignment3();
		/*
		 * Test for basic scenario
		 */
		int[][] expectedOutput = new int[5][5];
		expectedOutput[0] = new int[]{1,0,0,0,0};
		expectedOutput[1]=new int[]{1,1,0,0,0};
		expectedOutput[2]=new int[]{1,2,1,0,0};
		expectedOutput[3]=new int[]{1,3,3,1,0};
		expectedOutput[4]=new int[]{1,4,6,4,1};
		assertEquals(expectedOutput, a.generatePascalsTriangle(5));
		/*
		 * Test for negative value
		 */
		assertEquals(null,a.generatePascalsTriangle(-3));
	}
	
	@Test
	/*
	 * Test for reverseVowels
	 */
	public void ReverseVowels()
	{
		Assignment3 a = new Assignment3();
		/*
		 * Test for basic word
		 */
		String basicScenario = "vowel";
		String expectedReversedWord = "vewol";
		String output = a.reverseVowels("vowel");
		Assert.assertEquals(expectedReversedWord, output);
		/*
		 * Test for word with upper-class letter
		 */
		String upperclassWord = "vOwel";
		String expectedReversedWordUpoerClass = "vewOl";
		String output2 = a.reverseVowels("vOwel");
		Assert.assertEquals(expectedReversedWordUpoerClass, output2);
	}
	
	@Test
	/*
	 * Test for lengthOfLastWord
	 */
	public void LengthOfLastWord() 
	{
		Assignment3 a = new Assignment3();
		/*
		 * Test for basic scenario
		 */
		assertEquals(3, a.lengthOfLastWord("I love NEU"));
		/*
		 * Test for a sentence ended with a lot of space
		 */
		assertEquals(3, a.lengthOfLastWord("I love NEU  "));
	}
	
	@Test
	/*
	 * Test for reverseString2
	 */
	public void ReverseString2()
	{
		Assignment3 a = new Assignment3();
		/*
		 * Test for basic word
		 */
		String basicScenario = "I love NEU";
		String expectedReversedString = "NEU love I";
		String output = a.reverseString2("I love NEU");
		Assert.assertEquals(expectedReversedString,output);
		/*
		 * Test for sentence ended with a lot of space 
		 */
		String reversedStringEndWithSpace = "I love NEU  ";
		String expectedReversedStringEndWithSpace = "NEU love I";
		String output2 = a.reverseString2("I love NEU  ");
		Assert.assertEquals(expectedReversedStringEndWithSpace, output2);
	}
	
	
	@Test
	/*
	 * Test for checkMessage
	 */
	public void CheckMessage() 
	{
		Assignment3 a = new Assignment3();
		/*
		 * Test for basic scenario
		 */
		assertEquals(2, a.checkMessage("SOSSUSSOP"));
	}
	
}
