package com.javaprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Ridho");
		names.add("Adlan");
		names.add("andro");
		names.add("Andhiny");
		names.add("Ahmad");
		names.add(3, "dono");
		names.remove(4);
		
		for (String item : names) {
			System.out.println(item);
		}
		// contoh set
		
		HashSet<Integer> rollNumbers = new HashSet<>();
		rollNumbers.add(100);
		rollNumbers.add(101);
		rollNumbers.add(102);
		rollNumbers.add(103);
		rollNumbers.add(102);

		for (Integer item : rollNumbers) {
			System.out.println(item);
		}
		//contoh maps
		HashMap<Integer,String> studentsId = new HashMap<Integer, String>();
		studentsId.put(8, "Gesang");
		studentsId.put(7, "Adlan");
		studentsId.put(10, "Dono");
		studentsId.put(1, "Dony");
		studentsId.put(23, "Ferry");
		
		System.out.println(studentsId.get(10));
		
		for (Integer key : studentsId.keySet()) {
			System.out.println("key is : " + key + " and the names is " + studentsId.get(key));
		}

	}

}
