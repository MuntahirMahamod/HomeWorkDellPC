package hw10Q3Abstraction;

/*
* Abstract class can inherit other abstract Class or a regular class by extends keyword,
* Abstract class  can not inherit interface by extends keyword.
* Abstract class can inherit more than one Interface by implements keyword.
*/

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is Computer Lab");

	}

}
