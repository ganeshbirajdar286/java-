public class sum_integer {

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int digit = n%10;
        n=n/10;
        return  digit+sum(n);
    }

    public static void main(String args[]){
        int n=123;
        int m=sum(n);
        System.out.println(m);
    }
}