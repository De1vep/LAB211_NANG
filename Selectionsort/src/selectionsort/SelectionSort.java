package selectionsort;

import ulity.Validate;

public class SelectionSort {

    private int[] arr;

    public SelectionSort() {
    }

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void generateArr() {
        int n = Validate.getInt("Number of array must be a positive number.\nPlease input number of array: ",
                "You must input digidt.\nPlease input number of array: ",
                Validate.REGEX_NUMBER
        );
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (n - 1 + 1) + 1);
        }
    }

    public void selectionSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void display() {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.print(arr[n - 1] + "]");
    }
}
