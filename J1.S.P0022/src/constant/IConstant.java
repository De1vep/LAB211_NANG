package constant;

public interface IConstant {

    String REGEX_YES_NO = "^[ynYN]$";
    String REGEX_NAME = "^[a-zA-Z ]+$";
    String REGEX_ADDRESS = "^[a-zA-Z0-9 ,\\-\\./]+$";
    String REGEX_PHONE = "^\\d{10}$";
    String REGEX_TEXT = "^[a-zA-Z0-9 ,\\.]+$";
    String REGEX_EMAIL = "^([\\w\\-\\.]+)@([\\w\\-\\.]+)\\.([a-zA-Z]{2,5})$";
    String YES = "y";
    int MIN_YEAR = 1900;
    int EXPERIENCE_TYPE = 0;
    int FRESHER_TYPE = 1;
    int INTERN_TYPE = 2;
}
