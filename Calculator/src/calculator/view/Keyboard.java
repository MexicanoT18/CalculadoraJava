/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class Keyboard extends JPanel{
    
    private JButton plusButton = new JButton("+");
    private JButton minusButton = new JButton("-");
    private JButton prodButton = new JButton("*");
    private JButton divButton = new JButton("/");
    private JButton openParenButton = new JButton("(");
    private JButton closeParenButton = new JButton(")");
    private JButton expButton = new JButton("^");
    private JButton clearButton = new JButton("c");
    private JButton backButton = new JButton("<");
    private JButton dotButton = new JButton(".");
    private JButton resButton = new JButton("=");
    private JButton[] numberButton = new JButton[10];
    
    private KeyboardActionListener listener;
    
    private CalculatorGUI gui;
    
    private int TYLE_WIDTH = 60, TYLE_HEIGHT = 60;
    private int KEYBOARD_WIDTH = 6*TYLE_WIDTH, KEYBOARD_HEIGHT = 4*TYLE_HEIGHT;
    
    private Font font;
            
    public void initialize(CalculatorGUI gui, int x, int y){
        
        this.gui = gui;
        
        this.setLayout(null);
        this.setBounds(x, y, KEYBOARD_WIDTH, KEYBOARD_HEIGHT);
        
        listener = new KeyboardActionListener(this);
        
        font = new Font("Arial", Font.BOLD, 40);
        
        for(int i=0; i<10; i++){
            numberButton[i] = new JButton(Integer.toString(i));
            numberButton[i].setBounds(((i-1)%3)*TYLE_WIDTH, ((i-1)/3)*TYLE_HEIGHT, TYLE_WIDTH, TYLE_HEIGHT);
            numberButton[i].setFont(font);
            numberButton[i].addActionListener(listener);
            this.add(numberButton[i]);
        }
        numberButton[0].setBounds(0, 3*TYLE_HEIGHT, 3*TYLE_WIDTH, TYLE_HEIGHT);
        
        openParenButton.setBounds(3*TYLE_WIDTH, 0, TYLE_WIDTH, TYLE_HEIGHT);
        closeParenButton.setBounds(3*TYLE_WIDTH, TYLE_HEIGHT, TYLE_WIDTH, TYLE_HEIGHT);
        expButton.setBounds(3*TYLE_WIDTH, 2*TYLE_HEIGHT, TYLE_WIDTH, TYLE_HEIGHT);
        dotButton.setBounds(3*TYLE_WIDTH, 3*TYLE_HEIGHT, TYLE_WIDTH, TYLE_HEIGHT);
        
        plusButton.setBounds(4*TYLE_WIDTH, 0, TYLE_WIDTH, TYLE_HEIGHT);
        minusButton.setBounds(4*TYLE_WIDTH, TYLE_HEIGHT, TYLE_WIDTH, TYLE_HEIGHT);
        prodButton.setBounds(4*TYLE_WIDTH, 2*TYLE_HEIGHT, TYLE_WIDTH, TYLE_HEIGHT);
        divButton.setBounds(4*TYLE_WIDTH, 3*TYLE_HEIGHT, TYLE_WIDTH, TYLE_HEIGHT);
        
        backButton.setBounds(5*TYLE_WIDTH, 0, TYLE_WIDTH, TYLE_HEIGHT);
        clearButton.setBounds(5*TYLE_WIDTH, TYLE_HEIGHT, TYLE_WIDTH, TYLE_HEIGHT);
        resButton.setBounds(5*TYLE_WIDTH, 2*TYLE_HEIGHT, TYLE_WIDTH, 2*TYLE_HEIGHT);
        
        openParenButton.addActionListener(listener);
        closeParenButton.addActionListener(listener);
        expButton.addActionListener(listener);
        dotButton.addActionListener(listener);
        plusButton.addActionListener(listener);
        minusButton.addActionListener(listener);
        prodButton.addActionListener(listener);
        divButton.addActionListener(listener);
        backButton.addActionListener(listener);
        clearButton.addActionListener(listener);
        resButton.addActionListener(listener);
        
        openParenButton.setFont(font);
        closeParenButton.setFont(font);
        expButton.setFont(font);
        dotButton.setFont(font);
        plusButton.setFont(font);
        minusButton.setFont(font);
        prodButton.setFont(font);
        divButton.setFont(font);
        backButton.setFont(font);
        clearButton.setFont(font);
        resButton.setFont(font);
        
        this.add(openParenButton);
        this.add(closeParenButton);
        this.add(expButton);
        this.add(dotButton);
        this.add(plusButton);
        this.add(minusButton);
        this.add(prodButton);
        this.add(divButton);
        this.add(backButton);
        this.add(clearButton);
        this.add(resButton);
        
    }
    
    public void addString(String str){
        gui.addString(str);
    }
    
}
