package fibobacci;

public class Fibobacci {

    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci");
        fibonacci(45, 1, 0);
    }

    /**
     * This function use to calculate Fibonacci number
     *
     * @param amount        amount Fibonacci number
     * @param preNum        previous Fibonacci number
     * @param afterNum      after Fibonacci number
     * @return the integer value
     */
    public static int fibonacci(int amount, int preNum, int afterNum) {
        if (amount < 1) {
            return afterNum;
        }
        System.out.print(afterNum);
        if (amount != 1) {
            System.out.print(", ");
        }
        return fibonacci(amount - 1, afterNum, preNum + afterNum);
    }
}
