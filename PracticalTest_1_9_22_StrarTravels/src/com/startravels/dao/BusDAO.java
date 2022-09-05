package com.startravels.dao;
import com.startravels.model.Bus;
import com.startravels.view.BusView;
import com.startravels.service.BusService;
public class BusDAO {
   private static  Bus busArray[]=new Bus[2];

public static boolean addBus(Bus busObj) {
	boolean result=false;
	for (int i=0;i<busArray.length;i++) {
		if(busArray[i]==null) {
			busArray[i]=busObj;
			result=true;
			break;
		}
	}
	System.out.println(busArray[0]);
	return result;
	
}
public Bus[]displayAllBus(){
	Bus busArrayToDisplay[]=null;
	return busArrayToDisplay;
}
}
