public class UpperTriangular {
        public static void main(String args[]) {
            int a[][] = {
                    {1, 2, 3},
                    {8, 6, 4},
                    {4, 5, 6}
            };

            int r = a.length;
            int cols = a[0].length;

            if(r != cols) {
                System.out.println("Should be a Square Matrix");
            }else{
                for(int i=0;i<r;i++){
                    for(int j=0;j<cols;j++){
                        if(i>j){
                            System.out.print(0+" ");
                        }else{
                            System.out.print(a[i][j]+" ");
                        }
                    }
                    System.out.println();
                }
            }
        }


}
