package com.vidya.ballBag;

/**
 * Problem statement...
 * In a bag, there are n identical balls (n >= 1) that needs to be removed from the bag. You can either remove one ball or two balls at a time. Write a code that, given n, calculates how many different ways you can remove the balls from the bag.
 * 
 * Example: n = 3, result = 3
 * 1 - 1 - 1
 * 1 - 2  
 * 2 - 1
 * 
 * Example: n = 5, result = 8 
 * 1 - 1 - 1 - 1 - 1
 * 1 - 1 - 1 - 2  
 * 1 - 1 - 2 - 1  
 * 1 - 2 - 1 - 1  
 * 2 - 1 - 1 - 1  
 * 1 - 2 - 2  
 * 2 - 1 - 2  
 * 2 - 2 - 1
 * 
 * ways(n) = ways(n-1) + ways(n-2)
 * 
 */

/**
 * @author Vidya Sagar Gupta 
 * <br />
 * This class contains the method ways that returns the total number of
 * different ways to remove the balls from the bag.
 */
public class BallService {
	/**
	 * @param balls, numbers of balls available in the bag
	 * @return total number of different ways to remove from the bag
	 */
	public static int ways(int balls) {
		switch (balls) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return 2;
		default:
			return ways(balls - 1) + ways(balls - 2);
		}
	}
}