import java.util.ArrayList;
import  java.util.Collections;


public class reversList {

    static  void reverse(ArrayList<Integer> list){
           int i=0,j=list.size()-1;
           while(i<j){
            Integer temp =list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
           }

           System.out.println("reverse list for function"+list);

    }

    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        
        System.out.println(list);
        reverse(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }

    
}
