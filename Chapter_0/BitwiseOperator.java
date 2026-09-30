class BitwiseOperator {
public static void main (String[] args){

int A=25 , B=39;
 int C = A&B;
int D = A | B;
int E = A^B;
 A = A<<1;
B = B>>1;

System.out.println("A&B:" +C);
System.out.println("A|B:" +D);
System.out.println("A^B:" +E);
System.out.println("A<<1:" +A);
System.out.println("B>>1:" +B);
}
}