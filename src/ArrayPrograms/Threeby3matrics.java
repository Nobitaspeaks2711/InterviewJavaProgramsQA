package ArrayPrograms;
//print left diagonal of 3 by 3 matrics.

public class Threeby3matrics {

        public static void main(String[] args) {
            // Define a 3x3 matrix
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            System.out.println("Left diagonal elements are:");

            // Loop through the matrix and print the left diagonal elements
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }


