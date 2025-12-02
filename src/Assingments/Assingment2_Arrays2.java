package Assingments;

/*  1. Create a 2D array to represent the following data:

     Semesters as the first dimension.
     Subjects and Status/Marks as the second dimension.
     Actual values for Subject Names and Marks as the third dimension.

    2. From the array:
    Print Semester 2 Subject 4 and Subject 5 names.
    Print the Status/Marks of Semester 4 Subject 3 and Subject 6.

Semester              Subject 1               Subject 2              Subject 3           Subject 4                Subject 5

Sem 1                 Mathematics I           Physics                Chemistry           Computer Programming     Engineering Drawing

Status(Marks)         Pass(78)                Pass(85)               Fail(21)            Pass(74)                 Pass(88)

Sem 2                 Mathematics II          Mechanics              Environmental Sci.  Basic Electronics        Engineering Physics

Status(Marks)         Pass(82)                Pass(77)               Pass(93)            Fail(19)                 Fail(24)

Sem 3                 Data Structures         Discrete Mathematics   Digital Electronics Operating Systems        Signals and Systems

Status(Marks)         Pass(88)                Pass(81)               Pass(76)            Fail(32)                 Pass(85)

Sem 4                 Algorithms              Computer Networks      Database Systems    Microprocessors          Communication Eng.

Status(Marks)         Pass(91)                Pass(73)               Fail(19)            Pass(80)                 Pass(76)

Sem 5                 Probability & Stats     Machine Learning       Compiler Design    Theory of Computation     Embedded Systems

Status(Marks)         Pass(86)                Pass(88)               Pass(84)           Pass(95)                  Pass(73)



Subject 6

Basic Electrical Eng.

Pass(79)

Engineering Graphics

Pass(90)

Object-Oriented Prog.

Pass(78)

Software Engineering

Pass(87)

Computer Graphics

Pass(90)

*/ 

public class Assingment2_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] sem = {
				{ //0
					 "Mathematics 1","physics,computer prog,Eng Drawing,Basic electrical eng",
					 "Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"
				},
				{//1
					"Mathematics II","Mechanics","Environmental Sci.","Basic Electronics","Engineering Physics","Engi graphics",
					"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"
				},
				{//2
                    "Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog.",
                    "Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"
                },
                { //3
                    "Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering",
                    "Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"
                },
                { //4
                    "Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics",
                    "Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"
                }			
		};
		
		// Print Semester 3 Subject 4 and Subject 5 names.
System.out.println(sem[2][3]);
System.out.println(sem[2][4]);

// Print marks of Semester 5, marks 88 and 95
		
System.out.println(sem[4][7]);
System.out.println(sem[4][8]);
	}

}
