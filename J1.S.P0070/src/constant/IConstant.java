package constant;

public interface IConstant {

       String REGEX_ACCOUNT_NUMBER = "^[0-9]{10}$";
    String REGEX_PASSWORD = "^((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,31})$";
    String REGEX_CAPTCHA = "^[0-9A-Z]{1}$";
    int CAPTCHA_LENGTH = 5;
    
    String ACCOUNT_TEXT = "account";
    String PASSWORD_TEXT = "password";
    String CAPTCHA_TEXT = "captcha";
    String INPUT_CAPTCHA_TEXT = "inputCaptcha";
    String ACCOUNT_INVALID_TEXT = "accountInvalid";
    String PASSWORD_INVALID_TEXT = "passwordInvalid";
    String CAPTCHA_INCORRECT_TEXT = "captchaInvalid";
    String CAPTCHA_INVALID_TEXT = "captchaInvalid";
    String LOGIN_SUCCESS_TEXT = "loginSuccess";
    String LOGIN_FAILED_TEXT = "loginFailed";
}
