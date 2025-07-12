import java.util.Scanner;
public class ASS3 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("give the length of the array");
    int row = sc.nextInt();
    int [] arr = new int[row];
    System.out.println("Enter the array values");
    for(int i=0; i<arr.length-1; i++){
        arr[i] = sc.nextInt();
    }

    int largest = 0;
    for(int i=0; i<arr.length-1; i++) {
        if (largest < arr[i]) {
            largest = arr[i];
        }
    }

    System.out.println("Maximum element :" + largest);
    if(largest%2==0){
        System.out.println("It is an Even Number");
    }
    else {
        System.out.println("It is an Odd Number");
    }
}
}
