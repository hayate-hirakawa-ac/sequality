package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int siguma(int x, int y) {
    int s = 0;
    for (int i = x; i <= y; i++) {
      s += i;
    }
    return s;
  }

  public int[] evenNumber_oddNumber(int x, int y) {
    int even = 0;
    int odd = 0;
    int data[] = new int[2];
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        even += i;
      } else {
        odd += i;
      }
      data[0] = even;
      data[1] = odd;
    }
    return data;
  }
}
