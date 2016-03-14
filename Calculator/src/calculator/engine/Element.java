/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.engine;

/**
 *
 * @author Lucas
 */
public class Element {
    private boolean isOp;
    private double value;
    private char operator;
    
    public Element(String str){
        
        if (str.charAt(0)>='0' && str.charAt(0)<='9'){
            isOp = false;
            value = Double.parseDouble(str);
        }
        else{
            isOp = true;
            operator = str.charAt(0);
        }
    }
    public boolean isOperator(){
        return isOp;
    }
    public double getValue(){
        return value;
    }
    public char getOperator(){
        return operator;
    }
    public void setValue(double x){
        isOp = false;
        value = x;
    }
    public void setOperator(char c){
        isOp = true;
        operator = c;
    }
}
