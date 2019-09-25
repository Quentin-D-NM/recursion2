package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(factorial(10));
  }

  public static BigInteger factorial(int n) {
//    return n <= 1 ? BigInteger.ONE : factorial(n -1).multiply(BigInteger.valueOf(n));
    BigInteger product = BigInteger.ONE;
    for (int i = 2; i < n; i++) {
      product = product.multiply(BigInteger.valueOf(i));
    }
    return product;
  }
}
