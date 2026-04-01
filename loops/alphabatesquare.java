package loops;

public class alphabatesquare {
    public static void main(String[] args){
        int a= 64;
        for(int i=1;i<=4;i++){
            for(int  j=1;j<=4;j++){
                a++;
                System.out.print(" "+(char)a);
            }
            a=64;
            System.out.println(" ");
        }
    }
}
