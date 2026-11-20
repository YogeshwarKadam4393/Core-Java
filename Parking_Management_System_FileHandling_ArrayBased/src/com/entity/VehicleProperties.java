package com.entity;

public class VehicleProperties {

    private long vehicleId;
    private String vehicleNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String vehicleType;

    public static long generateVehicleId() {

        long vehicleId = (long) (Math.random() * Math.pow(10, 12));

        return vehicleId;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("| %-10d  | %-15s   | %-12s   | %-12s   | %-12s   | %-15s   |",
				vehicleId,
				vehicleNumber,
				firstName,
				middleName,
				lastName,
				vehicleType);
	}

}