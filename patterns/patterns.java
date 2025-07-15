class patterns{
public static void main(String[]args){

   System.out.println("First Pattern");
for(int i=1; i<=3; i++){
    for(int j=1; j<=i; j++){
        System.out.print(i);
    }
    System.out.println();
}

System.out.println("Second Pattern");
for(int i=1; i<=3; i++){
    for(int j=1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}

System.out.println("Third pattern ");
for(int i=1; i<=3; i++){
    for(int j=3; j>=i; j--){
      System.out.print(j);
    }
    System.out.println();
}

System.out.println("Fourth Pattern");
for(int i=1; i<=3; i++){
    for(int j=3; j>=i; j--){
        System.out.print(j);
    }
    System.out.println();
}

System.out.println("Fifth pattern");
for(int i=1; i<=3; i++){
     for(int j=2;j>=i;j--){
        System.out.print(" ");
     }
    for(int j=1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}

System.out.println("Sixth pattern");
for(int i=0; i<=2; i++){
    for(int j=3-i; j>=1; j--){
        System.out.print(j);
    }
    System.out.println();
}

System.out.println("Seventh pattern");
for(int i=1; i<=3; i++){
    for(int j=2;j>=i; j--){
        System.out.print("-");
    }
    for(int j=1; j<=i; j++){
        System.out.print(i);
    }
    for(int j=2; j<=i; j++){
        System.out.print(i);
    }
    for(int j=2; j>=i; j--){
        System.out.print("-");
    }
    System.out.println();
}

System.out.println("eigth pattern");
for(int i=1; i<=3; i++){
    for(int j=2; j>=i; j--){
         System.out.print("-");
    }
    for(int j=1; j<=i; j++){
        System.out.print(j);
    }
    for(int j=i-1; j>=1; j--){
        System.out.print(j);
    }
    for(int j=2; j>=i; j--){
        System.out.print("-");
    }
    System.out.println();
}

}
}