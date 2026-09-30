/*Ramesh’s basic salary is input through the keyboard. His
dearness allowance is 40% of basic salary, and house rent
allowance is 20% of basic salary. Write a program to calculate
his gross salary. */

import java.util.Scanner;

class Salary {
public static void main(String[] args){

Scanner sc = new Scanner (System.in);

System.out.print("Enter the basic salary: ");

double bs = sc.nextDouble();

double da = (bs*40)/100;
double hr = (bs*20)/100;

double gs = bs+da+hr;

System.out.print("The gross salary is: " +gs);
}
}