public class VowelsAndConsonants {
    public static void main(String args[]){
        String s="Java is a programming language";
        int vowels=0,consonants=0;
        char[] a={'a','e','i','o','u'};
        for(int i=0;i<s.length();i++){
            char curr_char=Character.toLowerCase(s.charAt(i));
            boolean isVowel=false;

            for(int j=0;j<a.length;j++) {
                if (curr_char == a[j]) {
                    vowels++;
                    isVowel = true;
                    break;
                }
            }
                if(!isVowel && curr_char>='a' && curr_char<='z') {
                    consonants++;
                }




        }
System.out.println("Vowels: "+vowels+" Consonants: "+ consonants);
    }
}
