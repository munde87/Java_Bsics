//given a four digit number find out the sum of first and last digit

import java.util.Scanner;

class SumOftwoDigit{

public static void  main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the any four integres: ");
int n = sc.nextInt();

int sum = n/1000 + n%10 ;

System.out.print("Sum of five integers is: " +sum);
}
}