package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0);
  }

  @Test
  public void testSiguma() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.siguma(1, 10));
  }

  @Test
  public void testEvenNumber_oddNumber() {
    Calculate calculate = new Calculate();
    int[] expected = { 30, 25 };
    assertArrayEquals(expected, calculate.evenNumber_oddNumber(1, 10));
  }
}
