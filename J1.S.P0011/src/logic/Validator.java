package logic;

import constant.IConstant;
import static util.Validate.getString;

public class Validator {
  public static String getInputValue(int inputBase) {
        String inputValue = "";
        switch (inputBase) {
            case 1:
                inputValue = getString(
                        "Input value you wanna convert:",
                        "Input value must be enter 1 or 0!",
                        IConstant.BINARY_VALID);
                break;
            case 2:
                inputValue = getString(
                        "Input value you wanna convert:",
                        "Input value must be enter 0-9!",
                        IConstant.DECIMAL_VALID);
                break;
            case 3:
                inputValue = getString(
                        "Input value you wanna convert:",
                        "Input value must be enter 0-9 A-F!",
                        IConstant.HEXADECIMAL_VALID);
                break;
        }
        return inputValue;
    }
}
