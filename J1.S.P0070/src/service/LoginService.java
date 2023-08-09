package service;

import constant.IConstant;
import entity.Account;
import java.util.ResourceBundle;
import mock.Data;
import util.Helper;
import util.Validate;

public class LoginService {

    /**
     * Login process.
     *
     * @param resourcesBundle resources Language.
     */
    public void loginProcess(ResourceBundle resourcesBundle) {
        String account = Validate.getString(
                resourcesBundle.getString(IConstant.ACCOUNT_TEXT),
                resourcesBundle.getString(IConstant.ACCOUNT_INVALID_TEXT),
                IConstant.REGEX_ACCOUNT_NUMBER);
        String password = Validate.getString(
                resourcesBundle.getString(IConstant.PASSWORD_TEXT),
                resourcesBundle.getString(IConstant.PASSWORD_INVALID_TEXT),
                IConstant.REGEX_PASSWORD);
        //generate captcha
        String captchaGenerate = Helper.generateCaptcha(IConstant.CAPTCHA_LENGTH);
        //print captcha
        System.out.println(resourcesBundle.getString(IConstant.CAPTCHA_TEXT) + captchaGenerate + "\n");

        //verify captcha
        boolean isPass = verifyCaptcha(
                resourcesBundle.getString(IConstant.INPUT_CAPTCHA_TEXT),
                resourcesBundle.getString(IConstant.CAPTCHA_INVALID_TEXT),
                resourcesBundle.getString(IConstant.CAPTCHA_INCORRECT_TEXT),
                captchaGenerate
        );
        //verify account info login
        if (isPass && authentication(account, password)) {
            System.out.println(resourcesBundle.getString(IConstant.LOGIN_SUCCESS_TEXT));
        } else {
            System.out.println(resourcesBundle.getString(IConstant.LOGIN_FAILED_TEXT));
        }
    }

    private boolean verifyCaptcha(
            String messageInfo,
            String messageErrorInvalidCaptcha,
            String messageErrorWrongCaptcha,
            String captchaGenerate
    ) {
        String captchaInput;
        do {
            captchaInput = Validate.getString(messageInfo,
                    messageErrorInvalidCaptcha,
                    IConstant.REGEX_CAPTCHA);
            if (captchaGenerate.contains(captchaInput)) {
                return true;
            }
            System.out.println(messageErrorWrongCaptcha);
        } while (true);
    }

    /**
     * Returns the authentication result.                                                                                            
     *
     * @param account to authentication.
     * @param password to authentication.
     * @return <code>true</code>if authentication successfully<code>false</code>
     * otherwise.
     */
    private boolean authentication(String account, String password) {
        for (Account a : Data.listAccount) {
            if (account.equals(a.getAccount()) && password.equals(a.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
