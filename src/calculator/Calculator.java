/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import calculator.view.CalculatorGUI;
import calculator.engine.CalculatorEngine;
import calculator.engine.StringConversor;
import calculator.engine.ToPolishConversor;
import calculator.engine.Element;
import java.util.LinkedList;

/**
 *
 * @author Lucas
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    
    private StringConversor stringConversor;
    private ToPolishConversor toPolishConversor;
    private CalculatorEngine calculatorEngine;
    private LinkedList<Element> parenthetic, polish;
    private CalculatorGUI calculatorGUI;
    
    public Calculator(){
        
        stringConversor = new StringConversor();
        toPolishConversor = new ToPolishConversor();
        calculatorEngine = new CalculatorEngine();
        calculatorGUI = new CalculatorGUI(this);
        
    }
    
    public String calculate(String str){
        
        parenthetic = stringConversor.convert(str);
        polish = toPolishConversor.convert(parenthetic);
        return removeZeros(Double.toString(calculatorEngine.calculate(polish)));
        
    }
    
    public String removeZeros(String str){
        int n = str.length();
        
        int pointPos = 0, zeroPos = n-1;
        while(pointPos < n && str.charAt(pointPos)!='.') pointPos++;
        while(zeroPos > pointPos && str.charAt(zeroPos)=='0') zeroPos--;
        
        if (str.charAt(zeroPos)=='.') zeroPos--;
        return str.substring(0, zeroPos+1);
    }
    
}
