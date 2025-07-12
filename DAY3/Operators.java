import java.util.Scanner;
public class Operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Assignment - 1- Day 3 ");
        System.out.println("Take the datatypes input from the user and print there range also");
        System.out.println("Enter the Byte value");
        byte b = sc.nextByte();
        System.out.println("Enter the Short value");
        short s = sc.nextShort();
        System.out.println("Enter the int value");
        int i = sc.nextInt();
        System.out.println("Enter the Long value");
        long l = sc.nextLong();
        System.out.println("Enter the float value");
        float f = sc.nextFloat();
        System.out.println("Enter the Double value");
        double d = sc.nextDouble();
        System.out.println("Byte :" + b + " Range :" + Byte.MIN_VALUE + " to"+ Byte.MAX_VALUE);
        System.out.println("Short :" + s + " Range :" + Short.MIN_VALUE + " to"+ Short.MAX_VALUE);
        System.out.println("Int :" + i + " Range :" + Integer.MIN_VALUE + " to"+ Integer.MAX_VALUE);
        System.out.println("Long :" + l + " Range :" + Long.MIN_VALUE + " to" + Long.MAX_VALUE);
        System.out.println("Float :" + f + " Range :" + Float.MIN_VALUE + " to"+ Float.MAX_VALUE);
        System.out.println("Double :" + d + " Range :" + Double.MIN_VALUE + " to"+ Double.MAX_VALUE);

     System.out.println("Assignment - 2 ");
     System.out.println("Give two inputs and do all the calculations");
     System.out.println("Give the first value");
     int x = sc.nextInt();
     System.out.println("Give the Second value");
     int y = sc.nextInt();
     System.out.println("Addition :" + (x+y));
     System.out.println("Subtraction :" + (x-y));
     System.out.println("Multiplication :" + (x*y));
     System.out.println("Division :" + (x/y));
     System.out.println("Modulus :" + (x%y));
     System.out.println("Greater than :" + (x>y));
     System.out.println("Less than :" + (x<y));
     System.out.println("Equal to :" + (x==y));
     System.out.println("Logical AND : " + ((x>y)&&(y<x)));
     System.out.println("Logical OR :" + ((x<y)||(y>x)));
     System.out.println("Bitwise AND :" + (x&y));
     System.out.println("Bitwise OR :" + (x|y));
     System.out.println("Left Shift :" + (x<<y));
     System.out.println("Right Shift :" + (x>>y));

        System.out.println("Assignment - 3 ");
        System.out.println("Take the input and use ternary operator to check whether it is odd or even ");
       System.out.println("Give me one input value");
       int h = sc.nextInt();
       System.out.println(h%2==0?"The Number "+ h +" is Even ": "The Number "+ h+" is Odd");

        System.out.println("Assignment - 4 ");
        System.out.println("Give the input for post and pre increment and decrement");
        int p = sc.nextInt();
        System.out.println("Original :" + p);
        System.out.println("Pre - Increment :" + (++p));
        System.out.println("Post - Increment :" + (p++) + "(Printed), then becomes " + p);
        System.out.println("Pre - decrement : " +(--p));
        System.out.println("Post - decrement :" + (p--)+ "(Printed), then becomes " + p);

        System.out.println("Assignment - 5");
        System.out.println("Swap two numbers without third value ");
        System.out.println("Give the first value");
        int n = sc.nextInt();
        System.out.println("Give the second value");
        int m = sc.nextInt();
        System.out.println("Before swap : n = " + n + " m = " + m);
        System.out.println("After swap : n = " + (n+n) + " m = "+ (m-n));

        System.out.println("Assignment - 6");
        System.out.println("Take temperature in celsius and convert into Fahrenheit ");
        System.out.println("Give the celsius ");
        float e = sc.nextFloat();
        System.out.println("Fahrenheit :" + ((e*9/5)+32));

        System.out.println("Assignment - 7");
        System.out.println("Take the length and breadth as input and calculate");
        System.out.println("Give the length ");
        int j = sc.nextInt();
        System.out.println("Give the Breadth");
        int k = sc.nextInt();
        System.out.println("Area :" + (j*k));
        System.out.println("Perimeter :" + (2 * (j+k)));

    }
}
