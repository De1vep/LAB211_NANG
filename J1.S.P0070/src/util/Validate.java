package util;

import java.util.Scanner;

public class Validate {
    
    private final static Scanner SCANNER = new Scanner(System.in);

    /**
     * Method to block user to create new object
     */
    private Validate() {
    }
    
    /**
     * Method to get valid integer number
     * 
     * @param messageInfo notify for user to enter number
     * @param errMessage  notify error number out of bound
     * @param errFormat   notify error number format
     * @param min         minimum value
     * @param max         maximum value
     * @return integer value
     */
    public static int getInt(String messageInfo, String errMessage,
            String errFormat, int min, int max) {
        do {
            try {
                System.out.print(messageInfo);
                int result = Integer.parseInt(SCANNER.nextLine().trim());
                if (result >= min && result <= max) {
                    return result;
                }
                System.out.println(errMessage);
            } catch (NumberFormatException e) {
                System.out.println(errFormat);
            }
        } while (true);
    }
    
    /**
     * Return an input string from the keyboard
     * 
     * @param messageInfo
     * @param messageError
     * @param REGEX
     * @return 
     */
    public static String getString(String messageInfo, String messageError,
            final String REGEX){
        do{
            System.out.print(messageInfo);
            String str = SCANNER.nextLine();
            if(str.matches(REGEX)){
                return str;
            }
            System.out.println(messageError);
        }while(true);
    }
}
