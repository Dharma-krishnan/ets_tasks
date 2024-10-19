import java.util.Scanner;
public class SmallestandLargest {
    public static String getSmallestandLargest(String s,int k){

        String largest=s.substring(0,k);
        String smallest=s.substring(0,k);

        for(int i=0;i<=s.length()-k;i++){
            String substrin=s.substring(i,i+k);

            if(substrin.compareTo(smallest)<0){
                smallest=substrin;
            }
            if(substrin.compareTo(largest)>0){
                largest=substrin;
            }

        }
        return smallest+"\n"+largest ;
    }
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int a;
        String s;
        s=inp.next();
        a=inp.nextInt();
    String ob=getSmallestandLargest(s,a);
        System.out.println(ob);
    }
}
