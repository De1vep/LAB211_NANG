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
     * Block for user to create object
     */
    private Validate() {
    }

    /**
     * Method to get valid string
     *
     * @param messageInfo notify for user to input string
     * @param errMessage  notify error for user
     * @param errMessage2 notify error for user
     * @param REGEX format string
     * @return string value
     */
    public static String getString(String messageInfo, String errMessage,
            String errMessage2, final String REGEX) {
        while (true) {
            System.out.print(messageInfo);
            String result = SCANNER.nextLine();
            if (result == null) {
                System.out.println(errMessage);
            } else if (result.matches(REGEX)) {
                return result;
            }
            System.out.println(errMessage2);
        }
    }

    /**
     * Method to get valid number
     *
     * @param messageInfo notify for user to input string
     * @param errMessage  notify error for user
     * @param errMessage2 notify number format error
     * @param min minimum value
     * @param max maximum value
     * @return float value
     */
    public static float getFloat(String messageInfo, String errMessage, String errMessage2, float min, float max) {
        while (true) {
            try {
                System.out.print(messageInfo);
                float result = Float.parseFloat(SCANNER.nextLine());
                if (result >= min && result <= max) {
                    return result;
                }
                System.out.println(errMessage);
            } catch (NumberFormatException e) {
                System.out.println(errMessage2);
            }
        }
    }

    public static boolean checkYN(String messageInfo, String errMessage, String errMessage2) {
        while (true) {
            System.out.print(messageInfo);
            String result = SCANNER.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println(errMessage2);
        }
    }
}
