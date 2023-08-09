/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import logic.MergeSort;
import util.Validate;

/**
 *
 * @author Tu
 */
public class Main {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int size = Validate.getInt(
                "Enter number of array:",
                "Number out of bound",
                "Wrong format",
                1, Integer.MAX_VALUE
        );
        ms.input(size);
        System.out.print("Unsorted array: ");
        ms.display();
        System.out.print("\nSorted array: ");
        ms.sort(0, size-1);
        ms.display();
        System.out.println("");
    }
}
