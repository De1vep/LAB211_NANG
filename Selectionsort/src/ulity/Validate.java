package ulity;

import java.util.Scanner;

public class Validate {
        private static final Scanner SC = new Scanner(System.in);
        public static final String REGEX_NUMBER = "^[0-9]+$";
        
         public static int getInt(String messageInfo, String messageError, final String REGEX) throws ArithmeticException, NumberFormatException {
        while (true) {
            try {
                int input = Integer.parseInt(SC.nextLine());
                if (input < 0) {
                    System.out.print(messageInfo);
                } else {
                    return input;
                }
            } catch (NumberFormatException ex) {
                System.out.print(messageError);
            }
        }
    }

}
