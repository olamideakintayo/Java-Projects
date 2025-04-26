// StudentPercentage

import java.util.Scanner;

public class StudentPercentage {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int countA = 0;
	int countB = 0;
	int countC = 0;
	int countD = 0;
	int countF = 0;
	int countInvalid = 0;
	int validInput = 0;

        while (validInput != 10) {
	System.out.println("Please Enter the student score from 0-100: ");
        int score = input.nextInt();
	if (score >= 0 && score <= 100) {
	switch(score / 10) {
	case 10: 
	case 9:
	case 8: 
	System.out.println("Student Grade is A"); countA ++;
	break; 
	case 7: System.out.println("Student Grade is B"); countB ++; break; 
	case 6: System.out.println("Student Grade is C"); countC ++; break; 
	case 5: System.out.println("Student Grade is D"); countD ++; break; 
	case 4: 
	case 3:
	case 2:
	case 1: 
	default: System.out.println("Student Grade is F"); countF ++; break;
	}
	validInput ++;
}

	if (score > 100) {
 	System.out.println("This is an invalid score, Please input a valid score. ");
	countInvalid ++;
}
	
	else if (score < 0) {
	System.out.println("This is an invalid score, Please input a valid score. ");
	countInvalid ++;
}
}

	System.out.println("The total number of A students are: " + countA);

	System.out.println("The total number of B students are: " + countB);

	System.out.println("The total number of C students are: " + countC);

	System.out.println("The total number of D students are: " + countD);

	System.out.println("The total number of F students are: " + countF);

	System.out.println("The total number of Invalid Inputs are: " + countInvalid);

	}
	}