public class TotNumOfchars {
    public static void main(String args[]){
        String string2="The best of both worlds";
        int count =0;
        for(int i=0;i<string2.length();i++){
            if(string2.charAt(i)!=' '){
                count++;
            }

        }
        System.out.println(count);
    }
}
