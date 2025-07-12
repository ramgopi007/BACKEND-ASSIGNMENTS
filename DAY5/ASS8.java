import java.util.Scanner;
public class ASS8 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("count of numbers divisible by 3 : "+arrcount());
}
public static int arrcount(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Give the length of the array");
    int row = sc.nextInt();
    int [] arr= new int[row];
    System.out.println("enter the values ");
    for(int i=0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }

    int count=0;
    for(int i=0; i<=arr.length-1; i++){
        if(arr[i]%3==0){
            count++;
        }
    }
    return count;
}
}
