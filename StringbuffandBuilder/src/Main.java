public class Main {
    public static void main(String[] args) {
    StringBuffer sb= new StringBuffer("Java is a programming language");
    sb.append(" developed by James Gosling");
    System.out.println(sb);
    sb.insert(9,"an");
    System.out.println(sb);
    sb.replace(0,2,"Python");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    System.out.println(sb.capacity());
    sb.ensureCapacity(70);
        System.out.println(sb.capacity());
        sb.reverse();
        sb.delete(6,8);
        System.out.println(sb);



    }
}