import java.util.Arrays;

public class AnagramorNot {
    public static void main(String args[]){
        String str1="racecar";
        String str2="carRace";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("It is not an anagram");
        }else{
            char a[]=str1.toCharArray();
            char b[]=str2.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b)) {
                System.out.println("Given strings are anagram");

            }else{
                System.out.println("Not an anagram");
            }
        }

    }
}
