package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default constructor of student class");
	}

	public Student(String stName, int stID, char sex, float grade, boolean isProgrammer) {
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("My Name: " + stName + ", ID: " + stID + ", Sex: " + sex + ", Grade :" + grade
				+ " and Java Programmer? Ans:" + isProgrammer);
	}

}
