import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Rombusz kerület, terület számítása");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Oldal: ");
	String sideStr = sc.nextLine();
	double side = Double.parseDouble(sideStr);

	System.out.print("Alfa: ");
	String alphaStr = sc.nextLine();
	double alpha = Double.parseDouble(alphaStr);

	
	double perimeter = side * 4;
	double rad = alpha * Math.PI / 180;
	double area = Math.pow(side, 2) * Math.sin(rad);
	
	//Formázott kimenet:
	System.out.printf("Kerület: %.2f\n", perimeter);     //%f -> formátumkód(valós szám), %d(egész szám), %s(string)
	
	System.out.printf("Terület: %.2f", area);
	
	}
}