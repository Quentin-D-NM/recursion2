package edu.cnm.deepdive;

import java.math.BigInteger;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(fibonacci(10));
  }

  public static BigInteger fibonacci(int n) {
    BigInteger fibnum = BigInteger.ZERO;
    if (n <= 0) {

    }else if (n == 1) {
      fibnum = BigInteger.ONE;
    } else {
      fibnum = fibonacci(n - 1).add(fibonacci(n - 2));
    }
    return fibnum;
  }
}
