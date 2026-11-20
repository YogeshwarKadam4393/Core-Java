package com.covarientReturnType;

public class Animal {

	String name;
	int age;
	String color;
	int weight;

	public Animal makeSound() {

		Animal a = new Animal();
		return a;
	}

	public Animal eat() {

		Animal a1 = new Animal();

		return a1;
	}

	public Animal setDetails() {

		Animal a3 = new Animal();
		return a3;

	}

	public Animal showDetails() {

		Animal a2 = new Animal();

		return a2;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", color=" + color + ", weight=" + weight + "]";
	}

}
