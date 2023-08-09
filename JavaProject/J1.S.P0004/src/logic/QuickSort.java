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
public class QuickSort {

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

    private void swap( int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private int partition(int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        };
        return i;
    }

    public void quickSort(int left, int right) {
        int index = partition(left, right);
        if (left < index - 1) {
            quickSort(left, index - 1);
        }
        if (index < right) {
            quickSort(index, right);
        }
    }
}
