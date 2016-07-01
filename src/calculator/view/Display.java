/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.view;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lucas
 */
public class Display extends JPanel{
    
    JTextField textField = new JTextField();
    
    Font font;
    
    DisplayActionListener listener;
    
    private CalculatorGUI gui;
    
    int DISPLAY_HEIGHT = 70, DISPLAY_WIDTH = 360;
    
    public void initialize(CalculatorGUI gui, int x, int y){
        
        this.gui = gui;
        
        this.setLayout(null);
        this.setBounds(x, y, DISPLAY_WIDTH, DISPLAY_HEIGHT);
        
        listener = new DisplayActionListener(this);
        
        font = new Font("Arial", Font.BOLD, 40);
        textField.setFont(font);
        
        textField.setBounds(0, 0, DISPLAY_WIDTH, DISPLAY_HEIGHT);
        textField.setText("");
        this.add(textField);
        
    }
    
    public void addString(String str){
        textField.setText(textField.getText().concat(str));
    }
    
    public void replaceString(String str){
        textField.setText(str);
    }
    
    public void clearString(){
        textField.setText("");
    }
    
    public void backString(){
        if (textField.getText().length()>0)
            textField.setText(textField.getText().substring(0, textField.getText().length()-1));
    }
    
    public String getOnDisplay(){
        return textField.getText();
    }
    
    public void calculate(){
        gui.addString("=");
    }
    
}
