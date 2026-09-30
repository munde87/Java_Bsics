import java.util.Scanner;

class InputTest {

public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

//int
System.out.println("Enter int type data");

int num  = sc.nextInt();

System.out.println("Input number is: " + num);

//float
System.out.println("Enter float type data");

float num1 = sc.nextFloat();

System.out.println("Input number is: " + num1);

//double
System.out.println("Enter double type data");

double num2 = sc.nextDouble();

System.out.println("Input number is: " + num2);

//string
System.out.println("Enter string type data");

String w = sc.next();

System.out.println("output is: " + w);

sc.nextLine();

//string
System.out.println("Enter string type data");

String m = sc.nextLine();

System.out.println("output is: " + m);


//char
System.out.println("Enter char type data");
	
char a = sc.next().charAt(4);

System.out.println("output is: " + a);

//boolean
System.out.println("Enter boolean type data");

boolean n = sc.nextBoolean();

System.out.println("output is: " + n);




}
}

