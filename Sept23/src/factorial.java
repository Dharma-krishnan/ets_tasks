public class factorial {
    public int facto(int n) {
        if (n > 1) {
            return n * facto(n - 1);
        }else{
            return 1;
        }
    }
        public static void main(String args[]){
            int n=5;
            factorial obj=new factorial();
            System.out.println(obj.facto(n));
        }
    }


