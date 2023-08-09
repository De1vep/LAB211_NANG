package convert.base;

import constant.IConstant;

public class Converter {

    public Converter() {
    }

    public String convertInputValueToOuputValue(
            int inputBase,
            int outputBase,
            String inputValue
    ) {
        int decimal = convertInputValueToDecimal(inputBase, inputValue);
        String outputValue = convertDecimalToOutputValue(outputBase, decimal);
        return outputValue;
    }

    private int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, (binary.length() - 1 - i));
            }
        }
        return decimal;
    }

    private int convertHexaToDecimal(String hexa) {
        int decimal = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char c = hexa.charAt(i);
            int d = 0;
            for (int j = 0; j < IConstant.HEXA_DIGITS.length; j++) {
                if (c == IConstant.HEXA_DIGITS[j]) {
                    d = j;
                }
            }
            decimal = decimal * 16 + d;
        }
        return decimal;
    }

    private String convertDecimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = Integer.toString(decimal % 2) + binary;
            decimal /= 2;
        }
        return binary;
    }

    private String convertDecimalToHexa(int decimal) {
        String hexa = "";
        while (decimal > 0) {
            hexa = IConstant.HEXA_DIGITS[decimal % 16] + hexa;
            decimal /= 16;
        }
        return hexa;
    }

    private String convertDecimalToOutputValue(int outputBase, int decimal) {
        String output = "";
        switch (outputBase) {
            case 1:
                output = convertDecimalToBinary(decimal);
                break;
            case 2:
                output = Integer.toString(decimal);
                break;
            case 3:
                output = convertDecimalToHexa(decimal);
                break;
        }
        return output;
    }

    private int convertInputValueToDecimal(int inputBase, String inputValue) {
        int decimal = 0;
        switch (inputBase) {
            case 1:
                decimal = convertBinaryToDecimal(inputValue);
                break;
            case 2:
                decimal = Integer.parseInt(inputValue);
                break;
            case 3:
                decimal = convertHexaToDecimal(inputValue);
                break;
            default:
                break;
        }
        return decimal;
    }
}