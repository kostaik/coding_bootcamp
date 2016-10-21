
/*
Exercise 4
Convert exercise 1 array and it's elements, from int, to Double. P.S. not double but Double.
*/

import java.util.*;

public class Ex4 {

	public static int[] myArray = new int[10];
	public static double myArrayD[]= new double[10];
	public static Double myArrayDD[]=new Double[10];


	public static void main(String[] args) {


		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i + 1;
		}

  //  System.out.println(Arrays.toString(myArray));

		for (int k = 0; k < myArray.length; k++) {
			myArrayD[k] = (double)myArray[k];
		}

		for (int n = 0; n < myArray.length; n++) {
		myArrayDD[n] = new Double (myArray[n]);
		}


}

}
