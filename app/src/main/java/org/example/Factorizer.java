package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> getPrimeFactors(Integer n) {
    ArrayList<Integer> primeFactors = new ArrayList<>();
    if(n < 2) 
      return primeFactors;
    
    while(n % 2 == 0){
      primeFactors.add(2);
      n /= 2;
    }

    for(int i = 3; i <= Math.sqrt(n); i += 2){ //For odd numbers
      while(n % i == 0){
        primeFactors.add(i);
        n /= i;
      }
    }

    if(n > 2){
      primeFactors.add(n);
    }
    return primeFactors;
  }
}
