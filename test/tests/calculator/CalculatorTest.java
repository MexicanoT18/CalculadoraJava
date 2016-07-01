/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas
 */
public class CalculatorTest {
    
    public CalculatorTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    /**
     * Test of calculate method, of class Calculator.
     */
    @Test
    public void testCalculate() {
        System.out.println("Testing calculate function.");
        
        Calculator instance = new Calculator();
        
        int numTestCases;
        String[] testCases, answers;
        
        numTestCases = 23;
        testCases = new String[numTestCases];
        answers = new String[numTestCases];
        
        //Check the addition of two integer numbers.
        testCases[0] = "1+2"; answers[0] = "3";
        
        //heck the addition of two negative numbers.
        testCases[1] = "-1+-2.5"; answers[1] = "-3.5";
        
        //Check the addition of one positive and one negative number.
        testCases[2] = "-1.5+2"; answers[2] = "0.5";
        
        //Check the subtraction of two integer numbers.
        testCases[3] = "1-2"; answers[3] = "-1";
        
        //Check the subtraction of two negative numbers.
        testCases[4] = "-1--2.5"; answers[4] = "1.5";
        
        //Check the subtraction of one negative and one positive number.
        testCases[5] = "1.1-4.5"; answers[5] = "-3.4";
        
        //Check the multiplication of two integer numbers.
        testCases[6] = "5*6"; answers[6] = "30";
        
        //Check the multiplication of two negative numbers.
        testCases[7] = "-2.2*-5"; answers[7] = "11";
        
        //Check the multiplication of one negative and one positive number.
        testCases[8] = "3*-5.5"; answers[8] = "-16.5";
        
        //Check the division of two integer numbers.
        testCases[9] = "120/15"; answers[9] = "8";
        
        //Check the division of two negative numbers.
        testCases[10] = "-5.5/-1.1"; answers[10] = "5";
        
        //Check the division of one positive number and one integer number.
        testCases[11] = "1.5/2"; answers[11] = "0.75";
        
        //Check the division of a number by zero.
        testCases[12] = "9/0"; answers[12] = "Infinity";
        
        //Check the division of a number by negative number.
        testCases[13] = "3/-6"; answers[13] = "-0.5";
        
        //Check the division of zero by any number
        testCases[14] = "0/9"; answers[14] = "0";
        
        //Check the exponentiation of two integer numbers.
        testCases[15] = "2^10"; answers[15] = "1024";
        
        //Check the exponentiation of two negative numbers.
        testCases[16] = "-2^-5"; answers[16] = "-0.03125";
        
        //Check the exponentiation of one positive number and one integer number.
        testCases[17] = "1.5^2"; answers[17] = "2.25";
        
        //Check the exponentiation of a number by zero.
        testCases[18] = "10^0"; answers[18] = "1";
        
        //Check the exponentiation of a number by negative number.
        testCases[19] = "2.5^-2"; answers[19] = "0.16";
        
        //Check the exponentiation of zero by a positive number.
        testCases[20] = "0^9"; answers[20] = "0";
        
        //Check the exponentiation of zero by a negative number.
        testCases[21] = "0^-2"; answers[21] = "Infinity";
        
        //Long mathematical expression
        testCases[22] = "(11/10)*3*7+(3+21)-5^(0.5+1.5)"; answers[22] = "22.1";
        
        for(int i=0; i<numTestCases; i++){
            assertEquals(instance.calculate(testCases[i]), answers[i]);
            //System.out.println(instance.calculate(testCases[i]) + " | " + answers[i]);
        }
    }

    /**
     * Test of removeZeros method, of class Calculator.
     */
    @Test
    public void testRemoveZeros() {
        
        System.out.println("Testing removeZeros function.");
        
        Calculator instance = new Calculator();
        /*
        System.out.println(instance.removeZeros("123") + " | " + "123");
        System.out.println(instance.removeZeros("123.00") + " | " + "123");
        System.out.println(instance.removeZeros("1230") + " | " + "1230");
        System.out.println(instance.removeZeros("1230.0") + " | " + "1230");
        */
        
        assertEquals(instance.removeZeros("123") , "123");
        assertEquals(instance.removeZeros("123.00") , "123");
        assertEquals(instance.removeZeros("1230") , "1230");
        assertEquals(instance.removeZeros("1230.0") , "1230");
        
    }
    
}
