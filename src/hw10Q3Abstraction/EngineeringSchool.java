package hw10Q3Abstraction;

public abstract class EngineeringSchool extends NYUniversity implements AeronauticalSchool {
	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("Welcome to Computer Lab ");

	}

}
