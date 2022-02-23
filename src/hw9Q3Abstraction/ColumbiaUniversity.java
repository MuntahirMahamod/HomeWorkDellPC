package hw9Q3Abstraction;

/* two keyword used for  inheritance in Java for a regular Class.
*  Regular Class inherit other Abstract Class or a regular class by extends keyword,
*  its can inherit interface by implements keyword.
* Only one inheritance is possible by an regular Class.
* one more inheritance is possible by an regular  Class by implements keyword.
*/

public class ColumbiaUniversity extends MedicalSchool implements VocationalSchool {
//public abstract void chemistry();
// regular class is not possible declare method. It is must be implement.

	public void biology() {
		System.out.println(" Biology is popular subject in ColumbiaUniversity");
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
public void anatomyLab() {
	// TODO Auto-generated method stub
	
}

@Override
public void hygiene() {
	// TODO Auto-generated method stub
	
}

	}
