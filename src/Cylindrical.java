public class Cylindrical {
    public double cylinderArea(double r, double h){
        return 2*Math.PI*r*(r+h);
    }
    public double cylinderVolume(double r, double h){
        return Math.PI*r*r*h;
    }
    public static void main(String args[]){
        Cylindrical obj=new Cylindrical();
        int r,h;
        r=14;
        h=15;
        System.out.println("Area of Cylinder: "+obj.cylinderArea(r,h));
        System.out.println("Perimeter of Cylinder: "+obj.cylinderVolume(r,h));
    }
}
