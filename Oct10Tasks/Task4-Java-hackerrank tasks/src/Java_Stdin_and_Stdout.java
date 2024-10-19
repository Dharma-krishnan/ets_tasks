import java.util.Scanner;
public class Java_Stdin_and_Stdout {
    public static void main(String args[]){
        Scanner inp= new Scanner(System.in);
        int a=inp.nextInt();
        int b=inp.nextInt();
        int c=inp.nextInt();
        System.out.println(a +"\n"+b+"\n"+c);
    }
}
