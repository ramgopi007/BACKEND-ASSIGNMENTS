import java.util.Scanner;
public class ASS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the length of the array");
        int row = sc.nextInt();
        int[] arr = new int[row];
        System.out.println("Enter the array values");
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int avg =0;
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>0){
                avg += arr[i];
                count++;
            }
        }
        float finalAvg =(float)avg;
        System.out.println(" Average of positive numbers : " +finalAvg/count);
    }
}
