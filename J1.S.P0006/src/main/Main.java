package main;

import binarysearch.BinarySearch;
import ulity.Validate;

public class Main {

    public static void main(String[] args) {
        BinarySearch bn = new BinarySearch();
        bn.generateArr();
        int searchValue = Validate.getInt(
                "Enter search value: ",
                "Please enter an digit:",
                Validate.REGEX_NUMBER
        );

        bn.selectionSort();
        System.out.println("Array Sorted: ");
        bn.display();
        bn.displayInValue(searchValue);
    }
}
