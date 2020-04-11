package com.vidya.ballBag;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.vidya.ballBag.BallService;

/**
 * @author Vidya Sagar Gupta <br />
 *         This class is parameterized Junit class to test the method 'ways' by
 *         passing different input parameters.
 */
@RunWith(value = Parameterized.class)
public class BallServiceTest {

	@Parameter(value = 0)
	public int balls;

	@Parameter(value = 1)
	public int expectedWays;

	@Parameters(name = "{index}: differentWaysToRemove_{0}_BallsFromBag = {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 5 }, { 5, 8 }, { 6, 13 } });
	}

	@Test
	public void differentWaysToRemoveFromBagTest() {
		assertThat(BallService.ways(balls), is(expectedWays));
	}
}