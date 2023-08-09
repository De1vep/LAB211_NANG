package binarysearch;

import ulity.Validate;

public class BinarySearch {

    private int[] arr;

    public BinarySearch() {
    }

    public BinarySearch(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public  void generateArr() {
        int n = Validate.getInt("Enter number of array: ",
                "Please enter an integer number: ",
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

    public int binarySearch(int searchValue, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == searchValue) {
                return mid;
            }
            if (arr[mid] < searchValue) {
                return binarySearch(searchValue, mid + 1, right);
            }
            if (arr[mid] > searchValue) {
                return binarySearch(searchValue, left, mid - 1);
            }
        }
        return -1;
    }

    public void display() {
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + "; ");
        }
        System.out.print(arr[n - 1] + "]");
    }

    public void displayInValue(int searchValue) {
        int inp = binarySearch(searchValue, 0, arr.length - 1);
        if (inp >= 0) {
            System.out.println("\nFound " + searchValue + " at index " + inp);

        } else {
            System.out.println("\nNot found search  value in array!");
        }
    }
}
