import java.util.Scanner;
public class FunctionWithReturnType {
public static void main(String[] args){
    System.out.println(getSquare());

}

public static int getSquare(){
    System.out.println("Give the input value");
    Scanner sc = new Scanner(System.in);
    int b = sc.nextInt();
    return b*b;
}
}
