public class Prime_num {
    public boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if(n==2){
            return true;
        }
        if(n>2){
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    return false;
                }

            }
        }
        return true;

    }

    public static void main(String args[]){
        int num=9;
        Prime_num obj=new Prime_num();
        if(obj.isPrime(num)){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
    }
}