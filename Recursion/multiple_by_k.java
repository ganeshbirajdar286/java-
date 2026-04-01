public class multiple_by_k {

    public static void table(int k){
        int n=12;
        if(k==0){
            return;
        }
        table(k-1);
        System.out.println(k*n);

        
    }

    public static void main(String[] args){
        int k=5;
        table(k);
    }
}