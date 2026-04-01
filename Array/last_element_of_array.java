import java.util.*;
public class last_element_of_array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value for n: ");
        int n= sc.nextInt();
        int m=-1;
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("enter value for k: ");
        int k =sc.nextInt();
        for(int i=0;i<n;i++){
            if(k==arr[i]){
                m=i;
            }
        }
        System.out.println("The last element of the array is : "+ m);

    }
}