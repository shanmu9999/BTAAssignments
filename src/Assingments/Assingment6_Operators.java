package Assingments;

public class Assingment6_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and marks [75, 80, 82] 
		   Add 10 marks to each students using assignment operators and store it into another array, 
		   after adding 10 marks identify the average marks of all students

Expected Output:
Updated Marks:
Suresh: 85
Mahesh: 90
Naresh: 92
Average Marks: 89.0

*/

		String [] student = { "Suresh","Mahesh","Naresh"};
		int [] marks = {75, 80, 82};

		// updating markd by given 10 marks to each
		
		int[] updatedmarks = new int[3];
		updatedmarks[0] = marks[0]+10;
		updatedmarks[1] = marks[1]+10;
		updatedmarks[2] = marks[2]+10;
		
		// Print the student name and updated marks
		System.out.println(student[0]+":"+updatedmarks[0]);
		System.out.println(student[1]+":"+updatedmarks[1]);
		System.out.println(student[2]+":"+updatedmarks[2]);
		
		System.out.println(updatedmarks.length);
		
		// average of marks
		float averageMarks = (updatedmarks[0] + updatedmarks[1] + updatedmarks[2]) / updatedmarks.length;
		
		System.out.println("Average Marks: " + averageMarks);
}
}