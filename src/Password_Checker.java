public class Password_Checker {

    public static boolean isValid(String s){
        //password must be 8 to 14
        if(!(s.length()>=8 && s.length()<=15)){
            return false;
        }

        // for special characters
        if (!(s.contains("@") || s.contains("#")
                || s.contains("!") || s.contains("~")
                || s.contains("$") || s.contains("%")
                || s.contains("^") || s.contains("&")
                || s.contains("*") || s.contains("(")
                || s.contains(")") || s.contains("-")
                || s.contains("+") || s.contains("/")
                || s.contains(":") || s.contains(".")
                || s.contains(", ") || s.contains("<")
                || s.contains(">") || s.contains("?")
                || s.contains("|"))) {
            return false;
        }
// check spaces should not contain spaces
        for(int i=0;i<s.length();i++){
            if(s.contains(" ")){
                return false;
            }
        }
        // checkng it has number
        if(true){
            int count =0;
            for(int i=0;i<=9;i++) {

                String a = Integer.toString(i);

                if (s.contains(a)) {
                    count++;
                }

            }
            if (count == 0) {
                return false;
            }
        }
if(true){          
    int count =0;
    for(int i=97;i<=122;i++){
            char a=(char)i;
            String b=Character.toString(a);
            if(s.contains(b)){
                count++;
            }
        }
        if(count==0){
            return false;
        }
}
if(true){
    int count =0;
    for(int i=65;i<=90;i++){
        char a=(char)i;
        String b=Character.toString(a);
        if (s.contains(b)) {
            
            count ++;
        }
    }
    if(count ==0){
        return false;
    }
}

    return true;
    }


    public static void main(String args[]){
String a="hellodharma@A!2";
        if(isValid(a)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
