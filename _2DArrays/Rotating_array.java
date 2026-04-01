import  java.util.*;

public class Rotating_array {
    static int[][] extra_array_transpones(int arr[][], int n, int m){
        int arr1[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[j][i]=arr[i][j];
            }
        }

        return arr1;
    }

    static void revers_array(int[][] arr,int n,int m){

        for(int i=0;i<n;i++){
            int last=n-1;
            for(int j=0;j<m/2;j++){
               int temp=arr[i][j];
                arr[i][j]=arr[i][last];
                arr[i][last]=temp;
                last--;
            }
        }

        for(int i=0;i<n;i++){
            for(int j:arr[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row: ");
        int n=sc.nextInt();
        System.out.println("enter the size of column: ");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];

        System.out.println("enter the value of arr ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int transponse[][] =extra_array_transpones(arr,n,m);
        revers_array(transponse,n,m);
    }
}