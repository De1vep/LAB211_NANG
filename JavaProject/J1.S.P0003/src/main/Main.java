/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import logic.InsertionSort;

/**
 *
 * @author Tu
 */
public class Main {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int n = is.getSize();
        int[] a = is.input(n);
        is.sortArrayByInsertionSort(a);
        is.print(a);
    }
}
