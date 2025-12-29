package Assingments;

public class Assingments_14_diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5; // The number of rows in the upper half (also the center line)

        // --- Upper Half (Pyramid) ---
        for (int i = 1; i <= rows; i++) {
            // 1. Print leading spaces
            // spaces = rows - i
            for (int j = rows; j>i; j--) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            }
	
    // Lower half of the diamond
    for (int i = rows - 1; i >= 1; i--) {
        // Print spaces
        for (int j = rows; j > i; j--) {
            System.out.print(" ");
        }
        // Print numbers
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
	}

}
