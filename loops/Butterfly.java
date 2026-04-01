//package loops;
// import  java.util.Scanner;
//
//public class Butterfly {
//    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the no of n: ");
//        int n=sc.nextInt();
//           // upper half
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int k=1;k<=(n-i);k++){
//                 System.out.print(" ");
//             }
//             for(int l=1;l<=(n-i);l++){
//                 System.out.print(" ");
//             }
//             for(int m=1;m<=i;m++) {
//                 System.out.print("*");
//             }
//             System.out.println(" ");
//         }
//        //lower half
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int k=1;k<=(n-i);k++){
//                System.out.print(" ");
//            }
//            for(int l=1;l<=(n-i);l++){
//                System.out.print(" ");
//            }
//            for(int m=1;m<=i;m++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}



package loops;
import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

