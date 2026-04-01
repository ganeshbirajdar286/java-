public class passing_variable_string {
    static String string(String x){
        return x="Birajdar";
    }
    public static void main(String[] args){
        String s="ganesh";
         String x=string(s);
        System.out.println(x);
    }
}