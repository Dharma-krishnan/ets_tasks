public class IsMatrixEqual {
    public static void main(String args[]){
        boolean c=true;
        int a1[][]={
                {1,2,3},
                {3,4,5},
                {6,7,8},
        };
        int a2[][]={
                {1,2,3},
                {3,4,5},
                {6,7,8},
        };
for(int i=0;i<a1.length;i++){

    for(int j=0;j<a1[i].length;j++){
        if(a1[i][j]!=a2[i][j]){
           c=false;
           break;
        }
    }

}
if(c){
    System.out.println("Equal");
}else{
    System.out.println("Not Equal");
}



    }
}
