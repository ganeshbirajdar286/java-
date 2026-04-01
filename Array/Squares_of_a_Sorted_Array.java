package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int arr[]=new int[5];
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter value for array: ");
             for (int i = 0; i< arr.length; i++) {
                   arr[i]=sc.nextInt();
             }
             for (int j = 0; j< arr.length; j++) {
                   arr[j]=(int)Math.pow(arr[j], 2);
             }
                   Arrays.sort(arr);
              System.out.println("Squared & Sorted Array: " + Arrays.toString(arr));
        }
    }
}
