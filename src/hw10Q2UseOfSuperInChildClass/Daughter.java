package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo("Lee", 50, 'M', false);
		super.familyName = "Solman";
		System.out.println("FamilyName: " + familyName);
		System.out.println("This is default constractor from Daughter Class");
	}

	public Daughter(String birthMonth, int age) {

		super("Wiliam", 40, 'M', true);
		super.father();
		super.fatherInfo("James", 35, 'M', false);
		super.familyName = "Banjiman";
		System.out.println("FamilyName: " + familyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth of Month: " + birthMonth + ", Age: " + age);
	}

	public void daughter() {
		super.father();
		super.fatherInfo("Lucas", 65, 'M', false);
		super.familyName = "Stoll";
		System.out.println("FamilyName: " + familyName);
		System.out.println("This is void type mathod from Daughter Class");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("Smith", 52, 'M', false);
		super.familyName = "Collymore";
		System.out.println("FamilyName: " + familyName);
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth of Month: " + birthMonth + ", Age: " + age);
	}

}
