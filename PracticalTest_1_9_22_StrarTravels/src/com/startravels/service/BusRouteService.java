package com.startravels.service;
import com.startravels.dao.BusRouteDAO;
import com.startravels.model.BusRoute;
public class BusRouteService {
    public boolean addBusRoute(BusRoute busRouteObj) {
    	return BusRouteDAO.addBusRoute(busRouteObj);
    }
}
