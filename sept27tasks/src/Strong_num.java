public class Strong_num {
    public static void main(String args[]){
        int start, end=1000;

            for(start=1;start<=1000;start++) {
                int temp = start,sum=0;
                while (temp > 0) {
                    int fact=1;
                    int m=temp%10;
                    for (int i = 1; i <=m;i++){
                        fact=fact*i;

                    }
                    sum+=fact;
                    temp=temp/10;
                }
                if(start==sum){
                    System.out.println(sum);
                }
            }

    }

}
