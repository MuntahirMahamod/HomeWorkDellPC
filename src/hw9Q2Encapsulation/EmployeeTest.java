package hw9Q2Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Robert");
		employee.setAge(40);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Name: " + employee.getName() + ", \nAge: " + employee.getAge() + ", Sex: \nSex: "
				+ employee.getSex() + " and \nIs Us Citizen: " + employee.isUsCitizen());

	}

}
