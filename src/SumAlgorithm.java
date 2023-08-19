import java.util.Scanner;

public class SumAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer number larger than 100000:");
        long n = scanner.nextInt();

        System.out.println("Enter an integer number less than 21:");
        int m = scanner.nextInt();

        long result = sum(n);

        long factorial = calculateFactorial(m);

        System.out.println("Sum of numbers up to " + n + " is: " + result);
        System.out.println("Factorial of " + m + " is equal to " + factorial);
    }

    static long sum(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= n; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}