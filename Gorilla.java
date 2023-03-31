public class Gorilla extends Mammal {
	public Gorilla(int energy) {
		super(energy);
	}
	public void throwSomething() {
		System.out.println("The gorilla threw something.");
		energy -= 5;
	}
	public void eats() {
		System.out.println("The gorilla ate a banana.");
		energy += 10;
	}
	public void climb() {
		System.out.println("The gorilla climbed a tree.");
		energy -= 10;
	}
}