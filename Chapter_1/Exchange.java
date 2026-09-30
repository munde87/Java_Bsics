import java.util.Scanner;

class Exchange{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the value of A: ");

int A = sc.nextInt();

System.out.print("Enter the value of B: ");

int B = sc.nextInt();

System.out.println("The value of A is :" +A + "The Value of B is :" +B +" Before exchange");

int temp = A;
A = B;
B = temp;

System.out.print("The value of A is :" +A + "The Value of B is :" +B +" After exchange");

}
}
