/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import util.Validate;

/**
 *
 * @author Tu
 */
public class InsertionSort {

    public int getSize() {
        int n = Validate.getInt(
                "Enter number of array:",
                "Number out of bound",
                "Wrong number format",
                1, Integer.MAX_VALUE
        );
        return n;
    }

    /**
     * Method to get value for array
     *
     * @param size size of array
     * @return array in integer type
     */
    public int[] input(int size) {
        System.out.println("Generate random integer in number range for each array element:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Validate.getInt(
                    "Enter number:",
                    "Number out of bound",
                    "Wrong format number",
                    Integer.MIN_VALUE,
                    Integer.MAX_VALUE);
        }
        return arr;
    }

    /**
     * Method to sort array
     * 
     * @param arr array unsorted
     */
    public void sortArrayByInsertionSort(int[] arr){
        int len = arr.length;
        System.out.print("Unsorted array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println();        
    }
    
    /**
     * Display array after sort
     * 
     * @param a array after sort
     */
    public void print(int[] a) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }    
}
