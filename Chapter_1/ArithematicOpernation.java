import java.util.Scanner;

class ArithematicOpernation {
public static void main (String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Please enter the first num: ");

double num = sc.nextDouble();

System.out.print("Please enter the first num2: ");

double num2 = sc.nextDouble();

double res = num+num2;
System.out.println("The addition of  two numbers is: " +res);

res = num-num2;
System.out.println("The substration of  two numbers is: " +res);

res = num*num2;
System.out.println("The multiplication of  two numbers is: " +res);

res = num/num2;
System.out.println("The Division of  two numbers is: " +res);

res = num%num2;
System.out.println("The reminder of  two numbers is: " +res);

}
}
