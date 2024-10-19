public class TwinPrimeNumber {
    public static boolean isPrime(int num){
        int div=0;
         div=num/2;

         if(num==0||num==1){
             return false;
         }else if(num>=2) {

             for (int i=2;i<=div;i++){
                 if(num%i==0){
                     return false;
                 }

             }
         }
         return true;

    }
    public static boolean isTwinPrime(int n1, int n2){
        return (isPrime(n1)&& isPrime(n2) && Math.abs(n1-n2)==2);
    }
    public static void main(String args[]){
        int a=17;
        int b=19;
       if(isTwinPrime(a,b)){
           System.out.println(" is a twin prime numbers");
       }else{
           System.out.println("is not a twin prime number");
       }

    }
}
