import java.util.Scanner;
public class Java_EOF {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int lineNumber = 1;


        while (inp.hasNext()) {
            String line = inp.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        inp.close();
    }
}
