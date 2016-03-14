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
public class DisplayActionListener implements ActionListener{
    
    Display display;
    
    public DisplayActionListener(Display display){
        this.display = display;
    }
    
    public void actionPerformed(ActionEvent event){
        display.calculate();
    }
}
