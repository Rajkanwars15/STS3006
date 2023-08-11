class maxProdSubArr {

    // Method to find and print the maximum product subarray and its indices
    public static void findMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("No array or empty array provided.");
            return;
        }

        int n = nums.length;
        int maxProduct = nums[0];
        int maxProductStart = 0;
        int maxProductEnd = 0;
        int currentProduct = nums[0];
        int currentStart = 0;
        int currentEnd = 0;

        for (int i = 1; i < n; i++) { // start loop from 1, skip 0 coz its initial value of currentProduct
            if (nums[i] == 0) { // check if current element zero implying product is 0
                currentProduct = 1;
                currentStart = i + 1; // start new subarray from next element
                currentEnd = i + 1;
            } else { // if non 0 start multiplication
                currentProduct *= nums[i];
                currentEnd = i; // ending index of subarray

                if (currentProduct > maxProduct) { // check if we get newer maximum and update values
                    maxProduct = currentProduct;
                    maxProductStart = currentStart;
                    maxProductEnd = currentEnd;
                }
            }
        }

        // Print the maximum product and the indices of the subarray
        System.out.println("Maximum Product: " + maxProduct);
        System.out.print("Indices: ");
        for (int i = maxProductStart; i <= maxProductEnd; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {-6, -2, 0, -2, 4};

        // Find and print the maximum product subarray and its indices
        findMax(nums);
    }
}
