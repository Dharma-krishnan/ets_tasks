public class palindrome {
    public static void main(String args[]){
        String s="racecar";//intput
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        if(str.equalsIgnoreCase(s)) {
            System.out.println(s+" is a palindrome");
        }else{
            System.out.println(s+" is not a palindrome");
        }
    }
}
