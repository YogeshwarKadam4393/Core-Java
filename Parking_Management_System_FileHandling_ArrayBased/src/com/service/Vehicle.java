package com.service;

import java.io.IOException;

public interface Vehicle {
	
	void addVehicle();
	
	void displayAllParkedVehicles();
	
	void searchForVehicleByVehicleNumber();
	
	void countVehicleByType();
	
	void showFileInformation() throws IOException;

	void backupFile() throws IOException;
	
	void deleteFile() throws IOException;

}
