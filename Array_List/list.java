import java.util.ArrayList;
import java.util.List;

public class list{
    public static void main(String[] args) {
        List<Integer>l1 =new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        System.out.println(l1);

        Object[] arr = l1.toArray();
        System.out.println("Array elements:");
        for (Object element : arr) {
            System.out.print(element + " ");
        }
    }
}