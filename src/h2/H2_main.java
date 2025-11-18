package h2;

public class H2_main {
	public static void main(String[] args) {

		int n = 299;
		int digits = 0;
		int[] a = {0,0,0,0,0,0,0,0,0};
		int status = n;

		
		
		if (n == 0) {
			digits = 1;
		} else {
			while (status > 0) {
				status = status / 10;
				digits = digits + 1;
				
			}
		}
		
		status = n;
		int index = 8;
		
		while ( status > 0) {
			a[index] = status % 10;
			status = status / 10;
			index = index - 1;

	}
		
		
//		for (int i = 8; i >= 9 - digits; i--) {
//				a[i] = status % 10;
//				status = status / 10;
				
		
		
		
		
		
		
		System.out.println("Anzahl der Ziffern: " + digits);
		for (int i = 0; i <a.length; i++) {
		System.out.print(a[i] + " " );

		}
		
}
}
