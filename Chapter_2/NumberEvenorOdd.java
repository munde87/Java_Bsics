/*Any integer is input through the keyboard. Write a program to
find out whether it is an odd number or even number*/


import java.util.Scanner;

class NumberEvenorOdd
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter thge number: ");
int n = sc.nextInt();

if ( n%2==0)
System.out.print(n + " is even number ");
else
System.out.print( n +" is odd number ");

}
}
 