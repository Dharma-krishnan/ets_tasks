import java.util.Scanner;
public class Java_Stdin_and_Stdout_II {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        double b=inp.nextDouble();
        inp.nextLine();
        String s=inp.nextLine();
        System.out.println("String: "+s);
        System.out.println("Double: "+b);
        System.out.println("Int: "+a);
    }
}
