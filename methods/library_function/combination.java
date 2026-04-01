package methods.library_function;

public class combination {
    public static void main(String[] args){
        int n=5;
        int r=3;

        int nfact=nfact(n);
        int rfact=rfact(r);
        int n_rfact=n_rfact(n,r);

        int ncr= (nfact)/(rfact*n_rfact);
        System.out.println("combination of "+n+"C"+r+"="+ncr);

    }
    public static int nfact(int n){
        int a=1;
        for(int i=n;i>=1;i--){
             a*=i;
        }
        return a;
    }
    public static int rfact(int r){
        int a=1;
        for(int i=r;i>=1;i--){
            a*=i;
        }
        return a;
    }
    public static int n_rfact(int n,int r){
        int a=1;
        int n_r=n-r;
        for(int i=n_r;i>=1;i--){
            a*=i;
        }
        return a;
    }
}


