package hw6Q2IfElseCondition;

public class Voter {

	public static void main(String[] args) {
		int age = 19;

		if (age == 18) {
			System.out.println(" I am a Voter");
		} else if (age < 18) {
			System.out.println(" I am not voter");
		} else if (age >= 18) {
			System.out.println(" I am voter");
		} else {
			System.out.println("Please add a valid age");
		}
	}
}
