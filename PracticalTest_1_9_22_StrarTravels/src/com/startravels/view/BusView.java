package com.startravels.view;
import com.startravels.model.Bus;
import com.startravels.service.BusService;
import java.util.Scanner;
public class BusView {
	Scanner sc=new Scanner(System.in);
	public boolean addBus() {
		boolean addResult=false;
		System.out.println("Enter busID");
		int busId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter busRegistrationNumber");
		int busRegistrationNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter busType");
		String busType=sc.nextLine();
		System.out.println("Enter numberOfSeats");
		int numberOfSeats=sc.nextInt();
		sc.nextLine();
		Bus busObj=new Bus(busId,busRegistrationNumber,busType,numberOfSeats);
		BusService.addBus(busObj);
		return addResult;
		
		
	}
	
	public static void displayBus() {
		Bus b1=new Bus(1,4564,"SleeperAc",50);
		Bus b2=new Bus(2,4261,"NonSleeperNonAc",40);
		
	}

}
