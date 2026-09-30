//Given any five digit integer number, find out sum of them

import java.util.Scanner;

class SumOffiveDigit{

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

int sum = d1 + d2 + d3 + d4 + d5;

System.out.print("Sum of five integers is: " +sum);
}
}