package com.vidya.flagJump;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


/**
 * @author Vidya Sagar Gupta
 */

class JumpToFlagTest {
  @ParameterizedTest
  @MethodSource("stepsMappingWithExpectedJumpCount")
  void testJumps(int k, int j, int expectedJumpCount) {
    int count = JumpToFlag.jumps(k, j);
    assertEquals(expectedJumpCount, count);
  }

  //Steps mapping with expectedJumpCount
  private static Stream<Arguments> stepsMappingWithExpectedJumpCount() {
    return Stream.of(arguments(7, 2, 4), arguments(400000000, 2, 200000000), arguments(3, 3, 1));
  }
}