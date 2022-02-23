package hw11Q2Polymorphism;

public class Sister {
	// Yes, we can create several methods with the same name.
	// When different methods exist with the same method name but with different parameters or signature, it is called method overloading.

	// void type method is implemented
	public void sister() {
		System.out.println(" This is void type method from sister class");
	}

	// void type parameterize is implemented -01
	public void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println(total1);
	}

	// void type parameterize is implemented -02
	public void sister(int age1, int age2, int age3, String age4, int age5) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println(total2);
	}

	// Return type parameterize is implemented -03
	public int sister(int age1, int age2, int age3, String age4) {
		int total3 = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println(total3);
		return total3;
	}

	// Return type parameterize is implemented -04
	public int sister(String age1, int age2, int age3, int age4) {
		int total4 = Integer.parseInt(age1) + age2 + age3 + age4;
		System.out.println(total4);
		return total4;
	}

	// Static type method is implemented -05
	public static int sister(String age1, int age2, int age3) {
		int total5 = Integer.parseInt(age1) + age2 + age3;
		System.out.println(total5);
		return total5;
	}

	// Return type parameterized method final implemented -06
	public final int sister(String age1, int age2) {
		int total6 = Integer.parseInt(age1) + age2;
		System.out.println(total6);
		return total6;
	}

}
