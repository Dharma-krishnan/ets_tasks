public class Palindrome {
    public static void main(String args[]){
        int start, end=1000;
        System.out.println("Palindrome numbers between 10 to 1000");

        for(start=10;start<=end;start++){
            int temp=start, reverse=0;
            while(temp>0){
                int m=temp%10;
                reverse= reverse*10+m;
                temp=temp/10;
            }
            if(start==reverse){
                System.out.println(reverse);
            }
        }

    }
}
