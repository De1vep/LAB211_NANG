/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author Tu
 */
public class Validate {
    
    private final static Scanner SCANNER = new Scanner(System.in);

    /**
     * Block user to create object
     */
    private Validate() {
    }

    /**
     * Returns on input string from keyboard
     * 
     * @param messageInfo notify for user to enter value
     * @param errFormat   message error when input wrong format
     * @param REGEX       the pattern to test string is valid or not
     * @return the valid string value
     */
    public static String getString(String messageInfo, String errFormat,
            final String REGEX){
        do{
            System.out.print(messageInfo);
            String result = SCANNER.nextLine().trim();
            if(result.matches(REGEX)){
                return result;
            }
            System.out.println(errFormat);
        }while(true);
    }
    
    /**
     * Returns on input double number from keyboard
     * 
     * @param messageInfo   notify for user to enter value
     * @param errOutOfBound message error when input less than minimum value
     * @param errOutOfRange message error when input greater than maximum value
     * @param errFormat     message error when input wrong format
     * @param min           minimum limit value
     * @param max           maximum limit value
     * @return the valid double value
     */
    public static double getDouble(String messageInfo, String errOutOfBound,
            String errOutOfRange, String errFormat, double min, double max){
        do{
            try{
                System.out.print(messageInfo);
                double result = Double.parseDouble(SCANNER.nextLine().trim());
                if(result >= min && result <= max){
                    return result;
                }
                if(result < min){
                    System.out.println(errOutOfBound);
                }
                if(result > max){
                    System.out.println(errOutOfRange);
                }
            }catch(NumberFormatException e){
                System.out.println(errFormat);
            }
        }while(true);
    }
}
