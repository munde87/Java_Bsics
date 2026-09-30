import java.util.Scanner;

class Area_Triangle {

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the side value of triangle: " );
double a = sc.nextDouble();

System.out.print("Enter the side value of triangle: " );
double b = sc.nextDouble();

System.out.print("Enter the side value of triangle: " );
double c = sc.nextDouble();

double s = (a+b+c)/2;

double Area_T = Math.sqrt(s*(s-a) * (s-b) * (s-c));

System.out.print("Area of triangle: " +Area_T);

}
}