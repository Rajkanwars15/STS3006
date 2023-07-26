import java.util.Scanner;
public class reverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer value to reverse bitwise: ");
        int n = sc.nextInt(); // integer
        int rev = 0;

        // traversing bits of 'n' from the right
        while (n > 0) {
            // bitwise left shift 'rev' by 1
            rev <<= 1;
            // if current bit is '1'
            if ((n & 1) == 1)
                rev ^= 1;
            // bitwise right shift 'n' by 1
            n >>= 1;
        }
        // required number
        System.out.println("Reversed: " + rev);
    }
}
