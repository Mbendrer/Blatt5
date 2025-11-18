package h1;

public class H1_main {
	public static void main(String[] args) {

		int[] myArray = {5,6,7,10};
		int status ;

		
		System.out.println("Original Array : " + myArray[0] + " " + myArray[1] + " " + myArray[2] + " " + myArray[3] );

		
				
		for (int i = 0; i < myArray.length / 2; i++){ 
			status = myArray [i];
			myArray[i] = myArray[myArray.length-1-i];
			myArray[myArray.length-1-i] = status;
		
		}
			
		System.out.println("New Array : " + myArray[0] + " " + myArray[1] + " " + myArray[2] + " " + myArray[3] );

		
		

}
}
