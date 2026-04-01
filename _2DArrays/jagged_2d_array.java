import  java.util.*;

public class jagged_2d_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();

        int arr[][]=new int[n][];
        // this is for column assign  // this give us dynamic space allocation
//        arr[0] = new int[2];
//        arr[1] = new int[4];
//        arr[2] = new int[1];

        // Assign values
//        arr[0][0] = 10; arr[0][1] = 20;
//        arr[1][0] = 30; arr[1][1] = 40; arr[1][2] = 50; arr[1][3] = 60;
//        arr[2][0] = 70;

        for(int i=0;i<3;i++){
            arr[i]=new int[i+1];
            //1st and last  element of every  row is 1
           arr[i][0]=arr[i][i]=1;
           for(int j=1;j<i;j++){
               arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
           }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}