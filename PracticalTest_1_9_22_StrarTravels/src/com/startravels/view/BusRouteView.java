package com.startravels.view;
import com.startravels.model.BusRoute;
import com.startravels.service.BusRouteService;
import java.util.Scanner;
public class BusRouteView {
	Scanner sc=new Scanner(System.in);
	public boolean addBusRoute() {
		boolean addResult=false;
		System.out.println("Enter Bus Id");
		int busID=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter routeId");
		int busRouteID=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Bus source city");
		String busSourceCity=sc.nextLine();
		System.out.println("Enter bus denstination city");
		String busDestinationCity=sc.nextLine();
		BusRoute busRouteObj=new BusRoute(busID,busRouteID,busSourceCity,busDestinationCity);
		//busRouteObj.addBusRoute();
		return addResult;
	}
	public static void display() {
		BusRoute busRoute1=new BusRoute(1,28,"PUNE","MUMBAI");
		BusRoute busRoute2=new BusRoute(2,13,"MUMBAI","NAGPUR");
	}

}
