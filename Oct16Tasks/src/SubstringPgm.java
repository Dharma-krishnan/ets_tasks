import java.util.Scanner;
public class SubstringPgm {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        String s=inp.nextLine();

        int a=inp.nextInt();
        int b=inp.nextInt();
System.out.println(s.substring(a,b));

    }
}
