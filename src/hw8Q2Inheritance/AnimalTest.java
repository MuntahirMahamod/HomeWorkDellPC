package hw8Q2Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		animal.animalInfo();

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		animal.animalInfo();

		Birds birds = new Birds();
		birds.birdsInfo();
		animal.animalInfo();

		Dog dog = new Dog();
		dog.dogInfo();
		mammal.mammalInfo();
		animal.animalInfo();

		Snake snake = new Snake();
		snake.snakeInfo();
		reptile.reptileInfo();
		animal.animalInfo();

		Robin robin = new Robin();
		robin.robinInfo();
		birds.birdsInfo();
		animal.animalInfo();

		// Mammal extend Animal. This is single line inheritance
		// bulldog extend dog, dog extend mammal, mammal extend Animal. This is
		// multilevel inheritance
		// mammal extend animal, reptile extend animal, birds extend animal. its call
		// hierarchical inheritance

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		dog.dogInfo();
		mammal.mammalInfo();
		animal.animalInfo();

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		snake.snakeInfo();
		reptile.reptileInfo();
		animal.animalInfo();
	}

}
