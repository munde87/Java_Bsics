/*Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical
operators && and ||. */

import java.util.Scanner;

class LeapYearbylogical
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the year: ");
int yr = sc.nextInt();

if((yr%100 == 0 && yr % 400 == 0) || (yr % 100 != 0 && yr % 4 == 0))
System.out.print(yr + " year is leap year");
else
System.out.print(yr + " year is not a leap year");
}
}




