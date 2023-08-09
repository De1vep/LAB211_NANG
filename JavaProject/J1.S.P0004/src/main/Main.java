/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import logic.QuickSort;
import util.Validate;

/**
 *
 * @author Tu
 */
public class Main {
    public static void main(String[] args) {
        QuickSort qc = new QuickSort();
        int size = Validate.getInt(
                "Enter number of array:",
                "Number out of bound",
                "Wrong format",
                1, Integer.MAX_VALUE
        );
        qc.input(size);
        System.out.print("Unsorted array: ");
        qc.display();
        System.out.print("\nSorted array: ");
        qc.quickSort(0, size -1);
        qc.display();
        System.out.println("");
    }
}
