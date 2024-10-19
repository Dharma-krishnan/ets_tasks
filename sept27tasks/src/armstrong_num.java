public class armstrong_num {
    public static void main(String args[]){
        int temp;
        int start, end=1000;


System.out.println("Armstrong numbers between 1 to 1000");
        for(start=1; start<=end;start++){
            int digit =0,a=0;
            temp=start;
            while(temp>0){
                digit++;
                temp=temp/10;
            }
            if(digit>=2) {
                int b=start;
                while (b > 0) {

                    int m = b %10;
                    a+= Math.pow(m,digit);
                    b=b/10;
                }

            }
            if(a==start) {
                System.out.println(a);
            }

        }
    }

}
