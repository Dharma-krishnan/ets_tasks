public class Permutations {
    public static void per(String input,String output) {
        if(input.length()==0){
            System.out.println(output + " ");
        }
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);

            String rem=input.substring(0,i)+input.substring(i+1);
            per(rem,output+c);
        }
    }
    public static void main(String[] args) {
        String s="abcd";
        per(s,"");
    }


}
