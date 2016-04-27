/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.view;

import calculator.Calculator;
import javax.swing.JFrame;

/**
 *
 * @author Lucas
 */
public class CalculatorGUI {
    
    Calculator cal;
    String displayString = new String();
    
    Display display;
    Keyboard keyboard;
    
    JFrame window;
    
    int HEIGHT = 339;
    int WIDTH = 366;
    
    public CalculatorGUI(Calculator cal){
        
        this.cal = cal;
        
        window = new JFrame();
        window.setBounds(0, 0, WIDTH, HEIGHT);
        
        keyboard = new Keyboard();
        keyboard.initialize(this, 0, 70);
        window.add(keyboard);
        
        display = new Display();
        display.initialize(this, 0, 0);
        window.add(display);
        
        window.setTitle("Calculadora");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setSize(WIDTH, HEIGHT);
        window.setVisible(true);
    }
    
    public void addString(String str){
        
        if (str.equals("<")){
            display.backString();
        }
        else if (str.equals("=")){
            if (!display.getOnDisplay().equals("")){
                display.replaceString(cal.calculate(display.getOnDisplay()));
            }
        }
        else if (str.equals("c")){
            display.clearString();
        }
        else{
            display.addString(str);
        }
        
    }
    
}
