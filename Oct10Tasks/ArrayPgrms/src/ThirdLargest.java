import java.util.Arrays;

public class ThirdLargest {
    public static void main(String args[]){
        int brr[]={98,87,37,78,23,12};

        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));
        System.out.println("3rd largest "+brr[brr.length-3]);
        System.out.println("2nd largest "+brr[brr.length-2]);
        System.out.println("Largest Number: "+brr[brr.length-1]);
        System.out.println("2nd smallest num: "+brr[1]);
        System.out.println("Smallest Num: "+brr[0]);

    }
}
