package com.inheritance;

class Mobile {

    String brand = "Samsung";
    int ram = 8;

    public void calling() {
        System.out.println("Calling Feature");
    }

    public void messaging() {
        System.out.println("Messaging Feature");
    }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
}