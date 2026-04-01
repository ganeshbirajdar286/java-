public class preinPost{
 public static void main(String[] args) {
     pip(2);
 }

 public static void pip(int n) {
     if(n==0) return;
     System.err.println("FIRST"+n);
     pip(n-1);
     System.err.println("second"+n);
     pip(n-1);
     System.err.println("third"+n);
 }
}