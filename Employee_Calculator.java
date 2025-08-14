package assignments;

public class Employee_Calculator {
	private String name;
	private double basicSalary;
	private String jobTitle;
	
	public Employee_Calculator(String name, double basicSalary, String jobTitle) {
		this.name =  name;
		this.basicSalary = basicSalary;
		this.jobTitle =  jobTitle;
	}
	public double calcSalary() {
		double bonusPercentage = 0;
		switch (jobTitle) {
		case "manager":
			bonusPercentage = 0.30;
			break;
		case "developer":
			bonusPercentage = 0.20;
			break;
		case "intern" :
			bonusPercentage = 0.10;
			break;
		}
		return basicSalary + (basicSalary * bonusPercentage);
		
	}
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Job title: " + jobTitle);
		System.out.println("Income + bonus: " + calcSalary());
	}

}
