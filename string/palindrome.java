  public class palindrome {
    public static void main(String[] args){
        String str="dada";
        boolean palindome=true;
        for(int i=0;i<str.length();i++){
            for(int j=str.length()-1;j>=0;j--){
                if(str.charAt(i)!=str.charAt(j)) {
                    palindome=false;
                    break;
                }
            }
            break;
        }
        if(palindome){
            System.out.println("palindome");
        }else {
            System.out.println("not palindome");
        }


    }
}