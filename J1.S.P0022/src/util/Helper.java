package util;

import constant.IConstant;
import java.util.Calendar;

public class Helper {

    /**
     * don't let anyone instantiate this class
     */
    private Helper() {
    }

    /**
     * prints the menu
     */
    public static void menu() {
        System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intership");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
    }

    public static boolean isContinue() {
        String c = Validate.getString(
                "Do you want to continue? [Y/N]",
                "Only Choose [Y/N]!",
                IConstant.REGEX_YES_NO
        );
        return c.equalsIgnoreCase(IConstant.YES);
    }

    /**
     * returns the current year
     *
     * @return the integer value is the current year
     */
    public static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

}
