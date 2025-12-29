package Assingments;

public class Assingment7_Conditionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		System.out.println("Bank evaluates loan applicants based on the following criteria for :"+customerName);
		
		if(creditScore > 750) {
			System.out.println("loan is automatically approved.");
		}
		else if (creditScore < 750) {
			System.out.println("additional checks are performed.");	
		}
		else {
			System.out.println("Loan is denied");			
		}
		if(income < 50000.0) {
			System.out.println("Loan is dined");
		}
		else {
			System.out.println("Loan is approved");
		}
		if(isEmployed) {
			System.out.println("customer is employed.");
		}
		else {
			System.out.println("Customer loan is dined");
		}
		if (debtToIncomeRatio < 40.0) {
			System.out.println("Loan is approved");
		}
		else if (debtToIncomeRatio > 40.0) {
			System.out.println("Loan is not approved");
		}
		else {
			System.out.println("Loan io not applicable");
		}
	}

}
