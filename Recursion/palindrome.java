
public class palindrome{
  public  static  boolean ispaildrome(String s,int i,int j){
       String n= s.toLowerCase();

       while(i<j){
        if(!Character.isLetterOrDigit(n.charAt(i))){
            i++;
            continue;
        }
        if(!Character.isLetterOrDigit(n.charAt(j))){
            j--;
            continue;
        }

        if(s.charAt(i)!=s.charAt(j)) {
            return  false;
        }
        i++;
        j--;
       }

     return true;
  }

    public static void main(String[] args) {
        String s="madam ;";
       boolean result= ispaildrome(s,0,s.length()-1);
       System.err.println(result);
    }
}