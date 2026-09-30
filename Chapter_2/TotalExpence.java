import java.util.Scanner;

class TotalExpence
{
public static void main(String[] args)
{
Scanner sc = new Scanner (System.in);

System.out.print("Enter the quantity of purchased item: ");
double q = sc.nextDouble();

System.out.print("Enter the quantity of rate per item: ");
double r = sc.nextDouble();

double dis = 0.0;

if (q >= 1000) 
dis = 0.10;
double totalexp = (q * r) - (q * r * dis);
System.out.print("Total expense Rs: "+totalexp);
}
}

