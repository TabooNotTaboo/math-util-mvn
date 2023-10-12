/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.taboo.mathutil.core.test;

import com.taboo.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
     //test case 1 - verify getFactorial (n=0)
    // steps/Procedures
    // 1. Given n=0
    // 2. call/invoke getFactorial (n = 0)
    //expected result
    // the method must return 1 as the result of 0!= 1
    // status Passed
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {
        assertEquals( 1 , MathUtility.getFactorial(0));
    }
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {
        assertEquals( 1 , MathUtility.getFactorial(1));
    }
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {
        assertEquals( 120 , MathUtility.getFactorial(5));
    }
}
