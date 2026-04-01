import  java.util.*;

public class spiral {

    static void spial_array(int[][] arr,int n,int m){
        int arr1[][]=new int[n][m];
        int rightcol=m-1,topRow=0,bottomRow=n-1,leftcol=0;
        int total=0;

        while (total<n*m) {
            // topRow ->leftCol to rightCol
            for(int j=leftcol;j<=rightcol && total<n*m;j++){
                System.out.print(arr[topRow][j]);
                total++;
            }
            topRow++;

            // rightCol->topRow to BottomRow
            for(int j=topRow;j<=bottomRow && total<n*m;j++){
                System.out.print(arr[j][rightcol]);
                total++;
            }
            rightcol--;
            // bottomRow->rightCol  to leftCol
            for(int j=rightcol;j>=leftcol && total<n*m;j--){
                System.out.print(arr[bottomRow][j]);
                total++;
            }
            bottomRow--;

            // leftcol->bottowRow to topRow
            for(int j=bottomRow;j>=topRow && total<n*m;j--){
                System.out.print(arr[j][leftcol]);
                total++;
            }
            leftcol++;


        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row: ");
        int n=sc.nextInt();
        System.out.println("enter the size of column: ");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        spial_array(arr,n,m);
    }
}