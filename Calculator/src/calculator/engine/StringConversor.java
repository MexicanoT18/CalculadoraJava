/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.engine;

import java.util.LinkedList;

/**
 *
 * @author Lucas
 */
public class StringConversor {
    
    private LinkedList<Element> list;
    private StringBuilder stringBuilder;
    
    public StringConversor(){
        
    }
    public LinkedList<Element> convert(String str){
        
        list = new LinkedList<>();
        stringBuilder = new StringBuilder(str);
                
        int n=0;
        
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i)<'0' || str.charAt(i)>'9') && str.charAt(i)!='.'){
                
                if (str.charAt(i)=='+'){
                    if (i==0){
                        stringBuilder.setCharAt(i, '#');
                    }
                    else if ((str.charAt(i-1)<'0' || str.charAt(i-1)>'9') && str.charAt(i-1)!='.' && str.charAt(i-1)!=')'){
                        stringBuilder.setCharAt(i, '#');
                    }
                }
                
                if (str.charAt(i)=='-'){
                    if (i==0){
                        stringBuilder.setCharAt(i, '~');
                    }
                    else if ((str.charAt(i-1)<'0' || str.charAt(i-1)>'9') && str.charAt(i-1)!='.' && str.charAt(i-1)!=')'){
                        stringBuilder.setCharAt(i, '~');
                    }
                }
                
                if (i>n){
                    list.add(new Element(stringBuilder.substring(n, i)));
                }
                
                if (str.charAt(i)=='('){
                    if (i>0){
                        if ((str.charAt(i-1)>='0' && str.charAt(i-1)<='9') || str.charAt(i-1)=='.' || str.charAt(i-1)==')'){
                            list.add(new Element("*"));
                        }
                    }
                }
                
                list.add(new Element(stringBuilder.substring(i, i+1)));
                
                if (str.charAt(i)==')'){
                    if (i<str.length()-1){
                        if ((str.charAt(i+1)>='0' && str.charAt(i+1)<='9') || str.charAt(i-1)=='.' || str.charAt(i-1)=='('){
                            list.add(new Element("*"));
                        }
                    }
                }
                
                n=i+1;
            }
        }
        if (str.length()>n){
            list.add(new Element(stringBuilder.substring(n, str.length())));
        }
        
        return list;
    }
}
