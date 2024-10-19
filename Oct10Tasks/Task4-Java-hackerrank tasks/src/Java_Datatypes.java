import java.util.Scanner;
public class Java_Datatypes {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        long m=inp.nextLong();
        for(int i=0;i<1;i++) {
            if(m>=Long.MIN_VALUE && m<=Long.MAX_VALUE) {
                System.out.println(m+" Can be fitted in");
                if (m >= Byte.MIN_VALUE && m <= Byte.MAX_VALUE) {
                    System.out.println("*Byte");
                }
                if (m >= Short.MIN_VALUE && m <= Short.MAX_VALUE) {
                    System.out.println("*Short");
                }
                if (m >= Integer.MIN_VALUE && m <= Integer.MAX_VALUE) {
                    System.out.println("*int");

                }
                System.out.println("*long");


            }else{
                System.out.println(m+"Cannot be fitted");

            }
        }
    }
}
