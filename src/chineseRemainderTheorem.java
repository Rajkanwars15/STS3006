import java.util.Scanner;
import java.util.Arrays;

class ChineseRemainderTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the num array: ");
        int numSize = sc.nextInt();
        int[] num = new int[numSize];

        System.out.println("Enter the elements of the num array: ");
        for (int i = 0; i < numSize; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the rem array: ");
        int remSize = sc.nextInt();
        int[] rem = new int[remSize];

        System.out.println("Enter the elements of the rem array: ");
        for (int i = 0; i < remSize; i++) {
            rem[i] = sc.nextInt();
        }

        // Calculate the product of all elements in the num array
        int product = Arrays.stream(num).reduce(1, (a, b) -> a * b);

        int x = 0;
        for (int i = 0; i < numSize; i++) {
            // Calculate the partial product excluding num[i]
            int partialProduct = product / num[i];

            // Calculate the modular inverse of the partial product modulo num[i]
            int inverse = modInverse(partialProduct, num[i]);

            // Update the value of x using the Chinese Remainder Theorem
            x = (x + rem[i] * partialProduct * inverse) % product;
        }

        System.out.println("The value of x is: " + x);
    }

    // Function to calculate the modular inverse of 'a' modulo 'm' using extended Euclidean algorithm
    private static int modInverse(int a, int m) {
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;

        if (m == 1) return 0;

        while (a > 1) {
            // q is quotient
            q = a / m;

            t = m;

            // m is remainder now, process same as Euclid's algorithm
            m = a % m;
            a = t;

            t = x0;

            x0 = x1 - q * x0;

            x1 = t;
        }

        // Make x1 positive
        if (x1 < 0) x1 += m0;

        return x1;
    }
}
