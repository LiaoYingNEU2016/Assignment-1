import java.util.Scanner;

class Person {
	int age;
	boolean gender;// false --> male, true --> female

	Person(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
}

public class Assignment2 {
	// Assignment
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year 
	 * Toddler : If the age is less than 3 and greater than 1 
	 * Pre Schooler : If the age is less than 5 and greater than 3 
	 * KG Girl : If the age is greater than 5 and less than 6 and the gender is female 
	 * KG Boy : If the age is greater than 5 and less than 6 and the gender is male
	 */
	public void personType(Person person){
		
		if (person.age < 1)
		{
			System.out.println("Infant");
		}
		else if (person.age < 3)
		{
			System.out.println("Toddler");
		}
		else if (person.age < 5)
		{
			System.out.println("Pre Schooler");
		} 
		else if (person.age < 6 && person.gender == true)
		{
			System.out.println("KG Girl");
		} 
		else if (person.age < 6 && person.gender == false)
		{
			System.out.println("KG Boy");
		}
		else
		{
			System.out.println("UNDEFINED");
		}
	}

	/**
	 * Given an integer N as input, check the following: 
	 * If N is odd, print "Weird". 
	 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird". 
	 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird". 
	 * If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n) {
	    if (n % 2 != 0)
	    {
			System.out.println("Weird");
		}
	    else if (n >= 2 && n <= 5)
		{
			System.out.println("Not Weird");
		} 
		else if (n <= 20)
		{
			System.out.println("Weird");
		}
		else if(n > 20)
		{
			System.out.println("Not Weird");
		}
		else
		{
			System.out.println("UNDEFINED");
		}
	}

	/**
	 * Write a method to determine whether a number is prime
	 */
	public void isPrime(int n) {
	    if (n <= 1)
	    {
			System.out.println("Not Prime");
	    }
	    for (int i=2; i*i<=n; i++)
	    {
	    	if (n % i == 0)
	    	{
	    		System.out.println("Not Prime");
	    	}
	    }
	    System.out.println("Is Prime");
	}



	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 */
	public int[] fibonacciNumber(int n) {
		if(n < 0) return null;
		int[] result = new int[n];
		result[0] = 1;
		if(n == 1) return result;
		result[1] = 1;
		for (int i=2; i<n; i++){
			result[i] = result[i - 1] + result[i - 2];
		}
		return result;
	}

	/**
	 * Write a function that takes a string as input and returns the string reversed. 
	 * Given s = "hello", return "olleh".
	 */
	public static String reverseString(String s) { //the difference with and without static
		char[] sArray = s.toCharArray();
	    int begin=0;
	    int end=sArray.length-1;
	    char temp;
	    while(end>begin){
	        temp = sArray[begin];
	        sArray[begin]=sArray[end];
	        sArray[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(sArray);
	}

	/**
	 * Given an array of nums, write a function to find the largest two integer.
	 */
	public int[] findTheLargestTwo(int[] nums) {
		if(nums.length <= 1) return null;
		int[] result = new int[2];
		if(nums[0] > nums[1])
		{
			result[0] = nums[0];
			result[1] = nums[1];
		}
		else
		{
			result[1] = nums[0];
			result[0] = nums[1];
		}
		for(int i = 2; i < nums.length; i++)
		{
			if(nums[i] > result[0])
			{
				result[1] = result[0];
				result[0] = nums[i];
			}
			else if(nums[i] > result[1])
			{
				result[1] = nums[i];
			}
		}
		return result;
	}

	/**
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. For
	 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
	 * should be [1, 3, 12, 0, 0].
	 */
	public void moveZeroes(int[] nums) {
		for(int zero = 0, nonzero = 0; zero < nums.length && nonzero < nums.length;)
		{
			if(nums[nonzero] == 0)
			{
				nonzero++;
			}
			else if(nums[zero] != 0) 
			{
				zero++; 
				nonzero = zero;
			}
			else
			{
				int temp = nums[zero];
				nums[zero] = nums[nonzero];
				nums[nonzero] = temp;
			}
		}
	}

	// Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the result has only one digit. 
	 * For example: Given n = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		int cur = n;
		while(cur >= 10)
		{
			cur = 0;
			while(n > 0)
			{
				cur += (n % 10);
				n = n / 10;
			}
			n = cur;
		}		
		return cur;
	}

	/**
	 * Write a program to check whether a given number is an ugly number. 
	 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes another prime factor 7. 
	 * Note that 1 is typically treated as an ugly number.
	 */
	public boolean isUgly(int n) {
		if(n <= 0) return false;
		while(n % 2 == 0)
		{
			n = n/2;
		}
		while(n % 3 == 0)
		{
			n = n/3;
		}
		while(n % 5 == 0)
		{
			n = n/5;
		}
		if(n == 1) return true;
			else return false;
	}
}