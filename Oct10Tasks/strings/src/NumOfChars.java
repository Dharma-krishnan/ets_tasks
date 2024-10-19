public class NumOfChars {
    public static void main(String args[]){
        String s="The best of both worlds";
        char[] a=s.toCharArray();
        int count=0;
        for(int i=0;i<a.length;i++){
            count++;
        }
        System.out.println(count);
    }
}
