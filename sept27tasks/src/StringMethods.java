public class StringMethods {
    public static void main(String args[]){
        String a="Hello",b="World Hello";
        System.out.println("Length: "+a.length());
        System.out.println(a.charAt(2));

        //codePoint returns UNICODE values A=65, a=97
        System.out.println(a.codePointAt(2));
        System.out.println(b.codePointAt(2));
        System.out.println(a.codePointBefore(1));
        System.out.println(a.codePointCount(0,5));

        //Compare
        String s1="Hello", s2="HELLO";
        System.out.println("Compare Tp" +s2.compareTo(s1));
        System.out.println(s2.compareToIgnoreCase(s1));

        System.out.println(a.concat(b));
        System.out.println(a.contains("Hell"));

        String S="Python IS programming language               ";
        System.out.println(S.startsWith("Python"));
        System.out.println(S.endsWith("age"));
        System.out.println(S.substring(4,25));

        String m=" Bye World    ";
        System.out.println(m.trim());

        String c="Rocket", d="Rocket",f ="rocket";
        System.out.println(c.equals(d));
        System.out.println(f.equalsIgnoreCase(c));

        String fr="Java is developed by James", br="James";
        System.out.println(fr.replace("developed","created"));
        System.out.println(fr.indexOf(br));
        System.out.println(fr.lastIndexOf("J    ames"));



    }

}
