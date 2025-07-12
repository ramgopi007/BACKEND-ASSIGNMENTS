import java.util.Scanner;
public class ASS6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of the rows");
        int row = sc.nextInt();
        System.out.println("enter the no of the columns");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter the array values");
        for (int i = 0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[i].length-1; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        String result ="";
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                if(arr[i]==arr[j]){
                    result+=arr[i][j]+" ";
                }
            }
        }
        System.out.println("Diagnoal elements :" + result);
    }
}
