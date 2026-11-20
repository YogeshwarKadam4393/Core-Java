package com.inheritance;

public class Oppo extends Samsung { // Heirarchical Inheritance

	String modelName = "Model Name -> Oppo Reno 14";
	String processor = "Processor -> MediaTek Dimensity 8450";
	int price = 37999;

	public void displayDetails() {

		Oppo o = new Oppo();

		System.out.println("Model Name -> " + o.modelName + "    " + "\nProcessor -> " + o.processor + "    "
				+ "\nPrice -> " + o.price);
	}
	
	public static void main(String[] args) {
		
		Oppo o = new Oppo();
		
		System.out.println("Oppo Details    -> \n");
		o.displayDetails();
		System.out.println("------------------------------------------------------------");
		System.out.println("Samsung Details    -> \n");
		System.out.println(o.cameraSensors);
		System.out.println(o.display);
		System.out.println(o.memory);
		System.out.println(o.storage);
		o.Processor();
	}

}
