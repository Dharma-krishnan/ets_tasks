public class Variables {
    static int a=10;
    public int add(int b){
        int c=1000;
        return c+b;
    }
    public static void main(String args[]){
        System.out.println("static variable ->"+a);

        Variables obj =new Variables();
        System.out.println("From the method->"+ obj.add(1));

        for(int i=1;i<3;i++){
            System.out.println("Inside the block "+i);
        }

    }
}
