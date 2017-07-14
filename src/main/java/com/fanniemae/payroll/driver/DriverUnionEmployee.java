package com.fanniemae.payroll.driver;

import com.fanniemae.payroll.UnionEmployee;

public class DriverUnionEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UnionEmployee ue = 
					new UnionEmployee("new", 50_000, 42);
			System.out.println(ue);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
