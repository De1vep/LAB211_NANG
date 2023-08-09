package constant;

public interface IConstant {

    String REGEX_NAME = "^[a-zA-Z ]+$";
    String REGEX_ADDRESS = "^[a-zA-Z0-9 ,\\-\\./]+$";
    String REGEX_PHONE = "^[0-9]{10}$"
            + "|^[0-9]{3}-[0-9]{3}-[0-9]{4}$"
            + "|^[0-9]{3}.[0-9]{3}.[0-9]{4}$"
            + "|^[0-9]{3} [0-9]{3} [0-9]{4}$"
            + "|^[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}$"
            + "|^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$";
}
