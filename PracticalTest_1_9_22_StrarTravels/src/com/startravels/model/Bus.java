package com.startravels.model;

public class Bus {
private int busId;
private int busRegistrationNumber;
private String busType;
private int numberOfSeats;

public Bus() {
	super();
}

public Bus(int busId,int busRegistrationNumber,String busType,int numberOfSeats) {
	super();
	this.busId=busId;
	this.busRegistrationNumber=busRegistrationNumber;
	this.busType=busType;
	this.numberOfSeats=numberOfSeats;
	
}

public int getBusId() {
	return busId;
}

public void setBusId(int busId) {
	this.busId = busId;
}

public int getBusRegistrationNumber() {
	return busRegistrationNumber;
}

public void setBusRegistrationNumber(int busRegistrationNumber) {
	this.busRegistrationNumber = busRegistrationNumber;
}

public String getBusType() {
	return busType;
}

public void setBusType(String busType) {
	this.busType = busType;
}

public int getNumberOfSeats() {
	return numberOfSeats;
}

public void setNumberOfSeats(int numberOfSeats) {
	this.numberOfSeats = numberOfSeats;
}

@Override
public String toString() {
	return "Bus [busId=" + busId + ", busRegistrationNumber=" + busRegistrationNumber + ", busType=" + busType
			+ ", numberOfSeats=" + numberOfSeats + "]";
}


}
