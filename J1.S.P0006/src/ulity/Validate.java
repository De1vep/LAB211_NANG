package ulity;

import java.util.Scanner;

public class Validate {

    private static final Scanner SC = new Scanner(System.in);
    public static final String REGEX_NUMBER = "^[0-9]+$";

    public static int getInt(String messageInfo, String messageError, final String REGEX) throws ArithmeticException, NumberFormatException {
        while (true) {
            System.out.print(messageInfo);
            int str = Integer.parseInt(SC.nextLine());
            if (Integer.toString(str).matches(REGEX_NUMBER)) {
                return str;
            } else {
                System.out.println(messageError);
            }
        }
    }
}
