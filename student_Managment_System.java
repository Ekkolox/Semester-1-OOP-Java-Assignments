package assignments;

import java.util.Scanner;

public class student_Managment_System {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Grade: ");
		int Grade = scanner.nextInt();
		System.out.println("Enter second grade: ");
		int Grade1 = scanner.nextInt();
		System.out.println("Enter third grade: ");
		int Grade2 = scanner.nextInt();
		double Average = (Grade + Grade1 + Grade2)/3;
				
		if (Average <= 100 ) {
			System.out.println("Grade is: A");
		} else if (Average < 75) {
			System.out.println("Grade is:  B");
			
		} else if (Average < 65) {
			System.out.println("Grade is: C");
		} else if (Average >= 40) {
			System.out.println("Gradevis: D");
		} else {
			System.out.println("Grade is: F");
		}
		scanner.close();
	}

}
