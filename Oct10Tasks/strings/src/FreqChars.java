public class FreqChars {
    public static void main(String args[]){
        String str="Battle Royale";
        int freq[]=new int[str.length()];

        char st[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            freq[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(st[i]==st[j]){
                    freq[i]++;
                    st[j]='0';
                }
            }

        }
        for(int i=0;i<freq.length;i++){
            if(st[i]!='0'&& st[i]!=' '){
                System.out.println(freq[i]+" - "+st[i]);
            }
        }
    }
}
