
import java.util.ArrayList;
import java.util.List;

public  class parentheseGeneration{
    public static void main(String[] args) {
        int n=3;
        List<String> list=new ArrayList<>();
        generate(n,0,0,"",list);
        System.err.println(list);
    }

    public static void generate(int n,int r,int l,String str,List<String> list) {
        if(r==n){
            list.add(str);
            return;
        }

        if(l<n){
            generate(n, r, l+1, str+"(", list);
        }
        if(r<l){
             generate(n, r+1, l, str+")", list);
        }
    }
}

// TIME COMPLEXITY IS 2^N
// IF A FUCTION IS CALLING TO DIFF FUNCTION SO THERE COMPLEXXITY IS 2^N