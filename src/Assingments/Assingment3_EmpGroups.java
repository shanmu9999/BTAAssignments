package Assingments;

public class Assingment3_EmpGroups  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Assingment3_Employees obj = new Assingment3_Employees();
		
		/*
		System.out.println("Employee name: "+ obj.empname);
		System.out.println("Employee id: "+ obj.empid);
		
		System.out.println("Employee name: "+ obj.empname2);
		System.out.println("Employee id: "+ obj.empid2);
		
		System.out.println("Employee name: "+ obj.empname3);
		System.out.println("Employee id: "+ obj.empid3);
*/
		/*
		// Access the data and store in arrays
		
		String[]  empname4 = new String[3];
		empname4[0]= obj.empname;
		empname4[1]= obj.empname2;
		empname4[2]= obj.empname3;
		
		int[]  empid4 = new int[3];
		empid4[0]= obj.empid;
		empid4[1]= obj.empid2;
		empid4[2]= obj.empid3;
		
		System.out.println(empname4[0] + " : " + empid4[0]);
		System.out.println(empname4[1] + " : " + empid4[1]);
		System.out.println(empname4[2] + " : " + empid4[2]);

		*/
		
		System.out.println(obj.empname[0][0][1]);
		System.out.println(obj.empid[0][0][1]);
	}

}
