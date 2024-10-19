public class DupWords {
    public static void main(String args[]){
        String string= "black bug bit a big black dog on his big black nose";

        string=string.toLowerCase();
int count;
        String words[]=string.split(" ");
        for(int i=0;i<words.length-1;i++){
            count=1;
            for(int j=i+1;j<words.length-1;j++){
                 if(words[i].equals(words[j])){
                     count++;
                     words[j]="0";
                 }
            }
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }



    }
}
