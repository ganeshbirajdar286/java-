import  java.util.*;
public class triple_count
{
    //1,4,5,6,3 array
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for (int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }


        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 12) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}