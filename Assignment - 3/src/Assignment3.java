import java.util.HashSet;
import java.util.Set;

public class Assignment3 
{
	public static void main(String[] args)
	{
		Assignment3 a = new Assignment3();
	}
	/**
	 * Write a method to find N numbers which are power of three. e.g. n=4,
	 * return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n) 
	{	
		if(n <= 0) return null;
		int[] result = new int[n];
		result[0] = 1;
		for(int i = 1; i < n; i++)
		{
			result[i] = 3 * result[i-1];
		}		
		return result;
	}

	/**
	 * Given an integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n) 
	{
		if(n == 0) return 0;
		int count = (int)(Math.log10(Math.abs(n))+1);
		return n % count;
	}

	/**
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
	 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4 6
	 */
	public void printNumbers(int n) 
	{
		if(n <= 0) return;
		int temp;
		
		if(n % 2 == 0)
		{
			temp = 0;
			System.out.print(temp + " ");
		}
		else
		{
			temp = 1;
			System.out.print(temp + " ");
		}
		for(int i=1; i < n; i++)
		{
			temp = temp+2;
			System.out.print(temp + " ");
		}
	}

	/**
	 * Given numRows, generate the first numRows of Pascal's triangle. For
	 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
	 * [1,4,6,4,1]
	 */
	public int[][] generatePascalsTriangle(int n) {
		if(n <= 0) return null;
		int[][] result = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			result[i][0] = 1;
			for(int j = 1; j < i; j++)
			{
				result[i][j] = result[i-1][j-1] + result[i-1][j];
			}
			result[i][i] = 1;
		}
		return result;
	}

	/**
	 * Write a function that takes a string as input and reverse only the vowels
	 * of a string. For example: Given s = "hello", return "holle".
	 */
	public String reverseVowels(String s) {
		char[] sArray = s.toCharArray();
		int begin = 0;
		int end = sArray.length - 1;
		char temp;
		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		while(end > begin)
		{
			if(vowels.contains(sArray[begin]) && vowels.contains(sArray[end]))
			{
				temp = sArray[begin];
				sArray[begin] = sArray[end];
				sArray[end] = temp;	
				begin++;
				end--;
			}
			else
			{
				if(!vowels.contains(sArray[begin])) begin++;
				if(!vowels.contains(sArray[end])) end--;
			}
		}
		
		return new String(sArray);
	}

	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {
		int end = str.length() - 1;
		int count = 0;
		while(end >= 0 && str.charAt(end) == ' ')
		{
			end--;
		}
		while(end >= 0 && str.charAt(end) != ' ') 
		{
			end--;
			count++;
		}
		return count;
	}

	/**
	 * Reverse a string by words. Do not use 'split' function. e.g. "I like
	 * soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {
		StringBuilder sb = new StringBuilder();
		int end = -1;
		for(int i=str.length()-1; i>=0; i--)
		{
			 //find the first blank space before a word
			if(str.charAt(i) == ' ')
			{
				if(end >= 0)
				{
					if(sb.length()>0) sb.append(" ");
					sb.append(str.substring(i+1, end+1));
					end = -1;
				}
			}
			
			 //find the last letter of a word
			
			else
			{
				if(end<0)
				{
					end = i;
				}
			}
		}
		//add the first word
		if(end >= 0)
		{
			if(sb.length() > 0) sb.append(" ");
			sb.append(str.substring(0, end+1));
		}
		return sb.toString();
	}

	// Bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many
	 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
	 * changed some characters of the massage. Write a method to count how many
	 * characters were changed. For example, "SOSSOSSOS" might be changed to
	 * "SOSSUSSOP", then your method should return 2. The message was consisted
	 * by "SOS" so its length will be multiple of 3. You could assume the
	 * message only contains upper letter.
	 */
	public int checkMessage(String message) {
		int count = 0;
		for(int i=0; i<message.length()/3; i++)
		{
			if(message.charAt(3*i) != 'S')
			{
				count++;
			}
			if(message.charAt(3*i+1) != 'O')
			{
				count++;
			}
			if(message.charAt(3*i+2) != 'S')
			{
				count++;
			}
		}
		return count;
	}
}