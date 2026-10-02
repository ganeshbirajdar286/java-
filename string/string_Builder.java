public class string_Builder {
    public static void main(String[] args){
        StringBuilder s=new StringBuilder("ganesh");
        System.out.println(s);
        s.append("birajdar");
        System.out.println(s);

        System.out.println(String.valueOf(45).length());
        System.out.println(s.capacity());

    }
}