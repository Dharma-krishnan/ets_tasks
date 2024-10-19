import java.util.Scanner;
public class IntToStr {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int s=inp.nextInt();
        String n=Integer.toString(s);

        if(s>=-100&&s<=100){
            System.out.println("Good Job");
        }else{
            System.out.println("Wrong Answer");
        }


    }
}