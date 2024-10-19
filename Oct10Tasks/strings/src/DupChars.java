public class DupChars {
    public static void main(String args[]){
        String str = "apple is a fruit";
        char arr[] = str.toCharArray();


        System.out.println("Duplicate characters in the string are:");

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && arr[i] != ' ') {
                        count++;
                        arr[j] = '0';
                    }
                }
                if(count > 1 && arr[i] != '0'){
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }

