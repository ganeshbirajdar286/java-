import java.util.*;
public  class pre_calculating_sum_horizontal {
    public static void main(String args[]){
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


        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                arr[i][j]=arr[i][j-1]+arr[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
           System.out.println();
        }
        System.out.println("enter the point for starting r1: ");
        int r1=sc.nextInt();
        System.out.println("enter the point for starting c1: ");
        int c1=sc.nextInt();
        System.out.println("enter the point for ending r2: ");
        int r2=sc.nextInt();
        System.out.println("enter the point for ending c2: ");
        int c2=sc.nextInt();

        for(int i=r1;i<=r2;i++){
         int sum=0;
         if(c1==0){
             sum=arr[i][c2];
         }else {
             sum=arr[i][c2]-arr[i][c1-1];
         }

                System.out.println("the sums is  "+sum);
        }

    }

}