public class left_triangle {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){

            int spaces=n-i;
            for(int s=1;s<=spaces;s++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }



    }
}
