import java.util.Scanner;
public class Java_Output_formatting {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        String s1=inp.nextLine();
        int x1=inp.nextInt();
        inp.nextLine();
        String s2=inp.nextLine();
        int x2=inp.nextInt();
        inp.nextLine();

        String s3=inp.nextLine();
        int x3=inp.nextInt();

        System.out.printf("%-15s%03d",s1,x1);
        System.out.println("");
        System.out.printf("%-15s%03d",s2,x2);
        System.out.println("");

        System.out.printf("%-15s%03d",s3,x3);
    }
}
