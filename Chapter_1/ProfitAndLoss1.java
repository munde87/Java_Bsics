import java.util.Scanner;

class ProfitAndLoss1{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Selling price of 15 items: ");
double SP = sc.nextDouble();
System.out.print("Enter the profit of 15 items: ");
double profit = sc.nextDouble();

double CP = (SP-profit)/15;

System.out.print("cost price of each item is: " +CP);
}
}










