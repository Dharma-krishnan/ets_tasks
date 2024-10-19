public class Strong_Num {
    public int strong(int n){
        int a=0,sum=0;
        while(n>0){
            a=n%10;
            int fact=1;
            for(int i=1;i<=a;i++){
                fact=fact*i;
            }
            sum+=fact;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Strong_Num obj=new Strong_Num();
        int n=145;
        if(n==obj.strong(n)){
            System.out.println(n+" is a strong number");
        }else{
            System.out.println(n+" is not a strong number");
        }

    }
}
