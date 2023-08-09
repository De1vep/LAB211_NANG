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
     * Method to get valid number
     *
     * @param messageInfo notify for user to enter number
     * @param errMessage  notify error number out of bound
     * @param errFormat   error number format
     * @param min         minimum value
     * @param max         maximum value
     * @return integer value
     */
    public static int getInt(String messageInfo, String errMessage,
            String errFormat, int min, int max) {
        while (true) {
            try {
                System.out.println(messageInfo);
                int result = Integer.parseInt(SCANNER.nextLine());
                if (result >= min && result <= max) {
                    return result;
                }
                System.out.println(errMessage);
            } catch (NumberFormatException e) {
                System.out.println(errFormat);
            }
        }
    }

}
