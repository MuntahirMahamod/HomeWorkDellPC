package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		System.out.println(" This is default constractor from Daughter Class");
	}

	public Daughter(String birthMonth, int age) {
		super();
		super.father();
		super.father(birthMonth, age, sex, usCitizen);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth of Month: " + birthMonth + ", Age: " + age);
	}

	public void daughter() {
		System.out.println(" This is mathod from Daughter Class");
	}

	public void daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth of Month: " + birthMonth + ", Age: " + age);
	}

}
