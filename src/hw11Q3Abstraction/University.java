package hw11Q3Abstraction;

/* 
 * Interface can inherit other interfaces by extends keyword.
 * Interface can not inherit regular class or abstract class by extends keyword.
 * Interface can inherit more than one inheritance by extends keyword.
 * Implements keyword can not used interface.
 * */

public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
	}

	public static void library() {
	}
// Interfaces can not allow constructors
//	public University () {
//		
//	}

}
