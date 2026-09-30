class D {
public static void main(String[] args) {
int i = 5;
int x = ++i + i++;
int y = i++ + x+ ++i - x + 4;
int z = x + y + i++ + i++ + ++i;
System.out.println(i);
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
}