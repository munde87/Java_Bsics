/*A five-digit number is entered through the keyboard. Write a
program to obtain the reversed number and to determine
whether the original and reversed numbers are equal or not*/

import java.util.Scanner;

class Reversedigitcomp{

public static void  main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the any five integres: ");

int n = sc.nextInt();
int n2 = n;


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

int rev = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5 * 1;

if (rev == n2)
System.out.print("The obtained revserd number is equal to the original number and reversed number is: " +rev);

else
System.out.print("The obtained revserd number is not equal to the original number and reversed number is: " +rev);
}
}

