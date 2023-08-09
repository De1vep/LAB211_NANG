package main;

import convert.base.Converter;
import static logic.Validator.getInputValue;
import static util.Validate.getInt;

public class Main {

    public static void main(String[] args) {
        System.out.println("======Convert Base======");
        System.out.println("1. Binary base");
        System.out.println("2. Decimal base");
        System.out.println("3. Hexa base");
        Converter converter = new Converter();
        int inputBase = getInt(
                "Input base: ",
                "Input base must be [1,3]!",
                "Input base must be integer number!",
                1, 3);

        int outputBase = getInt(
                "Output base: ",
                "Output base must be [1,3]!",
                "Output base must be integer number!",
                1, 3);
        String inputValue = getInputValue(inputBase);
        String outputValue = converter.convertInputValueToOuputValue(inputBase, outputBase, inputValue);
        System.out.println("Converted base: " + outputValue);
    }
}