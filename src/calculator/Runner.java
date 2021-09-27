package calculator;

public class Runner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
int a = Implementer1.bilPertama;
int b = Implementer1.bilKedua;
int c = Implementer1.bilKetiga;
	
System.out.println("Penjumlahan :");
System.out.println(a+b);

System.out.println("Perkalian :");
System.out.println(a*b);

System.out.println("Pembagian");
System.out.println(c/b);


String e = null;
try {
	System.out.println(e.charAt(0));
} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	throw new Exception("This is an error");
}
	}

}
