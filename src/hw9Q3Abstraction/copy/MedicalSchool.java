package hw9Q3Abstraction.copy;

/* One keyword is used for the inheritance in java for Abstract Class.
 * Abstract Class inherit other Abstract Class or a regular class by extends keyword, its can not inherit interface by extends      keyword.
 * Only one inheritance is possible by an Abstract Class.
 */

public abstract class MedicalSchool extends NursingSchool {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is Computer Lab");

	}

}
