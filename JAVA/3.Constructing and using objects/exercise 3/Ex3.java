
/*
Exercise 3
Create an array that can receive 10 elements, as a size, and add in each position
an element starting from 1 to 10 statically and print the array. Afterwards, create
a method (function) that can shift the array elements right by 10 times. The 10 is
given by the user as an input. At the end print the shifted array.
*/

import java.util.*;

public class Ex3 {

	public static int[] myArray = new int[10];
	public static int numberShift;

	public static void main(String[] args) {

		System.out.println("Enter number of shifts: ");
		Scanner scanner = new Scanner(System.in);
		numberShift = scanner.nextInt();


		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = i + 1;
		}



		shiftRight(myArray);
	}

	public static void shiftRight(int[] myArray) {
		for (int l = 0; l < numberShift ; l++) {

			int temp = myArray[myArray.length-1];


			for (int i = (myArray.length-1); i > 0; i--) {
				myArray[i] = myArray[i - 1];
			}
			myArray[0] = temp;

			System.out.println(Arrays.toString(myArray));
		}
	}

}
