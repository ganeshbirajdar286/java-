public class builtinmethod {
    public static void main(String[] args){

        // string are immutable
        String s="raghav garg";
        System.out.println(s.indexOf("g"));//this will give first element in string
        System.out.println(s.lastIndexOf("g"));// this will give last elment in string
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.contains("g")); // return true  or false
        System.out.println(s.startsWith("a"));//return true or  false

        String a="ganesh";
        String b="birajdar";
        System.out.println(a.compareTo(b)); // character by character using ASCII/Unicode values. 103 - 98 = 5

        double n=00.700;
        String c=""+n;
        System.out.println(c.length());

        String d="1234";
        System.out.println(Integer.parseInt(d));

        String e="ganesh";
        char arr[]=e.toCharArray(); // convert string in array
        for(char ele:arr){
            System.out.println(ele);
        }

        String f="ganesh";
        String g=new String("ganesh");// this create a new string
        System.out.println(f==g);// returns false
        System.out.println(f.equals(g));
        System.out.println(f.substring(3));
        System.out.println(f.substring(1,4)); // it print for 1 to 3
     

    }
}