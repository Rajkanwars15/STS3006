import java.util.Scanner;

class booth {
    // Function to perform Booth's algorithm multiplication
    public static int boothsMultiplication(int multiplicand, int multiplier) {
        int accumulator = 0;
        int m = 8; // Assuming 8-bit numbers, change this value for different sizes

        // Create temporary variables for multiplication
        int multiplicandReg = multiplicand;
        int multiplierReg = multiplier;
        int bit = 0;

        // Initialize the multiplicand and multiplier sign extension
        int multiplicandSignBit = multiplicandReg & (1 << (m - 1));
        int multiplierSignBit = multiplierReg & (1 << (m - 1));

        // Perform the multiplication process
        for (int i = 0; i < m; i++) {
            // Get the rightmost two bits of the multiplier and bit
            int lastTwoBits = (bit << 1) | (multiplierReg & 0b11);

            // Perform the operations based on the last two bits
            switch (lastTwoBits) {
                case 0b01:
                    // Add the multiplicand to the accumulator when the last two bits are 01
                    accumulator += multiplicandReg;
                    break;
                case 0b10:
                    // Subtract the multiplicand from the accumulator when the last two bits are 10
                    accumulator -= multiplicandReg;
                    break;
                // No operation required for 0b00 and 0b11
            }

            // Right shift the multiplier by 1 to prepare for the next iteration
            bit = (multiplierReg & 1);
            multiplierReg = (multiplierReg >> 1) | (multiplierSignBit << (m - 1));

            // Arithmetic right shift for the accumulator to prepare for the next iteration
            accumulator = (accumulator >> 1) | (accumulator & (1 << (m - 1)));
        }

        // Handle the final sign extension and return the result
        int result = (accumulator >> 1) | (accumulator & (1 << (m - 1)));

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter multiplicand: ");
        int multiplicand = sc.nextInt();

        System.out.print("Enter multiplier: ");
        int multiplier = sc.nextInt();

        // Perform Booth's algorithm multiplication
        int result = boothsMultiplication(multiplicand, multiplier);

        System.out.println("Result: " + result);
    }
}
