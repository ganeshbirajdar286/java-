import java.util.*;

public class array_addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row: ");
        int n=sc.nextInt();
        System.out.println("enter the size of column: ");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];
        int arr1[][]=new int[n][m];
        int arr2[][]=new int[n][m];

        System.out.println("enter the value of arr ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the value of arr1 ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=arr[i][j]+arr1[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j:arr2[i]){
                System.out.print(j+" ");
            }
        }
    }
}