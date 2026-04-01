public class  nth_stair{

    public static  int stair(int n){
        if(n==1 || n==0){
            return  1;
        }
        return stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
        int n=3;
        int i=stair(n);
        System.out.println(i);
    }
}