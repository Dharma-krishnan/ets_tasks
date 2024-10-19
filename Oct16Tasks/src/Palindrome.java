public class Palindrome {
    public static void main(String args[]){
        String A="madam";
        String s="";
        for(int i=A.length()-1;i>=0;i--){
            s+=A.charAt(i);
        }
        if (s.equals(A)) {

            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
