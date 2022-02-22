package hw9Q3Abstraction;

/* Two keyword used for inheritance in Interface.
 * interface can inherit other Interfaces by extends keyword.
 * interface can inherit regular class and abstract class by implements  keyword.
 * interface can not inherit regular class and abstract class by extends keyword.
 * more than one inheritance is possible.
 * */

public interface University extends College, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
	}

	public static void library() {
	}

}
