import java.util.Scanner;

class ProfitAndLoss{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the Selling price of 15 items: ");

double sellingprice_of15 = sc.nextDouble();

double sellingprice_of1 = sellingprice_of15/15;

System.out.print("Enter the profit of 15 items: ");

double profit_of15 = sc.nextDouble();

double profit_of1 = profit_of15/15;

double costprise_of1 = sellingprice_of1-profit_of1;

System.out.print("cost price of each item is: " +costprise_of1);
}
}










