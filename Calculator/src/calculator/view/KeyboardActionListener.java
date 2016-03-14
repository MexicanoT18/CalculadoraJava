/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lucas
 */
public class KeyboardActionListener implements ActionListener{
    
    Keyboard keyboard;
    
    public KeyboardActionListener(Keyboard keyboard){
        
        this.keyboard = keyboard;
        
    }
    
    public void actionPerformed(ActionEvent event){
        keyboard.addString(event.getActionCommand());
    }
    
}
