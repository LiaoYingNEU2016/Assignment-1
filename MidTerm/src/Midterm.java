import java.util.*;

public class Midterm {
	
	/**
	 * Say you have Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
	 * This is case sensitive, for example "Aa" is not considered a palindrome here.
	 */
	public int longestPalindrome(String s)
	{
		if ( s == null || s.length() == 0)
			return 0;
		if ( s.length() == 1)
			return 1;
		
		int result = 0;
		int[] counter = new int[128];
		
		for (char c : s.toCharArray())
		{
			if ( counter[c] == 0)
			{
				counter[c] = 1;
			}
			else
			{
				counter[c] = 0;
				result += 2;
			}
		}
		
		return Math.min(result+1, s.length());
		
	}

	/**
	 * An array for which the ith element is the price of a given stock on day i. 
	 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). 
	 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
	 */
	public int maxProfit(int[] prices)
	{
		if (prices == null || prices.length <= 1) return 0;
		
		int profit = 0;
		
		for(int i = 0; i < prices.length-1; i++)
		{
			if (prices[i]<prices[i+1])
			{
				profit += prices[i+1] - prices[i];
			}
		}
		
		return profit;
	}

	/**
	 * Given a column title as appear in an Excel sheet, return its corresponding column number.
	 * For example: A -> 1, B -> 2, … Z -> 26, AA -> 27, AB -> 28
	 */
	public int titleToNumber(String title) 
	{
		int result = 0;
		
		if ( title == null || title.length() == 0 ) return result;
		
		for (int i= 0; i<title.length(); i++)
		{
			result = result*26 + ( title.charAt(i) - 'A' +1 );
		}
		return result;
	}
	
	/**
	 * Given an unsorted array of integers(no duplicates), count the pairs in which there are two numbers and they add up to a specific target number. 
	 * The array is given as follows:
	 * For example:
	 * Input: nums={2, 7, 11, 15}, target=9, there is one pair {2,7} so return: 1
	 * Input: nums={2, 7, 11, 15}, target=10, there is no pair so return 0.
	 * Input: nums={1,5,2,4,3,6}, target=7, there is are three pairs {1,6}, {2,5}, {3,4} so return 3.
	 * Note: {1,2} and {2,1} are regarded as the same pair.
	 */
	// O(N) time
	public int twoSum(int[] nums, int target)
	{
		int result = 0;
		
		if(nums == null || nums.length == 0) return result;
		
		Set<Integer> m = new HashSet<Integer>();
		
		for(int i=0; i<nums.length; i++ )
		{
			m.add(nums[i]);
			if(m.contains(target-nums[i]) && (target-nums[i]) != nums[i])
				result++;
		}
		
		return result;
	}
}
