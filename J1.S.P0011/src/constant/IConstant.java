package constant;

public interface IConstant {

    String BINARY_VALID = "[0-1]*";
    String DECIMAL_VALID = "[\\d]*";
    String HEXADECIMAL_VALID = "[\\da-fA-F]*";
    char[] HEXA_DIGITS = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };
}