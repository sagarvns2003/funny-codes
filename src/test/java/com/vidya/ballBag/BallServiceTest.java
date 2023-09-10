package com.vidya.ballBag;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author Vidya Sagar Gupta <br>
 *     This class is parameterized Junit class to test the method 'ways' by passing different input
 *     parameters.
 */

class BallServiceTest {
  
  @ParameterizedTest
  @MethodSource("argumentMapping")
  void testExpectedWays(int balls, int expectedWays) {
    assertEquals(expectedWays, BallService.ways(balls));
  }

  //Steps mapping with expectedJumpCount
  private static Stream<Arguments> argumentMapping() {
    return Stream.of(arguments(0, 0), arguments(1,1), arguments(2,2), arguments(3,3), arguments(4,5), arguments(5,8));
  }

}