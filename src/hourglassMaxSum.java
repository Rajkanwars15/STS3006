class HourglassMaxSum {
    public static void main(String[] args) {
        /*int [][] mat = {
                {4, 2},
                {2, 4},
                {3, 3}
        };*/
        int[][] mat = {
                {6, 4, -1, 0, 3},
                {2, 4, -2, -1, 6},
                {8, 4, 5, 6, 7},
                {-6, -2, -4, 0, -1}
        };

        int R = mat.length; // Number of rows
        int C = mat[0].length; // Number of columns

        if(R<3 || C<3){
            System.out.println("Matrix is smaller than 3x3");
            return;
        }

        int maxSum = Integer.MIN_VALUE;
        int[] maxHourglassIndices = new int[4]; // [i, j] indices of the top-left element of the hourglass

        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                // Calculate the sum of the current hourglass
                int sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) +
                        (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);

                // Update maxSum if the current sum is greater
                if (sum > maxSum) {
                    maxSum = sum;
                    maxHourglassIndices[0] = i;
                    maxHourglassIndices[1] = j;
                }
            }
        }

        int i = maxHourglassIndices[0];
        int j = maxHourglassIndices[1];

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Elements contributing to the maximum sum:");

        // Print the elements and their index positions
        for (int row = i; row <= i + 2; row++) {
            for (int col = j; col <= j + 2; col++) {
                System.out.println("Element at [" + row + "][" + col + "]: " + mat[row][col]);
            }
        }
    }
}
