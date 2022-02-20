package hw9Q3Abstraction.copy;

/* one keyword used for  inheritance in Java for a regular Class.
*  Regular Class inherit other Abstract Class or a regular class by extends keyword, its can not inherit interface by extends      keyword.
* Only one inheritance is possible by an Abstract Class.
*/

public class ColumbiaUniversity extends MedicalSchool {
//public abstract void chemistry();
// regular class is not possible declare method. It is must be implement.

	public void biology() {
		System.out.println(" Biology is popular subject in ColumbiaUniversity");
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}
}
