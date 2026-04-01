package _2DArrays;

public class basic {
    public static void main(String[] args){
    //     try (Scanner sc = new Scanner(System.in)) {
    //     System.out.println("enter the value  of row: ");
    //     int row=sc.nextInt();
    //     System.out.println("enter the  value of  col: ");
    //     int col=sc.nextInt();

    //     int arr[][]=new int[row][col];

    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++) {
    //             arr[i][j] = sc.nextInt();
    //         }
    //     }


    //     for(int i=0;i<row;i++){
    //         for(int j=0;j<col;j++) {
    //             System.out.print(arr[i][j]);
    //         }
    //         System.out.println(" ");
    //     }
    // }


    int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
    //   for(int i=0;i<3;i++){
    //         for(int j=0;j<3;j++) {
    //             System.out.print(arr[i][j]);
    //         }
    //         System.out.println(" ");
    //     }
     for(int i=0;i<3;i++){
    for(int elem :arr[i]){
        System.out.println(elem);
    }}
    }
}
