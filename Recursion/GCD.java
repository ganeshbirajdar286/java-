public  class GCD {

    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args){
        int n=24,m=15;
        int num= gcd(n,m);
        System.out.println(num);
    }
}