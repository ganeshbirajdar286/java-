
import java.util.HashMap;
import java.util.Map;
import java.util.Set;   

public class hashMap_demo{

    public static void main(String args[]){
       HashMap<Integer,String> map= new HashMap<Integer,String>();
       map.put(1,"Amit");
       map.put(1,"ganesh");
       map.put(2,"Rahul");
      System.out.println(map);

      String student=map.get(2);
      System.out.println(student);

      System.out.println(map.containsKey(2));
      System.out.println(map.containsValue("Amit"));

       //  this is used to get all the keys from the map. map.keyset() create a set of all the keys from the map and then we can iterate through the set to get all the values from the map.    
      Set<Integer> keys = map.keySet();
        for(Integer key: keys){
            System.out.println(map.get(key).toUpperCase());
        }

        // this is used to get  all the entries from the map like key and value both.
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String> entry: entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for(Map.Entry<Integer,String> entry: entries){
            System.out.println(entry.getValue().toUpperCase());
        }

        
    }

}