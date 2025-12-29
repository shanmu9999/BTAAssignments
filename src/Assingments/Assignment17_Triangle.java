package Assingments;

public class Assignment17_Triangle {
	
public static void main(String[] args) {
		
		int n =5;
		
for(int i = 1; i <= n; i++) {
			
            // 1. Print Spaces: (n - i) spaces are needed for the first i rows
            // Example: for n=5, i=1, spaces=4; for i=5, spaces=0
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
			
			//print *
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//move to next line
			System.out.println();
			
		}


	}

}
