
import java.util.ArrayList;
import java.util.List;

// pick and skip recursion this a type

public class powerset{
    public static void main(String[] args) {
         String s = "abc";
        List<String> result = new ArrayList<>();
        subset("", s, 0, result);
        result.sort(null);
        System.out.println(result);
    }
    public  static  void  subset(String ans, String s, int idx, List<String> list){
          if (idx == s.length()) {
            list.add(ans);
            System.out.println(list);
            return;
        } 

        char ch = s.charAt(idx);
       subset(ans + ch, s, idx + 1, list); // pick -->adding value 
        subset(ans, s, idx + 1, list);  //skip  --> not adding value
        
     }
}