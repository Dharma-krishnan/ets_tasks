public class Subsets {
    public static void main(String args[]){

        String s="Java";
        int len=s.length();
        String[] a=new String[len*(len+1)/2];
        int c=0;

        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                a[c]=s.substring(i,j+1);
                c++;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

}
