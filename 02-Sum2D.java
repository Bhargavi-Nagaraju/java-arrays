// program to find the sum of all elements in 2d array
public class Sum2D {
    public static void main(String[] args) {

        // Declare and initialize a 2D array with 2 rows and 2 columns
        int arr[][] = {
            {1, 2},
            {3, 4}
        };

        // Variable to store the total sum of all elements
        int sum = 0;

        // Outer loop to go through each row
        for (int i = 0; i < arr.length; i++) {

            // Inner loop to go through each column in the current row
            for (int j = 0; j < arr[i].length; j++) {

                // Add the current element to the sum
                sum = sum + arr[i][j];
            }
        }

        // Print the total sum of all elements
        System.out.println("sum :" + sum);
    }
}
 // sample output
 // sum = 10
