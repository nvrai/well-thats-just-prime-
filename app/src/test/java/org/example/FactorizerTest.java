package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FactorizerTest {

    @Test
    void itReturnsAnEmptyListForZero() {
        Factorizer factorizer = new Factorizer();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, factorizer.getPrimeFactors(0));
    }

    @Test
    void itReturnsAnEmptyListForOne() {
        Factorizer factorizer = new Factorizer();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, factorizer.getPrimeFactors(1));
    }

    @Test
    void itReturnsCorrectFactorsForTwo() {
        Factorizer factorizer = new Factorizer();
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, factorizer.getPrimeFactors(2));
    }

    @Test
    void itReturnsCorrectFactorsForCompositeNumber() {
        Factorizer factorizer = new Factorizer();
        List<Integer> expected = Arrays.asList(2, 2, 3);
        assertEquals(expected, factorizer.getPrimeFactors(12));
    }

    @Test
    void itReturnsCorrectFactorsForLargeCompositeNumber() {
        Factorizer factorizer = new Factorizer();
        List<Integer> expected = Arrays.asList(2, 2, 5, 5);
        assertEquals(expected, factorizer.getPrimeFactors(100));
    }

    @Test
    void itReturnsCorrectFactorsForPrimeNumber() {
        Factorizer factorizer = new Factorizer();
        List<Integer> expected = Arrays.asList(97);
        assertEquals(expected, factorizer.getPrimeFactors(97));
    }

    @Test
    void itReturnsCorrectFactorsForNumberWithMultipleSamePrimes() {
        Factorizer factorizer = new Factorizer();
        List<Integer> expected = Arrays.asList(3, 3, 3, 3); 
        assertEquals(expected, factorizer.getPrimeFactors(81));
    }
}
