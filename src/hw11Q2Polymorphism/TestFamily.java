package hw11Q2Polymorphism;

public class TestFamily {
public static void main(String[] args) {

		System.out.println("\n -----------------Sister---------------");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(25, 30, 50, "5", 33, 20);
		sister.sister(44, 32, 25, "36", 14);
		sister.sister("35", 36, 25, 75);
		sister.sister(38, 40, 50, "30");
		sister.sister("55", 60, 20);
		sister.sister("42", 70);

		System.out.println("\n -----------------Niece---------------");
		Niece niece = new Niece();
		niece.sister(50, 65, 20, "30", 20, 10);
		niece.sister(44, 32, 20, "36", 80);
		niece.sister("65", 30, 65, 20);
		niece.sister(30, 55, 10, "39");
		niece.sister("62", 42, 82);
		niece.sister("85", 25);

	}

}
