public class fibonacci {

    static int  Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }

        return Fibonacci(n-1)+Fibonacci(n-2);
    }


    public static void main(String[] args){
        int n=7;
        int term =Fibonacci(n);
        System.out.println(term);
    }
}