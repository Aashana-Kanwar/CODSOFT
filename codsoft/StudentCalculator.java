package codsoft;

import java.util.Scanner;

public class StudentCalculator {	
	
	public static void calculator() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Maths Marks: ");		
		int maths= validateMarks(in);
		
		
		System.out.println("\nEnter Science Marks: ");
		int sci= validateMarks(in);
		
		 
		 System.out.println("\nEnter English Marks: ");
		 int eng= validateMarks(in);
		
		 
		 System.out.println("\nEnter Hindi Marks: ");
		 int hindi= validateMarks(in);
		
		 
		 int totalMarks = maths+sci+eng+hindi;
		 int percent = totalMarks/4;
		 
		 System.out.println("\nTotal marks are: "+totalMarks);
		 System.out.println("\nAverage Percentage is: "+percent);
		 
				 
		 if(percent>=90) 
			System.out.println("A");
		else if (percent>=75 && percent<90)
			System.out.println("B");
			
		else if (percent>=60 && percent<75) 
			System.out.println("C");
		else if (percent>=40 && percent<60) 
			System.out.println("D");
		else
			System.out.println("\nYou couldn't able to pass the exams.");
		 }
	 public static int validateMarks(Scanner in) {
	        int marks;
	        do {
	            marks = in.nextInt();
	            if (marks > 100 || marks < 0) {
	                System.out.println("Invalid marks entered, please enter marks out of 100: ");
	            }
	        } while (marks > 100 || marks < 0);
	        return marks;
	    }

	public static void main(String[] args) {
		StudentCalculator.calculator();

	}

}
