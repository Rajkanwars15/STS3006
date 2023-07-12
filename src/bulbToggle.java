import java.util.Arrays;

public class bulbToggle {
    public static void main(String[] args) {
        int n = 5;
        Boolean[] boolArray = new Boolean[n]; // initialize a boolean array
        Arrays.fill(boolArray, Boolean.FALSE); // all the values will be false

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j < n; j += i) {
                boolArray[j] = !boolArray[j]; // Toggle the bulb's switch
            }
            System.out.println("Bulbs state after iteration " + i + ": " + Arrays.toString(boolArray));
        }

        System.out.println("Bulbs switched on at the end:");
        for (int i = 0; i < n; i++) {
            if (boolArray[i]) {
                System.out.println(i + 1); // Bulb index starts from 1
            }
        }
    }
}
