import java.util.Scanner;
public class FunctionWithParameters {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the first int value");
    int i = sc.nextInt();
    System.out.println("Give the second int value");
    int j = sc.nextInt();
    System.out.println(" Greater Number is : "+ max(i,j));

}

public static int max(int x, int y){
    if(x>y){
    return x;
}
else {
    return y;
}
}
}
