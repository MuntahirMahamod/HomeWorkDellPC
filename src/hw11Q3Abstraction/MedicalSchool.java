package hw11Q3Abstraction;

/*
* Abstract class can inherit other abstract Class or a regular class by extends keyword,
* Abstract class  can not inherit interface by extends keyword.
* Abstract class can inherit more than one Interface by implements keyword.
*/

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is BiochemistryLab ");

	}

}
