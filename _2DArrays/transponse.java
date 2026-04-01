import java.util.*;

public class transponse {

    static void extra_array_transpones(int arr[][], int n, int m){
        int arr1[][]=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[j][i]=arr[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j:arr1[i]){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    static void without_extra_array_transpones(int arr[][], int n, int m){
         for (int i = 0; i < n; i++) {
             for (int j = i+1; j < n; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
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
            System.out.println();
        }

       // extra_array_transpones(arr,n,m);
        without_extra_array_transpones(arr,n,m);

    }
}