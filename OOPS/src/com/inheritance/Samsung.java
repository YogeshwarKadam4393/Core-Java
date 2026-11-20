package com.inheritance;

public class Samsung {

	String display = "Display -> Amoled Display";
	String cameraSensors = "Camera Sensors -> ISOCELL";
	String storage = "Storage -> UFS 3.1 & UFS 4.0";
	String memory = "Memory -> LPDR5X RAM";

	public void Processor() {
		String processor = "Processor -> Exynos";

		Samsung s = new Samsung();

		System.out.println(processor);
	}

}
