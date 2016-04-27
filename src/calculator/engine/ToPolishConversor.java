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
public class ToPolishConversor {
    
    Stack<Element> operators;
    
    public ToPolishConversor(){
        
    }
    
    private int getPriority(Element e){
        if (e.getOperator()=='(') return 0;
        if (e.getOperator()=='+') return 1;
        if (e.getOperator()=='-') return 1;
        if (e.getOperator()=='*') return 2;
        if (e.getOperator()=='/') return 2;
        if (e.getOperator()=='^') return 3;
        if (e.getOperator()=='~') return 4;
        if (e.getOperator()=='#') return 4;
        return 0;
    }
    
    public LinkedList<Element> convert(LinkedList<Element> parenthetic){
        
        LinkedList<Element> polish = new LinkedList<>();
        operators = new Stack<>();
        char op;
        
        while(!parenthetic.isEmpty()){
            
            if (parenthetic.getFirst().isOperator()){
                
                op = parenthetic.getFirst().getOperator();
                
                try{
                
                if (op==')'){
                    while(operators.peek().getOperator()!='('){
                        polish.add(operators.pop());
                        if (operators.isEmpty()) break;
                    }
                    if(!operators.isEmpty()) operators.pop();
                }
                else if (op=='('){
                    operators.push(parenthetic.getFirst());
                }
                else if(op == '+' || op == '-' || op == '*' || op == '/' || op == '^' || op == '~' || op == '#'){
                    while(!operators.isEmpty() && this.getPriority(operators.peek()) >= this.getPriority(parenthetic.getFirst())){
                        polish.add(operators.pop());
                    }
                    operators.push(parenthetic.getFirst());
                }
                
                } catch(Exception e){
                    System.out.println("Invalid expression");
                    
                    polish.clear();
                    Element el = new Element("1");
                    el.setValue(Double.NaN);
                    polish.add(el);
                    return polish;
                }
            }
            else{
                polish.add(parenthetic.getFirst());
            }
            
            parenthetic.removeFirst();
            
        }
        while(!operators.isEmpty()){
            polish.add(operators.pop());
        }
        
        return polish;
    }
}
