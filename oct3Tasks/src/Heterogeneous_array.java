import java.util.Scanner;

public class Heterogeneous_array {
    public static void main(String args[]){
        Object obj[]=new Object[5];
        Scanner inp=new Scanner(System.in);

        for(int i=0;i<obj.length;i++){
            if(inp.hasNextInt()){
                obj[i]=inp.nextInt();
            }else{
                obj[i]= inp.next();
            }
        }
        for(Object a:obj){
            System.out.print(a+" ");
        }
    }

}
