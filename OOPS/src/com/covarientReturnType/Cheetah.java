package com.covarientReturnType;

public class Cheetah extends Animal {

	boolean isCarnivorous;
	int speed;

	@Override
	public Animal makeSound() {

		Cheetah c = new Cheetah();
		System.out.println("Cheetah Growls...");
		return c;

	}

	@Override
	public Animal eat() {
		Cheetah c1 = new Cheetah();
		System.out.println("Cheetah Eats Meat...");
		return c1;
	}

	@Override
	public Animal setDetails() {

		setName("Cheetah");
		setAge(10);
		setCarnivorous(true);
		setColor("Yellow");
		setSpeed(120);
		setWeight(72);

		return this;

	}

	@Override
	public Animal showDetails() {

		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Carnivorous : " + isCarnivorous());
		System.out.println("Color : " + getColor());
		System.out.println("Speed : " + getSpeed());
		System.out.println("Weight : " + getWeight());

		return this;
	}

	public boolean isCarnivorous() {
		return isCarnivorous;
	}

	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {   
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Cheetah [isCarnivorous=" + isCarnivorous + ", speed=" + speed + "]";
	}

	public static void main(String[] args) {

		Cheetah cheetah = new Cheetah();

		System.out.println("Wild Animal --->\n");
		cheetah.setDetails();
		cheetah.showDetails();
		cheetah.eat();
		cheetah.makeSound();

	}

}
