public class printing_1_to_n {
    //  this is for 1 to  n
    static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);         
        System.out.println(n); 
    }

    static void reverse(int m){
        if(m==0){
            return;
        }
        System.out.println("reverse"+ m);
        reverse(m-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int m=5;
        print(n);
        reverse(m);
    }
}
