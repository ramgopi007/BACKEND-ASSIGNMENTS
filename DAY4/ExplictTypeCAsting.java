import java.util.Scanner;
public class ExplictTypeCAsting {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the float as input");
    float f = sc.nextFloat();
    if((f<Float.MAX_VALUE)&&(f>Float.MIN_VALUE)){
        int i = (int)f;
        System.out.println("To Int : " +i);
        byte b =(byte)f;
        System.out.println("To byte :" + b);
    }
    else {
        System.out.println("You are not giving the float value");
    }
    sc.close();
}
}
