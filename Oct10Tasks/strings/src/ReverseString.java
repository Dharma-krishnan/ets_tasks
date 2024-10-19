public class ReverseString {
    public static void main(String args[]){
        String str="Java Programming";
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        System.out.println("Before Reverse: "+str);
        System.out.println("After Reverse: "+s);
    }
}
