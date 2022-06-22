package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }




    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1,1);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation() {
        standardCalculator.subtract(1, 1);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(0, actualResult);
    }
    
    @Test
    @DisplayName("Test Multiplication")
    void testMultiply() {
        standardCalculator.multiply(2, 2);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(4, actualResult);
    }
    
    @Test
    @DisplayName("Test Division")
    void testDivision() {
        standardCalculator.divide(4, 2);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(2, actualResult);
    }

    }

