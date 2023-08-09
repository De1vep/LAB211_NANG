package main;

import bubblesort.BubbleSort;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of array: ");
        BubbleSort sc = new BubbleSort();
        sc.generateArr();
        System.out.print("UNSORTED: ");
        sc.display();
        sc.bubbleSort();
        System.out.print("\nSORTED: ");
        sc.display();
    }
}
