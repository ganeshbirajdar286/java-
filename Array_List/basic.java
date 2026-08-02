import java.util.ArrayList;
import java.util.Iterator;

public class basic {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Boolean> l2=new ArrayList<>();
        // ArrayList<Float> l3=new ArrayList<>();

        // add element to list
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(10);

        // get element at index i
        System.out.println(l1.get(0));

        // print a arraylist with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        // print arraylist without loop
        System.out.println(l1);
        // add a element at some index i
        l1.add(1, 4);
        System.out.println(l1); // [1,4,2,3]

        // modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        // removing element at index i
        l1.remove(5);
        System.out.print(l1);

        // removing an element e
        System.out.println(l1.remove(Integer.valueOf(1))); // return type boolean hai
        System.out.println(l1);

        l1.sort(null); // sort  the list and the  null  is need

        // checking if an element exists
        boolean ans = l1.contains(10); // contains :- ko Integer object chahiye,
        // lekin Java autoboxing kar deta hai: Integer.valueOf(10) --> use nahi hai we can use direct 10
        System.out.println(ans);
        
        // if  you don't specify class,you can put anything inside l
        ArrayList<Integer> l = new ArrayList<>();
        l.addAll(l1);
        System.out.println(l);


        // i want to iterate through the list and print all the elements
      Iterator<Integer> it = l.iterator();
      while(it.hasNext()){  // hasnext() return true  if there is a next element in the list and goes to  the next element
            System.out.println(it.next());  // it.next() return the next element list
      }
    }
}