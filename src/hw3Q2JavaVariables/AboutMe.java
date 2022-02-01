package hw3Q2JavaVariables;

public class AboutMe {
// this variables is declared
	public String mySchoolName;
	public String name = "Muntahir Mahamod";
	public byte age = 30;
// this variables are initialized
	public short myYearlyHouseRent = 1000;
	public int myYearlySalary = 100000;
	public long myBankBalance = 10000000l;
	public float myHeight = 5.11f;
	public double myGrade = 3.500;
	public char sex = 'M';
	public boolean usCitigen = false;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.age);
		System.out.println("My Name: " + aboutMe.name + ", My Age: " + aboutMe.age);

	}

}
