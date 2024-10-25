public class Add {
    int one,two,three,four,e;
    public Add(){
        System.out.println("Addition");
    }
    public Add(int one, int two){
        this.one=one;
        this.two=two;
        System.out.println(one+two);
    }
    public Add(int one,int two, int three, int four){
        this.one =one;
        this.two=two;
        this.three=three;
        this.four=four;
    }

    public  void show() {
        System.out.println("Values: " + one + ", " + two + ", " + three + ", " + four);
    }
    public static void main(String args[]){
        Add obj1=new Add();

        Add obj=new Add(10,20);
        obj.show();
        Add obj2=new Add(1,2,3,4);
        obj2.show();
    }

}
