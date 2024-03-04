package ey.assign3;

import java.time.LocalDate;

public class StudentTester {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stud = new Student[5];
		stud[0] = new Student("Jose", LocalDate.of(1995, 5, 30), new Integer[] { 60, 80, 70 });
		stud[1] = new Student("Shreya", LocalDate.of(2001, 2, 24), new Integer[] { 20, 80, 50 });
		stud[2] = new Student("Maria", LocalDate.of(2007, 5, 2), new Integer[] { 20, 20, 80 });
		stud[3] = new Student("Shantha", LocalDate.of(2014, 8, 12), new Integer[] { 10, 5, 10 });
		stud[4] = new Student("Navya", LocalDate.of(2012, 9, 25), new Integer[] { 0, 50, 100 });
		
		for (Student student : stud) {
            if (StudentValidator.isValidStudent(student)) 
                System.out.println("Added student " + student.getStudentName() + " to the array.");
             else 
                System.out.println("Invalid student " + student.getStudentName() + ". Not added to the array.");
          }
		StudentService ss = new StudentService();
		ss.showStudentDetails(stud);
	}

}
