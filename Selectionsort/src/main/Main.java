package main;

import selectionsort.SelectionSort;

public class Main {

    public static void main(String[] args) {
        SelectionSort sc = new SelectionSort();
        sc.generateArr();
        System.out.println("UNSORTED: ");
        sc.display();
        sc.selectionSort();
        System.out.println("\nSORTED: ");
        sc.display();
    }
}
