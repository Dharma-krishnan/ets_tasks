public class perfectNum {
    public static void main(String args[]){
        int start, end=1000;
        for(start=1;start<=end;start++){
            int temp=start, sum=0;
            for(int i=1;i<start;i++) {
                if (temp % i == 0) {
                    sum+=i;
                }
            }
        if(sum==start) {
            System.out.println(sum);
        }
        }

    }
}
