package com.fanniemae.payroll.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarRepository implements IQuery<String> {
	
	public CarRepository() {
	
	}
	

	@Override
	public ArrayList<String> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Double> findMaps() {
		Map<String,Double> carMap = new HashMap<>();
		
		carMap.put("Lexus", 50_000d);
		carMap.put("RangeRover", 100_000d);
		carMap.put("BMW", 90_000d);			
		
		return carMap;
	}

	

}
