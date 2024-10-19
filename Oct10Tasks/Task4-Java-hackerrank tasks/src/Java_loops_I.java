import java.util.Scanner;
public class Java_loops_I {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();

        for(int i=1;i<=10;i++){
            int res= n*i;
            System.out.println(n+" x "+i+" = "+res);
        }

    }
}
