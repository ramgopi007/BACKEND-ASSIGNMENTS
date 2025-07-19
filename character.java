public class character {
    public static void main(String[] args) {

        char ch = 'A';
        System.out.println("1.");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(ch);
            } 
            System.out.println();
        }

        System.out.println("2.");
        char a = 'A';
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(a);
            }
            a++;
            System.out.println();
        }

        System.out.println("3.");
        char c = 'A';
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

        System.out.println("4.");
        for (int i = 1; i <= 3; i++) {
            char b = 'A';
            for (int j = 1; j <= 3; j++) {
                System.out.print(b);
                b++;
            }
            System.out.println();
        }

        System.out.println("5.");
        for (int i = 0; i <= 2; i++) {
            char d = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(d);
                d++;
            }
            System.out.println();
        }

        System.out.println("6.");
        for (int i = 1; i <= 5; i++) 
        {
            for (int j = 1; j <= 5; j++) 
            {
                if (i == j||i+j==6) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("7.");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            i=i+5;
            System.out.println();
        }

        System.out.println("8.");
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(i==4||j==4||j==1&&(i==1||i==5||i==6||i==7)||i==7&&(j==5||j==6||j==7)||i==1&&(j==2||j==3)||j==7&&(i==2||i==3||i==1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

          System.out.println("9.");
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                if(i==4||i==7&&(j==5||j==6||j==7)||i==1&&(j==2||j==3)||i==1&&j==1){
                    System.out.print("-");
                }
                else if(j==1&&(i==5||i==6||i==7)||j==4||j==7&&(i==2||i==3||i==1)){
                    System.out.print("|");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }

    }

}
