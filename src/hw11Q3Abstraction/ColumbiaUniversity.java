package hw11Q3Abstraction;

/*
* Regular Class inherit other Abstract Class or a regular class by extends keyword,
* Regular class  can not inherit interface by extends keyword.
* A regular class can inherit more than one Interface by implements keyword.
*/

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
//public abstract void chemistry();
// regular class is not possible declare method. It is must be implement.
// regular class does not contain abstract method.

	public void biology() {
		System.out.println(" Biology is popular subject in ColumbiaUniversity");
	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
