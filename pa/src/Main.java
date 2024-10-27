import java.util.Arrays;

public class Main {
    public static int fact(int x){
        if(x==0){
            return 1;
        }else{
            return x*fact(x-1);
        }
    }
    public static void main(String[] args) {
//        Object obj[]=new Object[3];
//        int a=23;
//        String b="Hellow";
//        boolean c=true;
//
//        obj[0]=a;
//        obj[1]=b;
//        obj[2]=c;
//
//    System.out.println(Arrays.toString(obj));

//        int n=876884;
//        String s=Integer.toString(n);
//        for(int i=0;i<s.length();i++){
//            System.out.print(s.charAt(i)+" ");
//        }

//        int n=3456;
//        int sum=0;
//        while(n>0){
//            int a=n%10;
//            sum+=a;
//            n=n/10;
//        }
//System.out.println(sum);
//        String str=new String();
//
//        System.out.println(str instanceof String);

//        int a=10;
//        int b=20;
//
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println(a+" "+b);

//        int a=97;
//        int b=67;
//
//        String s=(a>b)?"a is greater":"b is greater";
//System.out.println(s);


        //Fibonacci series
//        int n=10;
//
//        int a=0;
//        int b=1;
//        for(int i=0;i<n;i++){
//            int c=a+b;
//            System.out.println(a);
//            a=b;
//            b=c;
//
//        }
        // Palindrome
//        int n=1414;
//        int a=0;
//        int dup=n;
//        while(dup>0){
//            int b=dup%10;
//             a=a*10+b;
//             dup/=10;
//        }
//        if(n==a){
//            System.out.println("Is a palindrome");
//        }else {
//            System.out.println("Is not a palindrome");
//        }

        //Armstrong Num
//        int n=153;
//        int d=n;
//        int h=n;
//        int digits=0;
//        int sum=0;
//        while(d>0){
//            digits++;
//            d/=10;
//        }
//        while(h>0){
//            int r=h%10;
//            sum+=Math.pow(r,digits);
//            h/=10;
//        }
//        if(n==sum){
//            System.out.println("Is a Armstrong num");
//        }
// Strong Number
//        int n=405853;
//        int dup=n;
//        int tot=0;
//         while(dup>0){
//             int rem=dup%10;
//             int sum=1;
//             for(int i=1;i<=rem;i++){
//                 sum*=i;
//             }
//             tot+=sum;
//             dup=dup/10;
//         }
//if(tot==n){
//    System.out.println("Is a Strong Num");
//}else{
//    System.out.println("Not a strong Num");
//}

        // factorial using
//
//        int x=120;
//System.out.println(fact(x));

//         Java Program to print the duplicate elements of an array

//        int arr[]={4,3,5,4,5,3,6};
//        int dup[]=new int[arr.length];
//
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] != -1) {
//                int count = 0;
//                for (int j = i + 1; j < arr.length; j++) {
//
//                    if (arr[i] == arr[j]) {
//                        count++;
//                        arr[j] = -1;
//                    }
//
//                }
//                if (count > 0) {
//                    System.out.print(arr[i] + " ");
//                }
//            }
//        }

//         Java Program to find the frequency of each element in the array
//        int arr[]={1,2,1,2,3,4,3,5,2,4,8};
//        int freq[]=new int[arr.length];
//
//        for(int i=0;i<arr.length;i++){
//            int count =1;
//            if(arr[i]!=-1){
//                for(int j=i+1;j<arr.length;j++){
//                    if(arr[i]==arr[j]) {
//                        count++;
//                        arr[j] = -1;
//                    }
//                    }
//                freq[i]=count;
//                System.out.println(arr[i]+"= "+freq[i]);
//            }
//
//        }

//       Java Program to left rotate the elements of an array

//        int arr[]={1,2,3,4,5};
//
//        int num=arr[0];
//
//        for(int i=1;i<arr.length;i++){
//            arr[i-1]=arr[i];
//        }
//        arr[arr.length-1]=num;
//
//        System.out.println(Arrays.toString(arr));

        //right rotate
//        int arr[]={1,2,3,4,5};
//
//        int num=arr[arr.length-1];
//        for(int i=arr.length-1;i>0;i--){
//            arr[i]=arr[i-1];
//        }
//        arr[0]=num;
//        System.out.println(Arrays.toString(arr));

// Java Program to print the elements of an array present on even position
//int arr[]={1,2,3,4};
//int sum=0;
//for(int i=0;i<arr.length;i++){
//    sum+=arr[i];
//}
//System.out.print(sum);
////for(int i=0;i<arr.length;i++){
////    if(i%2==0){
////        System.out.println(arr[i]);
////    }
//}







    }
}