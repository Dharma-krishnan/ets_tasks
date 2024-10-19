import java.util.Scanner;
public class ATM {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int bal=0,opt;
        final int MIN_BAL=500;
        int deposit=0, withdraw=0;

while(true) {
    System.out.println("Enter 1 for deposit \nEnter 2 for withdrawal" +
            "\nEnter 3 to Check Balance \nEnter 4 to exit ");
    opt=inp.nextInt();
    switch (opt) {
        case 1:
            System.out.println("---Deposit---");
            System.out.println("Enter the Amount to Deposit: ");
            deposit=inp.nextInt();
            if(deposit>0){
                System.out.println("Rs "+ deposit+ " Deposited");
                bal+=deposit;
                System.out.println("\n");
            }else{
                System.out.println(" Transaction Failed");
            } 
            break;
        case 2:
            System.out.println("---Withdrawal---");
            System.out.println("Enter the Amount to Withdraw");
            withdraw=inp.nextInt();
            if(withdraw>bal){
                System.out.println("Insufficient Balance");
            }
            else if(bal-withdraw>=MIN_BAL){
                bal-=withdraw;
            }
            else{
                System.out.println("Balance May be Insufficient");
            }
            break;
        case 3:
            System.out.println("---Balance Amount---");
            System.out.println("Balance Amount= "+bal);
            System.out.println("\n");
            break;
        case 4:
            System.exit(0);
        default:
            System.out.println("Enter valid input");
    }
}

    }

}
