import java.util.Scanner;
public class LargestOfThree {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the first int value");
    int a = sc.nextInt();
    System.out.println("Give the second int value");
    int b = sc.nextInt();
    System.out.println("Give the third int value");
    int c = sc.nextInt();

    if((a>b)&&(a>c)){
        System.out.println("Largset number :" + a);
    }
    else if((b>a)&&(b>c)){
        System.out.println("Largset number :" + b);
    }
    else {
        System.out.println("Largset number :" + c);
    }
}
}
