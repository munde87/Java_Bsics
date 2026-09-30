import java.util.Scanner;

class Distance2 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter the co-ordinate for the point A (x1,x2): ");
double x1 = sc.nextDouble();

System.out.print("Enter the co-ordinate for the point A (x1,x2): ");
double x2 = sc.nextDouble();

System.out.print("Enter the co-ordinate for the point B (y1,y2): ");
double y1 = sc.nextDouble();

System.out.print("Enter the co-ordinate for the point B (y1,y2): ");
double y2 = sc.nextDouble();

double d =Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));


System.out.print("Distance between two points: " +d);

}
}

