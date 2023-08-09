package utility;


import java.util.*;
import constant.IConstant;

public class Validate {

    private static final Scanner SC = new Scanner(System.in);

    /**
     * Returns an input string from the keyboard
     *
     * @param messageInfo messageInfo
     * @param messageError messageError when input incorrect format
     * @param REGEX the pattern to test string is valid or not
     * @return the string value
     */
    public static String getString(
            String messageInfo,
            String messageError,
            final String REGEX
    ) {
        do {
            System.out.println(messageInfo);
            String str = SC.nextLine();
            if (str.matches(REGEX)) {
                return str;
            }
            System.out.println(messageError);
        } while (true);
    }
    
    /**
     * Returns an input integer from the keyboard
     *
     * @param messageInfo messageInfo
     * @param messageErrorOutOfRange messageErrorOutOfRange when input number
     * out of range
     * @param messageErrorInvalidNumber messageErrorInvalidNumber when input
     * invalid number
     * @param min minimum limit value
     * @param max maximum limit value
     * @return the valid integer number
     */
    public static int getInt(
            String messageInfo,
            String messageErrorOutOfRange,
            String messageErrorInvalidNumber,
            int min, int max
    ) {
        do {
            try {
                System.out.println(messageInfo);
                int number = Integer.parseInt(SC.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println(messageErrorOutOfRange);
            } catch (NumberFormatException ex) {
                System.out.println(messageErrorInvalidNumber);
            }
        } while (true);
    }

    /**
     * Returns an input double from the keyboard
     *
     * @param messageInfo messageInfo
     * @param messageErrorOutOfRange messageErrorOutOfRange when input number
     * out of range
     * @param messageErrorInvalidNumber messageErrorInvalidNumber when input
     * invalid number
     * @param min minimum limit value
     * @param max maximum limit value
     * @return the valid double number
     */
    public static double getDouble(
            String messageInfo,
            String messageErrorOutOfRange,
            String messageErrorInvalidNumber,
            double min, double max
    ) {
        do {
            try {
                String input = getString(
                        messageInfo, 
                        "Only accept multiples of 0.5 as input",
                        IConstant.REGEX_TIME);
                double number = Double.parseDouble(input);
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println(messageErrorOutOfRange);
            } catch (NumberFormatException ex) {
                System.out.println(messageErrorInvalidNumber);
            }
        } while (true);
    }
}
