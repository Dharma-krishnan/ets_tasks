public class Celsius {
    public int cTof(int c){
        return (c*9/5)+32;
    }
    public int fToc(int f){
        return (f-32)*5/9;
    }
public static void main(String args[]){
        Celsius obj= new Celsius();
        int c=68;

//        System.out.println(obj.cTof(c)+" 'F");
        System.out.println(obj.fToc(c)+" 'C");
}

}
