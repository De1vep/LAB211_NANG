package ulity;

import exception.PhoneNumberMaxLengthException;
import java.util.Scanner;

public class Validate {

    private static final Scanner sc = new Scanner(System.in);
    public static final String REGEX_NUMBER = "^\\d+$";
    public static final String REGEX_EMAIL = "^[\\w-\\.+]*[\\w_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    public static final int PHONE_NUMBER_LENGTH = 10;

    public static final String REGEX_DATE
            = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|"
            + "(?:(?:29|30)(\\/|-|\\.)"
            + "(?:0?[1,3-9]|1[0-2])\\2))"
            + "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$"
            + "|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)"
            + "?(?:0[48]|[2468][048]|[13579][26])|"
            + "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]"
            + "|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])"
            + "|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    /**
     * Don't let anyone instantiate this class.
     */
    private Validate() {
    }

    /**
     * Returns an input string from the keyboard.
     *
     * @param messageInfo message Info
     * @param messageErrorInvalid message Error Invalid
     * @param messageErrorMaxLength message Error Max_Length
     * @param REGEX
     * @return
     * @throws NumberFormatException
     * @throws PhoneNumberMaxLengthException
     */
    public static String getPhoneNumber(
            String messageInfo,
            String messageErrorInvalid,
            String messageErrorMaxLength,
            final String REGEX
    ) throws NumberFormatException, PhoneNumberMaxLengthException {
        System.out.println(messageInfo);
        String str = sc.nextLine();
        if (str.matches(REGEX)) {
            if (str.length() == PHONE_NUMBER_LENGTH) {
                return str;
            } else {
                throw new NumberFormatException(messageErrorMaxLength);
            }
        } else {
            throw new NumberFormatException(messageErrorInvalid);
        }
    }

    /**
     * Returns an input string from the keyboard.
     *
     * @param messageInfo messageInfo
     * @param messageError messageError
     * @param REGEX the pattern to test string is valid or not
     * @return the string value
     */
    public static String getString(String messageInfo, String messageError, final String REGEX) {
        do {
            System.out.println(messageInfo);
            String str = sc.nextLine();
            if (str.matches(REGEX)) {
                return str;
            }
            System.out.println(messageError);
        } while (true);
    }
}
