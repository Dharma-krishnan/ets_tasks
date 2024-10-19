public class Gcd {
    public int gcd(int a, int b){
        if(b==0){
         return a;
        }else return gcd(b,a%b);
    }

    public static void main(String args[]){
        int a,b;
        a=24;
        b=36;
        Gcd obj=new Gcd();
        int gcdvalue=obj.gcd(a,b);
        System.out.println("GCD of "+a+ " and "+b+" is "+gcdvalue);
        System.out.println("LCM of "+a+" and "+b+" is "+a*b/gcdvalue);

    }
}
