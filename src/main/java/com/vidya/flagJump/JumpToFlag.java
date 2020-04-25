package com.vidya.flagJump;

/**
 * Hello world!
 *
 */
public class JumpToFlag {

	public static void main(String[] args) throws Exception {

		System.out.println(jumps(7, 2));
		System.out.println(jumps(400000000, 2));
		System.out.println(jumps(3, 3));

		
	}


	public static int jumps(int k, int j) {
		int jumps = 0;
		if (0 == (k % j)) {
			jumps = (k / j);
		} else { // if (1 == (k % j)) {
			jumps = (k / j) + 1;
		}
		return jumps;
	}

}
