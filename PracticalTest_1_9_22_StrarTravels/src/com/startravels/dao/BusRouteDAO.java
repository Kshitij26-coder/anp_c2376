package com.startravels.dao;
import com.startravels.model.BusRoute;

public class BusRouteDAO {
	private static BusRoute[] busRouteArray=new BusRoute[2];
public static boolean addBusRoute(BusRoute busRouteObj) {
	boolean result=false;
	for (int j=0;j<busRouteArray.length;j++) {
		if(busRouteArray[j]==null) {
			busRouteArray[j]=busRouteObj;
			result=true;
			break;
		}
	}System.out.println(busRouteArray[0]);
	return result;
}
public BusRoute[]displayAllBusRoute(){
	BusRoute busRouteArray[]=null;
	return busRouteArray;
}
}
