import java.util.Scanner;
public class binaryLongestSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // If all bits are 1
        if (~n == 0)
        {
            System.out.println(8 * sizeof());
        }

        int currLen = 0, prevLen = 0, maxLen = 0;
        while (n != 0) {
            // If Current bit is a 1 then increment currLen++
            if ((n & 1) == 1) {
                currLen++;
            }
            /* If the current bit is 1, currLen is incremented to track the length of the current sequence of consecutive 1s. If the current bit is 0, prevLen is updated to either 0 (if the next bit is also 0) or set to the value of currLen (if the next bit is 1). Then, currLen is reset to 0 since two consecutive 0s mean the end of the current sequence.*/
            else if ((n & 1) == 0) {
                prevLen = (n & 2) == 0 ? 0 : currLen;

                // If two consecutively bits are 0 then currLen also will be 0.
                currLen = 0;
            }

            // Update maxLen if required
            maxLen = Math.max(prevLen + currLen, maxLen);

            // Remove last bit (Right shift)
            n >>= 1;
        }

        // We can always have a sequence of at least one 1, this is flipped bit
        System.out.println(maxLen + 1);
    }

    static byte sizeof() {
        byte sizeOfInteger = 8;
        return sizeOfInteger;
    }
}
