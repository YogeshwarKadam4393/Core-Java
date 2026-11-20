package com.covarientReturnType;

public class Dog extends Animal {

	boolean isTrained;
	String breed;

	@Override
	public Animal makeSound() {

		Dog c = new Dog();
		System.out.println("Dog Barks...");
		return c;

	}

	@Override
	public Animal eat() {
		Dog c1 = new Dog();
		System.out.println("Dog Eats Dog Food...");
		return c1;
	}

	@Override
	public Animal setDetails() {

		setName("Dog");
		setAge(5);
		setIsTrained(true);
		setColor("Black");
		setBreed("German Sheiphard");
		setWeight(35);

		return this;

	}

	@Override
	public Animal showDetails() {

		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Trained : " + getIsTrained());
		System.out.println("Color : " + getColor());
		System.out.println("Breed : " + getBreed());
		System.out.println("Weight : " + getWeight());

		return this;
	}

	public boolean getIsTrained() {
		return isTrained;
	}

	public void setIsTrained(boolean isTrained) {
		this.isTrained = isTrained;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [isTrained=" + isTrained + ", breed=" + breed + "]";
	}

	public static void main(String[] args) {

		Dog dog = new Dog();

		System.out.println("Pet Animal --->\n");
		dog.setDetails();
		dog.showDetails();
		dog.eat();
		dog.makeSound();

	}

}
