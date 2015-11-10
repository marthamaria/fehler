package Fehler1.src.de.uni_koeln.info.java;

public class Application {

	public static void main(String[] args) {
		Fehler f = new Fehler();
		f.variable = 10;
		f.variable2 = 20;
		f.variable3 = 30;
		f.methode1();
		f.methode2();
		f.methode3();
		System.out.println("Alle Fehler sind verschwunden!");
	}

}
