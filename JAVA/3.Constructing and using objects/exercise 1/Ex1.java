/*Exercise 1
Create a static function, with the name "bootCamp", that receives as an input two int arguments,
i.e., number1 and number2, and returns an int result in the end. If "number1" is smaller that "number2"
then returns the square root (use Math.sqrt method) of the absolute value (use Math.abs) of the
difference among "number1" and "number2". Else return the sum of the two numbers.
Number1 = 25, Number2 = 91
Number1 = 91, Number2 = 25
*/

import java.util.Scanner;
import java.lang.*;

public class Ex1 {

 public static void main(String[] args) {

   System.out.println("Insert number1: ");
   Scanner scanner1 = new Scanner(System.in);
   int number1 = scanner1.nextInt();

   System.out.println("Insert number2: ");
   Scanner scanner2 = new Scanner(System.in);
   int number2 = scanner2.nextInt();

   System.out.println("result=" + bootCamp(number1, number2));

 }

 public static int bootCamp(int numb1, int numb2) {



     if (numb1 < numb2) {
        int absoluteNumber = Math.abs(numb1-numb2);
        int sqrtNumber = (int)Math.sqrt(absoluteNumber);
        return sqrtNumber;

     } else {
       int sum = numb1 + numb2;
       return sum;

     }

}


}
