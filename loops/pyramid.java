package loops;

import java.util.Scanner;

//public class pyramid {
//    public static void main(String[] args){
//        System.out.println("enter the value of n: ");
//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=(n-i);j++) {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            for(int l = 1; l < i; l++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

public class pyramid {
    public static void main(String[] args){
        System.out.println("Enter the value of n: ");
        try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
}
