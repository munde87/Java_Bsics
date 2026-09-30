/*An Insurance company follows following rules to calculate
premium.

(1) If a person’s health is excellent and the person is between
25 and 35 years of age and lives in a city and is a male
then the premium is Rs. 4 per thousand and his policy
amount cannot exceed Rs. 2 lakhs.
(2) If a person satisfies all the above conditions except that
the sex is female then the premium is Rs. 3 per thousand
and her policy amount cannot exceed Rs. 1 lakh.
(3) If a person’s health is poor and the person is between 25
and 35 years of age and lives in a village and is a male
then the premium is Rs. 6 per thousand and his policy
cannot exceed Rs. 10,000.
(4) In all other cases the person is not insured.

Write a program to output whether the person should be
insured or not, his/her premium rate and maximum amount
for which he/she can be insured.*/


import java.util.Scanner;

class Insurance
{
public static void main(String[] args)
{
 char ch = ' ';
Scanner sc = new Scanner(System.in);

do
{

System.out.println("!! HS Group of Insurance PVT LTD !!");

System.out.print("Please enter customers health condition (enter e for excellent / enter p for poor): ");
char health = sc.next().charAt(0);
System.out.print("Please enter the age of customer: ");
int age = sc.nextInt();
System.out.print("Please enter the location of customer (enter c for city / enter v for village): ");
char loc = sc.next().charAt(0);
System.out.print("Please enter the gender of customer (enter m for male / enter f for female): ");
char gender = sc.next().charAt(0);

if((health == 'e' || health == 'E') && (age >= 25 && age <= 35) && (loc == 'c' || loc == 'C') && (gender == 'm' || gender == 'M'))
{
System.out.print("Dear customer congrulation, You are eligiable for insurance policy, Please enter the policy amount upto 2 lakh only: ");
double amt = sc.nextDouble();

if(amt <= 200000)
{
double pre = (amt*4)/1000;
System.out.print("Dear customer your premium is rs: " + pre + " for policy amount rs: " + amt);
}
else 
{
System.out.print("Please check the policy amount its exceeds beyond value of 2 lakh");
}
}



else if((health == 'e' || health == 'E') && (age >= 25 && age <= 35) && (loc == 'c' || loc == 'C') && (gender == 'f' || gender == 'F'))
{
System.out.print("Dear customer congrulation, You are eligiable for insurance policy, Please enter the policy amount upto 1 lakh only: ");
double amt = sc.nextDouble();

if(amt <= 100000)
{
double pre = (amt*3)/1000;
System.out.print("Dear customer your premium is rs: " + pre + " for policy amount rs: " + amt);
}
else 
{
System.out.print("Please check the policy amount its exceeds beyond value of 1 lakh");
}
}

else if((health == 'p' || health == 'P') && (age >= 25 && age <= 35) && (loc == 'v' || loc == 'V') && (gender == 'm' || gender == 'M'))
{
System.out.print("Dear customer congrulation, You are eligiable for insurance policy, Please enter the policy amount upto 10,000 only: ");
double amt = sc.nextDouble();

if(amt <= 10000)
{
double pre = (amt*6)/1000;
System.out.print("Dear customer your premium is rs: " + pre + " for policy amount rs: " + amt);
}
else 
{
System.out.print("Please check the policy amount its exceeds beyond value of 10,000");
}
}

else {
System.out.print("You are not eligible for insurance");
}

System.out.println("Do you want to continue for another customer (y\n)?");
ch = sc.next().charAt(0);
}
while(ch == 'y' || ch == 'Y');
System.out.print("Thank you!");
}
}

