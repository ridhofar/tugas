package com.javaprogram;

public class CodingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kata = "Hello World";
		String kataBaru = "Hallo Dunia";
		System.out.println(kata);
		System.out.println(kataBaru);
		
		int i = 10;
		int j = 5;
		System.out.println(i+j);
		System.out.println(kata +" "+ kataBaru);
		System.out.println(kata+ " "+ i +" "+j);
		
		double hargaRonaldo = 10.5;
		System.out.println(hargaRonaldo);
		
		String gabunganKata = kata +" "+ kataBaru;
		System.out.println(gabunganKata.equalsIgnoreCase("Hello World Hallo Dunia"));
		System.out.println(gabunganKata.length());
		System.out.println(gabunganKata.substring(3, gabunganKata.length()));
		
		String checkRegex = "Pandemi2021";
		System.out.println(checkRegex.replaceAll("[0-9]", ""));
		
		String namaMakanan ="Mie NasiGoreng Bakso Cilok Batagor ketoprak spageti steak silor pizza burger sate ayamgoreng";
		String[] arraynamaMakanan = namaMakanan.split(" ");
		//System.out.println(arraynamaMakanan[2]);
		//System.out.println(arraynamaMakanan[3]);
		
		for (int a = 0; a < arraynamaMakanan.length;a++) {
			System.out.println(arraynamaMakanan[a]);
		}
		String menuItem = "//a[contains(text(),%s)]";
		System.out.println(String.format(menuItem, "Log in"));
		System.out.println(String.format(menuItem, AppEnums.LOGIN.getString()));
		System.out.println(String.format(menuItem, "Register"));
		System.out.println(String.format(menuItem, AppEnums.REGISTER.getString()));

	}

}
