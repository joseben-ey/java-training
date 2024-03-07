package com.ey.ui;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.ey.model.Employee;
import com.ey.model.Person;

public class PersonInheritanceDemo {
	
	private static ArrayList <Person> personlist;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of people ");
		Scanner in = new Scanner(System.in);
		int NE = in.nextInt();
		Person persons[] = new Person[NE];
		List<Person> personlist = Arrays.asList(persons); 
		

	}
		public void getPersonsDetails(Person persons) {  //- which accepts both Employees and Students details
			personlist.add(persons);
			}
		
		public  void showPersonsDetails(Person persons) {
			System.out.println(persons);   //- which displays Employees and Students details
		}
		
		 public  List<Person> getPersonsEligibleForVoting() {//- which returns persons whose age is greater or equal to 18 years
			 
			 List<Person> eligiblePeople =new ArrayList<>();
			 for (Person person : personlist) {
				 if (person.getAge()>=18)
					 eligiblePeople.add(person);
			 }
 			return eligiblePeople;
		 }
		
		 public  Map<String,List<Person>> getPersonsWorkingInSapient(Person persons) { 
			 //- which returns key:value, where key is job name, and value is List of Employees with the job specified in the key.
			 Map<String,List<Person>> jobMap=new HashMap<>();
				for(Person person:personlist) {
					if(person instanceof Employee) {
						Employee employee=(Employee)person;
						if(employee.getJob().equals("Sapient Colony")) {
							if(!jobMap.containsKey("Sapient Colony")) {
								jobMap.put("Sapient Colony", new ArrayList<>());
							}
							jobMap.get("Sapient Colony").add(employee);
						}
					}
				}
				return jobMap;
		 }
			
}
	
