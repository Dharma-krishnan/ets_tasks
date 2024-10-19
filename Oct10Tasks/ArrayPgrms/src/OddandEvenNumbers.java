public class OddandEvenNumbers {
    public static void main(String args[]){
        int arr[]={11,44,52,22,53};
        System.out.println("Even Numbers: ");
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
            System.out.println("Odd Numbers: ");

            for(int j = 0; j <arr.length; j++) {
                if (arr[j] % 2 == 1) {
                    System.out.println(arr[j]);
                }
            }

    }
}
