public class StringPalindrome {
    public static void main(String args[]){
        String s="racecar";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(rev.equals(s)){
            System.out.println(s+" is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}
