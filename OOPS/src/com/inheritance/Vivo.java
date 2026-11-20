package com.inheritance;

public class Vivo extends Samsung {   // Single Inheritance

	String modelName = "Vivo v50";
	int ram = 12;
	String camera = "50 MP";
	int price = 34999;

	public void displayDetails() {

		Vivo v1 = new Vivo();

		System.out.println("Model Name -> " + v1.modelName + "    " + "\nRam -> " + v1.ram + "    " + "\nCamera -> " + v1.camera
				+ "    " + "\nPrice -> " + v1.price);
	}
	
	public static void main(String[] args) {
		
		Vivo v = new Vivo();
		
		System.out.println("Vivo Details    -> \n");
		v.displayDetails();
		System.out.println("------------------------------------------------------------");
		System.out.println("Samsung Details    -> \n");
		System.out.println(v.cameraSensors);
		System.out.println(v.display);
		System.out.println(v.memory);
		System.out.println(v.storage);
		v.Processor();
	}

}
