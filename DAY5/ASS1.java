import java.util.Scanner;
public class ASS1 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the length of the array");
    int row = sc.nextInt();
    int arr[] = new int[row];
    System.out.println("Enter the values inside the array");
    for(int i=0; i<arr.length-1; i++){
        arr[i] = sc.nextInt();
    }
    int sum=0;
    for(int i=0; i<arr.length-1; i++){
        if(arr[i]%2==0){
            sum+=arr[i];
        }
    }

    System.out.println("Sum of even elements :" + sum);
}
}
