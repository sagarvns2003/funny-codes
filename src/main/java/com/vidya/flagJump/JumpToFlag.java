package com.vidya.flagJump;

/**
 *
 */
public class JumpToFlag {

	public static int jumps(int k, int j) {
		int jumps = 0;
		if (0 == (k % j)) {
			jumps = (k / j);
		} else {
			jumps = (k / j) + 1;
		}
		return jumps;
	}
}