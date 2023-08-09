/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bo.ManageEastAsiaCountries;
import util.Menu;

/**
 *
 * @author Tu
 */
public class Main {
    public static void main(String[] args) {
        ManageEastAsiaCountries me = new ManageEastAsiaCountries();
        while(true){
            switch(Menu.getChoice()){
                case 1:
                    me.add();
                    break;
                    
                case 2:
                    me.display();
                    break;
                    
                case 3:
                    me.search();
                    break; 
                    
                case 4:
                    me.displaySortedInfo();
                    break;
                    
                case 5:
                    return;
            }
        }
    }
}
