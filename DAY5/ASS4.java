import java.util.Scanner;
public class ASS4 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("give the length of the array");
    int row = sc.nextInt();
    int [] arr = new int[row];
    System.out.println("Enter the array values");
    for(int i=0; i<arr.length-1; i++){
        arr[i] = sc.nextInt();
    }

    int x= 25;
    String result ="";
    for(int i=0; i<arr.length-1; i++){
        if(arr[i]>x){
            result+=arr[i]+" ";
        }
    }

    System.out.println("elements greater than 25 :" + result);
}
}
