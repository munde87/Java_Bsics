/*In a town, the percentage of men is 52. The percentage of
total literacy is 48. If total percentage of literate men is 35 of
the total population, write a program to find the total number of illiterate men and women if the population of the town is
80,000. */


class Literacy{

public static void main(String[] args){

double pop = 80000;

double total_m = (80000*52)/100;

double total_w= (80000*48)/100;

double lit_m = (80000*35)/100;

double lit_w = (80000*13)/100;

double ilit_m = total_m - lit_m;

double ilit_w = total_w - lit_w;

double total_ilit = ilit_m + ilit_w;

System.out.print("Total illiterate man are: " + ilit_m + "\n" + "Total illiterate women are: " + ilit_w + "\n" + "total: " +total_ilit);

}
}

