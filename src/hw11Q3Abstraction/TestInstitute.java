package hw11Q3Abstraction;

public class TestInstitute {
	public static void main(String[] args) {

		ColumbiaUniversity cUniversity = new ColumbiaUniversity();
		cUniversity.aeronauticalInfo();
		cUniversity.anatomyLab();
		cUniversity.biochemistryLab();
		cUniversity.biology();
		cUniversity.cafeteria();
		cUniversity.caring();
		cUniversity.classSize();
		cUniversity.commonRoom();
		cUniversity.dorm();
		cUniversity.emergencyRoom();
		cUniversity.gymnasium();
		cUniversity.hygiene();
		cUniversity.laboratory();
		cUniversity.languageClub();
		cUniversity.lawInfo();
		cUniversity.maths();
		cUniversity.morgue();
		cUniversity.playGround();
		cUniversity.surgeryRoom();
		cUniversity.teacher();
		cUniversity.vocationalInfo();

		MedicalSchool mSchool = new ColumbiaUniversity();
		mSchool.aeronauticalInfo();
		mSchool.anatomyLab();
		mSchool.biochemistryLab();
		mSchool.caring();
		mSchool.hygiene();
		mSchool.lawInfo();
		mSchool.maths();

		University university = new ColumbiaUniversity();
		university.cafeteria();
		university.classSize();
		university.commonRoom();
		university.dorm();
		university.emergencyRoom();
		university.gymnasium();
		university.laboratory();
		university.languageClub();
		university.morgue();
		university.playGround();
		university.surgeryRoom();
		university.teacher();

	}

}
