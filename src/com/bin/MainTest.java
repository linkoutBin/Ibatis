package com.bin;

import com.bin.service.Service;
import com.bin.service.impl.ServiceImpl;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new ServiceImpl();
		String id = service.find("20170426132956074593");
		System.out.println(id);
		//System.out.println(String.format("%1$-1s","CZZZ010"));
	}

}
