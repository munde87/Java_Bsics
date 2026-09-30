//Given any five digit integer number, find out reverse of them

import java.util.Scanner;

class ReverseOfdigit{

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

int rev = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5 * 1;

System.out.print("The rev of given num is : " +rev);
}
}