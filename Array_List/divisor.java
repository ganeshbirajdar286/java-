import java.util.List;
import java.util.ArrayList;
import  java.util.Scanner;

public class divisor {
    public static  void  main(String[] args){
        List<Integer> l1 =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number ");
        int num = sc.nextInt();
    

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                l1.add(i);
            }
        }
        

        System.out.println("Divisors are: " + l1);

        sc.close();
    }
}