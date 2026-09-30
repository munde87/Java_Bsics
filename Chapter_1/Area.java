import java.util.Scanner;

class Area{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the radius: ");

double rad = sc.nextDouble();

double area = Math.PI*rad*rad;
double circumference = 2*Math.PI*rad;

System.out.println("Area of circle is: " +area+ " and  Circumference of circle is: " +circumference);

}
}

