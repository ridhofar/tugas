package com.javaprogram;

import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> angka = new TreeSet<Integer>();
		angka.add(100);
		angka.add(101);
		angka.add(102);
		angka.add(101);
		angka.add(105);
		angka.add(105);
			System.out.println("coba tampilkan " +angka);
			
			 TreeMap<Integer, String> coba = new TreeMap<Integer, String>();
			    coba.put(1 , "Asus");
			    coba.put(2 , "MSI");
			    coba.put(3 , "Apple");
			    coba.put(4 , "Acer");
			    coba.put(5 , "HP");
			    
			    System.out.println(coba.toString());
		}	
	
}

