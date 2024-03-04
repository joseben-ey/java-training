package ey.assign3;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {

	private Integer admissionCode;
	private String studentName;
	private LocalDate birthdate;
	private Integer [] marks; // array to hold marks in 3 subjects
	private String grade;
	private static Integer admissionCounter = 0;
	private static String schoolName;
	
	 static {
		// TODO Auto-generated method stub
		schoolName = "Hyderabad Public School";

	}

	public Student() {
		admissionCounter = admissionCounter + 1;
		admissionCode = admissionCounter;
	}

	public Student(String studentName, LocalDate birthdate) {
		super();
		this.setStudentName(studentName);
		this.birthdate = birthdate;
		admissionCounter = admissionCounter + 1;
		admissionCode = admissionCounter;
	}

	public Student(String studentName, LocalDate birthdate, Integer[] marks) {
		super();
		this.setStudentName(studentName);
		this.birthdate = birthdate;
		this.marks = marks;
		setMarks(marks);
		admissionCounter = admissionCounter + 1;
		admissionCode = admissionCounter;
	}

	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", studentName=" + studentName + ", birthdate=" + birthdate
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Integer[] getMarks() {
		return marks;
	}

	public void setMarks(Integer[] marks) {
		this.marks = marks;
		int grade=marks[0]+marks[1]+marks[2];
		System.out.println(grade);
		if (grade>=240 & grade <=300)
			setGrade("Excellent");
		else if (grade>=180 & grade <=239)
			setGrade("Good");
		else if (grade>=150 & grade <=179)
			setGrade("Average");
		else if (grade <150)
			setGrade("Fail");
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

	public void setGrade(String grade) {
		this.grade = grade;
		
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	 
	

}
