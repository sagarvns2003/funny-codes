package com.vidya.flagJump;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Vidya Sagar Gupta
 */
@RunWith(value = Parameterized.class)
public class JumpToFlagTest {

	@Parameter(value = 0)
	public int k;

	@Parameter(value = 1)
	public int j;

	@Parameter(value = 2)
	public int expectedJumpCount;

	@Parameters(name = "{index}: JumpCount = {2}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 7, 2, 4 }, { 400000000, 2, 200000000 }, { 3, 3, 1 } });
	}

	@Test
	public void jumpTest() {
		int count = JumpToFlag.jumps(k, j);
		assertThat(count, is(expectedJumpCount));
	}
}