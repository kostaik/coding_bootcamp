/*
Exercise 2
Create a program that simulates the roll of two dices. The program must execute till
both dices return 1 as a result (use Math.random). You can create a class name Dice which
has a void roll method. Roll method is rolling the dices till the needed results is aquired
and prints the number of rolls needed in order to have two 1s.
*/


import java.lang.*;

public class Dice {

 public static void main(String[] args) {

  roll();

 }

  public static void roll() {
  

  int dice1 = 0;
  int dice2 = 0;
  int check = 0;
  int i = 0;

  while ((dice1 * dice2) != 1) {
   dice1 = (int)(Math.random() * 6 + 1);
   dice2 = (int)(Math.random() * 6 + 1);
   check = dice1 * dice2;
   i++;
   System.out.println("dice1=" + dice1 + "  " + "dice2=" + dice2);
   System.out.println("----------------------------");

  }
  System.out.println("The dices were rolled:" + i + "times");
 }

}
