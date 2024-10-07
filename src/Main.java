import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write n:");
        long n = sc.nextLong();
        if (n <= 0) {
            System.out.println("n must be a natural number");

        } else {
            // The number of n-digit numbers
            long count;
            if (n == 1) {
                count = 4;
            } else {
                count = 9 * (long) Math.pow(10, n - 2) * 4;
            }
            System.out.println("The number of: " + n + " -even numbers: " + count);


        }
    }
}