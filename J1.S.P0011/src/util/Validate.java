package util;

import java.util.Scanner;

public class Validate {

    private static final Scanner SC = new Scanner(System.in);

    public static int getInt(
            String messageInfo,
            String errorMessageOutOfRange,
            String errorMessageFormatNumber,
            int min,
            int max
    ) {
        int num;
        do {
            try {
                System.out.println(messageInfo);
                num = Integer.parseInt(SC.nextLine());
                if (num >= min && num <= max) {
                    return num;
                }
                System.out.println(errorMessageOutOfRange);
            } catch (NumberFormatException e) {
                System.out.println(errorMessageFormatNumber);
            }
        } while (true);
    }

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
}