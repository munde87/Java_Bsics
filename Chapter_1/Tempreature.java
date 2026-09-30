import java.util.Scanner;

class Tempreature{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the temperature in feranite: ");
double fr = sc.nextDouble();

double temp = (fr - 32)*5/9;
System.out.print("Tempreature in degree is: " +temp);

}
}
