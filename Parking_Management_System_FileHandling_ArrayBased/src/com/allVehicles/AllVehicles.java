package com.allVehicles;

import com.entity.VehicleProperties;

public class AllVehicles {

    VehicleProperties[] vehicleProp = new VehicleProperties[100];

    public AllVehicles() {

    	VehicleProperties vehicles = new VehicleProperties();
    	
        for (int i = 0; i < vehicleProp.length; i++) {
        	
            vehicleProp[i] = vehicles;
        }
    }

    public VehicleProperties[] addVehicles() {

        return vehicleProp;
    }
}