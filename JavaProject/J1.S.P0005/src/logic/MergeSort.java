/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.Random;

/**
 *
 * @author Tu
 */
public class MergeSort {

    private int[] array;

    public void input(int length) {
        array = new int[length];
        Random rd = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rd.nextInt(length);
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    /**
     * Method to merge 2 subarray of array
     *
     * @param arr original array
     * @param l   starting point of left array
     * @param m   mid point of original array
     * @param r   ending point of right array
     */
    void merge( int l, int m, int r) {

        // Find length of 2 subarray for merging
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create array to save value of 2 subarray
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy value in to saved array
        for (int i = 0; i < n1; ++i) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[m + 1 + j];
        }

        // Merge 2 saved array
        // Chỉ mục ban đầu của 2 mảng con
        int i = 0, j = 0;

        // Chỉ mục ban đầu của mảng phụ được hợp nhất
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public void sort( int l, int r) {
        if (l < r) {

            // find mid point
            int m = (l + r) / 2;

            // Hàm đệ quy tiếp tục chia đôi
            sort( l, m);
            sort( m + 1, r);

            merge(l, m, r);
        }
    }
}
