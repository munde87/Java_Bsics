/*According to the Gregorian calendar, it was Monday on t
date 01/01/1900. If any year is input through the keyboard
write a program to find out what is the day on 1st January of
this year. */

import java.util.Scanner;

class DayYear
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the year: ");
int y = sc.nextInt();

long totdays = (y -1) * 365L + (y -1)/4 - (y -1)/100 + (y -1)/400 + 1;

int day = (int) totdays % 7;

if (day == 0)
System.out.print("It is a sunday");

else if (day == 1)
System.out.print("It is a monday");

else if (day == 2)
System.out.print("It is a tuesday");

else if (day == 3)
System.out.print("It is a wensday");

else if (day == 4)
System.out.print("It is a thursday");

else if (day == 5)
System.out.print("It is a friday");

else 
System.out.print("It is a saturday");

}
}



