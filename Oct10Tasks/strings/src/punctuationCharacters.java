public class punctuationCharacters {
    public static void main(String args[]){
        int count=0;
        String a="He said, 'The mailman loves you.' I heard it with my own ears.";
                for(int i=0;i<a.length();i++){
                    if(a.charAt(i) == ',' || a.charAt(i) == '!' || a.charAt(i) == '-' ||
                            a.charAt(i) == '\'' || a.charAt(i) == '_' || a.charAt(i) == '.' ||
                            a.charAt(i) == '\"' || a.charAt(i) == ':' || a.charAt(i) == ';' || a.charAt(i) == '?')
                    {
                        count++;
                    }
                }
                System.out.println(count);
    }
}
