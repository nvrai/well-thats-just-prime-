package org.example;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Factorizer factorizer = new Factorizer();
    int[] testNumbers = {20, 5, 100, 13, 4, 0};
    for(int number : testNumbers){ // Using for loop to test all different uses, like < 2, odd numbers, etc
      ArrayList<Integer> factors = factorizer.getPrimeFactors(number); 
      System.out.println("Prime Factors of " + number + ": " + factors);
    }
  }
}
