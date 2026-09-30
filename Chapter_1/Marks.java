/*If the marks obtained by a student in five different subjects
are input through the keyboard, find out the aggregate marks
and percentage marks obtained by the student. Assume that
the maximum marks that can be obtained by a student in each
subject is 100. */

import java.util.Scanner;

class Marks{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the first sub marks: ");
double s1 = sc.nextDouble();

System.out.print("Enter the second sub marks: ");
double s2 = sc.nextDouble();

System.out.print("Enter the third sub marks: ");
double s3 = sc.nextDouble();

System.out.print("Enter the fourth sub marks: ");
double s4 = sc.nextDouble();

System.out.print("Enter the fifth sub marks: ");
double s5 = sc.nextDouble();

double m = s1+s2+s3+s4+s5 ;
System.out.print("The aggregrate marks got by Student is: " +m);

double per = (m/500)*100;

System.out.print("The percentage got by Student is: " +per);


}
}
