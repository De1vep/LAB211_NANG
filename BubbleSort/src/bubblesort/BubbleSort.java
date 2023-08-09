package bubblesort;
import ulity.Validate;
public class BubbleSort {

    private int[] arr;

    public BubbleSort() {
    }

    public BubbleSort(int[] arr) {
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

    public void bubbleSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
