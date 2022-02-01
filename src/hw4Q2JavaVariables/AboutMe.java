package hw4Q2JavaVariables;

public class AboutMe {
	// Here all variables declare
	public String name;
	public byte myAge;
	public short myMonthlyHouseRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;
	public String myCar;

	// Constructor is declared

	public AboutMe() {
		System.out.println("This is all about me");
	}
//method is implemented 

	public void aboutMyInformation() {
		System.out.println("My Name is: " + name + "\nMy Age is: " + myAge + "\nMy Monthly House Rent is: "
				+ myMonthlyHouseRent + "\nMy Yearly Salary is: " + myYearlySalary + "\nMy Bank Balance is: "
				+ myBankBalance + "\nSex: " + sex + "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade
				+ "\nAm I US Citize? Ans: " + usCitizen + "\nMy Car: " + myCar);

	}

	

}
