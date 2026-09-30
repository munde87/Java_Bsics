/*If cost price and selling price of an item is input through the
keyboard, write a program to determine whether the seller has
made profit or incurred loss. Also determine how much profit
he made or loss he incurred.*/

import java.util.Scanner;

class ProfitLoss 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the selling price: ");
double sp = sc.nextDouble();

System.out.print("Enter the Cost price: ");
double cp = sc.nextDouble();

if (cp<sp)
System.out.print("Seller has profit of: " +(sp-cp));
else
System.out.print("Seller has loss of: " +(cp-sp));
}
}


