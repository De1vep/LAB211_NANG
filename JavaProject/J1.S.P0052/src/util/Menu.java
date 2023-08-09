/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Tu
 */
public class Menu {
    public static void menu(){
        System.out.printf("%34s\n", "Menu");
        System.out.println(
                "==========================================================================\n"
                + "1. Input the information of 11 countries in East Asia\n"
                + "2. Display the information of country you've just input\n"
                + "3. Search the information of country by user-entered name\n"
                + "4. Display the information of countries sorted name in ascending order  \n"
                + "5. Exit \n"
                + "=========================================================================="
        );
    }
    
    public static int getChoice(){
        menu();
        int choice = Validate.getInt(
                "Your choice: ",
                "Number out of bound",
                "Wrong format number",
                1, 5
        );
        return choice;
    }
}
