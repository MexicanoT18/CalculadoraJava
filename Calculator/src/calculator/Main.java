/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Main {
    
    private static Calculator cal;
    
    public static void main(String[] args) {
        
        cal = new Calculator();
        String str = new String("(11/10)*3*7+(3+21)-5^(0.5+1.5)");
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            str = sc.nextLine();
            System.out.println(cal.calculate(str));
        }     
        
    }
}
