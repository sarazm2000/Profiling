import java.util.Scanner;

public class EfficientAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number larger than 100000:");
        long n = scanner.nextInt();

        while (n < 100000) {
            System.out.println("Please enter a number greater than 100000:");
            n = scanner.nextInt();

        }


        System.out.println("Enter an integer number less than 21:");
        int m = scanner.nextInt();

        while (m > 20) {
            System.out.println("Please enter a number less than 20:");
            m = scanner.nextInt();
        }

        long result = sum(n);

        long factorial = calculateFactorial(m);

        System.out.println("Sum of numbers up to " + n + " is: " + result);
        System.out.println("Factorial of " + m + " is equal to " + factorial);
    }

    static long sum(long n) {
        return n * (n + 1) / 2;
    }

    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
