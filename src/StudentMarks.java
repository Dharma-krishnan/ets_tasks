import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int m1,m2,m3,m4,m5, marksSecured, percentage,tot=500;
        System.out.println("Enter English Mark: ");
        m1=inp.nextInt();
        System.out.println("Enter Tamil Mark: ");
        m2=inp.nextInt();
        System.out.println("Enter Science Mark: ");
        m3=inp.nextInt();
        System.out.println("Enter Social Science Mark: ");
        m4=inp.nextInt();
        System.out.println("Enter Maths Mark: ");
        m5=inp.nextInt();

        marksSecured=m1+m2+m3+m4+m5;
        percentage=(marksSecured*100/tot);
System.out.println("Marks Secured: "+marksSecured+"\n"+"Percentage: "+percentage);


    }



}