import java.util.Scanner;
public class FunctionWithNoReturnType {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the int value");
    int n = sc.nextInt();
    printTable(n);
    }
    public static void printTable(int n){
    for(int i=1; i<=10; i++){
        System.out.print(n*i +" ");
    }
    }
}
