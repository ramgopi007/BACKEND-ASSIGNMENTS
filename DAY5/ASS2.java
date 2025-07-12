import java.util.Arrays;
import java.util.Scanner;
public class ASS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the length of the array");
        int row = sc.nextInt();
        int arr[] = new int[row];
        System.out.println("Enter the values inside the array");
        int i=0;
        while(i<arr.length-1) {
            arr[i] = sc.nextInt();
            i++;
        }
        i=0;

        int count=0;
        String result ="";
        while(i<arr.length-1){
            if(arr[i]%2!=0){
                result+=arr[i]+" ";
                count = count+1;
            }
            i++;
        }

        System.out.println("Postive "+result);
        System.out.println("count :" + count);

    }
}
