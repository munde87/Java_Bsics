/*If a five-digit number is input through the keyboard, write a
program to print a new number by adding one to each of its
digits. For example if the number that is input is 12391 then
the output should be displayed as 23402. */


import java.util.Scanner;

class Adding_one{

public static void  main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the any five integres: ");

int n = sc.nextInt();


int d1 = n%10;
n = n/10;

int d2 = n%10;
n = n/10;

int d3 = n%10;
n = n/10;

int d4 = n%10;
n = n/10;

 int d5 = n%10;
n = n/10;

int ad = (d5+1)* 10000 + (d4+1) * 1000 + (d3+1) * 100 + (d2+1) * 10 + (d1+1) * 1;

System.out.print("The rev of given num is : " +ad);
}
}