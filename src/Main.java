
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi=2;
		int remainder=20;
		for (int i = 2; i < sayi; i++) {
			if(sayi%i==0) {
			 remainder=0;
			}
		}
		
		if(remainder==0) {
			System.out.println("Sayi asal değildir.");
		}else {
			System.out.println("Sayi asaldir.");
		}
	}

}
