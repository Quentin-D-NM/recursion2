package edu.cnm.deepdive;

public class Palindromes {

  public static boolean isPalindrome(String input) {
    return input.length() <= 1 || (input.charAt(0) == input.charAt(input.length() -1))
        && isPalindrome(input.substring(1, input.length() - 1));
  }
}
