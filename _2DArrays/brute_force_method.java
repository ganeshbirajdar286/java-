import java.util.*;

public class brute_force_method {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row: ");
        int n=sc.nextInt();
        System.out.println("enter the size of column: ");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];

        System.out.println("enter the value of arr ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("enter the point for starting r1: ");
        int r1=sc.nextInt();
        System.out.println("enter the point for starting c1: ");
        int c1=sc.nextInt();
        System.out.println("enter the point for ending r2: ");
        int r2=sc.nextInt();
        System.out.println("enter the point for ending c2: ");
        int c2=sc.nextInt();

       int sum=0;
        for(int i=c1;i<=c2;i++){
            for(int j=r1;j<=r2;j++){
            sum+=arr[i][j];
            }
        }

        System.out.println("sum of array element for (" + r1 + "," + c1 + ") to (" + r2 + "," + c2 + ") is " + sum);

    }
}