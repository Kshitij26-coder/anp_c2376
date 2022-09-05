package com.startravels.service;
import com.startravels.model.Bus;
import com.startravels.dao.BusDAO;
public class BusService {
	public static boolean addBus(Bus busObj) {
		return BusDAO.addBus(busObj);
	}

}
