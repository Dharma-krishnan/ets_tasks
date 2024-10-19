public class thirdpgm {
    public static void main(String args[]){
            int num=3456;
            int temp=0, ad=0;

            temp=num/1000;
            ad+=temp;
            num=num%1000;

            temp=num/100;
            ad+=temp;
            num=num%100;

            temp=num/10;
            ad+=temp;
            num=num%10;

            ad+=num;

            System.out.println(ad);

    }
}
