import java.util.Scanner;
public class ASS7 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum =0;
    int values =0;
    do{
        System.out.println("Give the int value ");
        values = sc.nextInt();
        sum+=values;
    }while(values!=0);

    System.out.println("Sum :" + sum);
}
}
