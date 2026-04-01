package loops;
 import  java.util.Scanner;
public class numberecentangel {
    public static void  main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the value of r: ");
        int r= sc.nextInt();
        System.out.println("enter the value of c: ");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
}
