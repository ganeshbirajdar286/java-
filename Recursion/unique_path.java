import  java.util.*;
public class unique_path{

   public static int  unique(int arr[][],int n,int m){
        if (n == 1 && m == 1) 
            return 1;

        if (n == 0 || m == 0) 
            return 0;
      
      return  unique(arr, n, m-1)+unique(arr, n-1, m);
    // without recurssion
    //    long res = 1;

    //     for(int i = 1; i <= m-1; i++){
    //         res = res * (n - 1 + i) / i;
    //     }

    //     return (int)res;
   }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;
         int arr[][]=new int[n][m];
      
      System.err.println("enter the value");
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
      }

     int value=unique(arr,n,m);
    System.err.println("total path are " +value);
    }
}