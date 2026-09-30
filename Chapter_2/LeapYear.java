/*Any year is input through the keyboard. Write a program to
determine whether the year is a leap year or not. */


import java.util.Scanner;

class LeapYear
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the year: ");
int y = sc.nextInt();

if ( y%100==0){
  if(y%400==0)
System.out.print(y + " is a leap year ");
  else
System.out.print(y + " is not a leap year ");
}
else{
 if(y%4==0)
System.out.print(y + " is a leap year ");
  else
System.out.print(y + " is not a leap year ");
}
}
}