package ey.assign3;

import java.time.LocalDate;
import java.time.Period;

public class StudentValidator {
	
	public static boolean isValidStudentName(Student student) {
		String name = student.getStudentName();
		return name.matches("[a-zA-Z]+");
	}
	
	public static boolean isValidStudentBirthdate(Student student)
	{
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(student.getBirthdate(), currentDate);
		return period.getYears() >= 5;
	}

	public static boolean isValidStudentMarks(Integer[] marks) {
		if (marks[0]>=0 && marks[0]<=100)
			{if (marks[1]>=0 && marks[1]<=100)
				{if (marks[2]>=0 && marks[2]<=100)
					return true;
				else
					return false;}
			else 
				return false;}
		else 
			return false;
	}
	
	public static boolean isValidStudent(Student student) {
		if (isValidStudentName(student) == true && isValidStudentBirthdate(student) == true && isValidStudentMarks(student.getMarks()) == true)
			return true;
		else
			return false;
	}
}
