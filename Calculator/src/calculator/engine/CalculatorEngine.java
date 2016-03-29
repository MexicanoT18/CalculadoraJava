/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.engine;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Lucas
 */
public class CalculatorEngine {
    
    Stack<Element> values;
    
    public CalculatorEngine(){
        
    }
    
    private void operation(char c){
        
        double a, b;
        Element el = new Element("1");
        
        try{
        
            if (c=='~'){
                a = values.pop().getValue();
                el.setValue(-a);
            }
            else if (c=='#'){
                a = values.pop().getValue();
                el.setValue(a);
            }
            else{
                b = values.pop().getValue();
                a = values.pop().getValue();

                if (c=='*') el.setValue(a*b);
                if (c=='/') el.setValue(a/b);
                if (c=='+') el.setValue(a+b);
                if (c=='-') el.setValue(a-b);
                if (c=='^') el.setValue(Math.pow(a,b));
            }
        
        } catch (Exception e){
            System.out.println("Invalid expression");
        }
        
        values.push(el);
    }
    
    public double calculate(LinkedList<Element> polish){
        
        values = new Stack<>();
        
        double ans = 0.0;
        
        try{
        
        while(!polish.isEmpty()){
            if (polish.getFirst().isOperator()){
                this.operation(polish.getFirst().getOperator());
            }
            else{
                values.push(polish.getFirst());
            }
            polish.removeFirst();
        }
        
        ans = values.peek().getValue();
        
        } catch(Exception e){
            System.out.println("Invalid expression");
            
            ans = Double.NaN;
        }
        
        return ans;
    }
    
}
