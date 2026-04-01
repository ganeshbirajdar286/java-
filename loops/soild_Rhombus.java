package loops;
import  java.util.Scanner;
public class soild_Rhombus {
    public  static void main(String[] args){
     try (Scanner sc = new Scanner(System.in)) {
      System.out.print("enter the value of n: ");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
          for(int j=4;j>=i;j--){
              System.out.print(" ");
          }
          for(int k=1;k<=n;k++){
              System.out.print("*");
          }
          System.out.println(" ");
      }
    }
}
}
