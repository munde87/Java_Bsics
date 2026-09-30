import java.util.Scanner;

class Distance {

      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the distance in Km: ");
       double dist = sc.nextDouble();

   double m = dist*1000;
   double c = dist*100000;
   double i = c/2.54;
   double f = i/12;


System.out.print("Distance is in meter is: " +m + "\n" + "Distance is in centimeter is:" +c + "\n" + "Distance is in inch is: " +i +"\n" + "Distance is in feet is: " +f);
}
}
    



