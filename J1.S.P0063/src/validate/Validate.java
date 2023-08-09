package validate;

import java.util.Scanner;

public class Validate {

    private static final Scanner SC = new Scanner(System.in);

    public static int getInt(
            String messageInfo,
            String messageErrorOutOfRange,
            String messageErrorInvalidNumber,
            int min, int max
    ) {
        while (true) {
            System.out.print(messageInfo);
            String input = SC.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    int number = Integer.parseInt(input);
                    if (number >= min && number <= max) {
                        return number;
                    } else {
                        System.out.println(messageErrorOutOfRange);
                    }

                } catch (Exception e) {
                    System.out.println(messageErrorInvalidNumber);
                }
            }
        }
    }

    public static double getDouble(String messageInfo, double min, double max) throws ArithmeticException, NumberFormatException {
        while (true) {
            System.out.print(messageInfo);
            String input = SC.nextLine().trim();
            double number = 0;
            //kiem tra xem dau vao co bi empty
            if (input.isEmpty()) {
                System.out.println("Input is empty !! Enter again !!");
            } else {
                try {
                    number = Double.parseDouble(input);
                    if (number > min && number <= max) {
                        return number;
                    } else {
                        throw new ArithmeticException("Salary is greater than zero");
                    }

                } catch (NumberFormatException e) {
                    throw new NumberFormatException("You must input digit.");
                } catch (ArithmeticException e) {
                    throw new ArithmeticException("Salary is greater than zero");
                }

            }
        }
    }

    public static String getString(String messageInfo, String messageError, String REGEX) {
        while (true) {
            System.out.print(messageInfo);
            String input = SC.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Error empty");
            } else if (input.matches(REGEX)) {
                return input;
            } else {
                System.out.println(messageError);
            }
        }
    }
}
