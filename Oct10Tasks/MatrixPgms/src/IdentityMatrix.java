public class IdentityMatrix {
    public static void main(String args[]){
        int a[][] = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        int count=0;
        int rows=a.length;
        int cols=a[0].length;
        if(rows!=cols){
            System.out.println("Given Matrix is not a Square Matrix");
        }else {

            for (int i = 0; i < a.length;i++){
                if(a[i][i]==1){
                    count++;
                }

            }

        }
        if(count==a.length){
            System.out.println("Given Matrix is a Identity Matrix");
        }else{
            System.out.println("Given Matrix is not a Identity Matrix");
        }
    }
}
