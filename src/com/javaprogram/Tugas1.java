package com.javaprogram;

import java.util.HashMap;

public class Tugas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> workId = new HashMap<>();
		workId.put("guru", "Gesang");
		workId.put("Presiden", "Adlan");
		workId.put("Manager", "Dono");
		workId.put("Direktur", "Dony");
		workId.put("Cheff", "Ferry");
		
		System.out.println(workId.get("Direktur"));
		
		for (String key : workId.keySet()) {
			System.out.println("Work is " + key + " and the names is : " + workId.get(key)); 
		}
	}

}
