import java.util.Scanner;
public class BitwiseNot {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Give one negative input integer value");
    int a = sc.nextInt();
    if(a<0) {
        System.out.println( "Signed :"+ (a>>2));
        System.out.println("Unsigned :" +(a>>>2));
    }
    else {
        System.out.println("Your are giving the positive integer ");
    }

}
}
