public class Triangle {
    public double areaOfTriangle(int b,int h){
        return 0.5*b*h;
    }

    public static void main(String args[]){
        Triangle obj=new Triangle();
        int b,h;
        b=10;
        h=20;
        System.out.println("Area of Triangle: "+(int)(obj.areaOfTriangle(b,h)));



    }




}
