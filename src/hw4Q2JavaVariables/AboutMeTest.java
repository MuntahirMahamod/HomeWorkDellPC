package hw4Q2JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
//		Constructor initialized here
		AboutMe aboutMe1 = new AboutMe();
//		variables initialized 
		aboutMe1.name = "Muntahir Mahamod";
		aboutMe1.myAge = 30;
		aboutMe1.myMonthlyHouseRent = 2000;
		aboutMe1.myYearlySalary = 1012490;
		aboutMe1.myBankBalance = 27389999;
		aboutMe1.myHeight = 5.11f;
		aboutMe1.myGrade = 4.00000;
		aboutMe1.sex = 'M';
		aboutMe1.usCitizen = false;
		aboutMe1.myCar = "Rav4";
//		Method initialized
		aboutMe1.aboutMyInformation();

		System.out.println("\n------------------------This is all about my friend Alex--------------------------------------\n");
		
		AboutMe aboutMe2 = new AboutMe();
		aboutMe2.name = "Alex";
		aboutMe2.myAge = 40;
		aboutMe2.myMonthlyHouseRent = 1800;
		aboutMe2.myYearlySalary = 190000;
		aboutMe2.myBankBalance = 300000;
		aboutMe2.myHeight = 6.2f;
		aboutMe2.myGrade = 4.20000;
		aboutMe2.sex = 'M';
		aboutMe2.usCitizen = true;
		aboutMe2.myCar = "BMW";
		aboutMe2.aboutMyInformation();
	}
}