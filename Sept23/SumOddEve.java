
public class SumOddEve {
    public static void main(String args[]){
        int n=10;
        int oddsum=0, evesum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                evesum+=i;
            }else if(i%2==1){
                oddsum+=i;
            }
        }
    System.out.println("Sum of odd nums: "+oddsum+"\n Sum of Even numbers: "+evesum);
    }

}
