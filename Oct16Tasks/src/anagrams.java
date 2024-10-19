import java.util.*;
public class anagrams {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        String a=inp.next();
        String b=inp.next();

        char[] c=a.toCharArray();
        char[] d=b.toCharArray();
int count=0;

        Arrays.sort(c);
        Arrays.sort(d);
        if(c.length==d.length){
            for(int i=0;i<c.length;i++){
                if(c[i]==d[i]){
                    count++;
                }
            }
        }
        if(count==c.length){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not a anagram");
        }

    }
}
