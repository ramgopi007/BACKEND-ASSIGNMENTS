import java.util.Scanner;
public class TypePromotion {
public static void main(String [] args){
Scanner sc =  new Scanner(System.in);
System.out.println("Give the byte , short , char , int values for type promotion ");
System.out.println("Give the byte value");
byte b = sc.nextByte();
System.out.println("Give the Short value");
short s = sc.nextShort();
System.out.println("Give the char value");
char c = sc.next().charAt(0);
System.out.println("Give the int value");
int i = sc.nextInt();
System.out.println("Expression :" + (b+s+c+i)+"( '" + c +"'= " + (c) + ")");


sc.close();
}
}
