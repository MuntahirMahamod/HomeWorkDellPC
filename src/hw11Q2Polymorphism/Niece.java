package hw11Q2Polymorphism;

public class Niece extends Sister {

	@Override
	public void sister() {
		System.out.println(" This is void type method from Niece class");
	}

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println(total1);
	}

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println(total2);
	}

	@Override
	public int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println(total3);
		return total3;
	}

	@Override
	public int sister(String age1, int age2, int age3, int age4) {
		int total4 = Integer.parseInt(age1) + age2 + age3 + age4;
		System.out.println(total4);
		return total4;
	}

	/*
	 * static method can not override, if we remove @override it will work as static
	 * method of this child (Niece) class. Here I used static method
	 * without @override as an example.
	 */
	public static int sister(String age1, int age2, int age3) {
		int total5 = Integer.parseInt(age1) + age2 + age3;
		System.out.println(total5);
		return total5;
	}

	/*
	 * Final type method can not overridden. If remove @override its will not work.
	 * public final int sister(String age1, int age2) { int total6 =
	 * Integer.parseInt(age1) + age2; System.out.println(total6); return total6; }
	 */
}
