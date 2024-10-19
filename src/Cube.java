public class Cube {
    public int areaOfCube(int e){
        return 6*e*e;

    }
public int volumeOfCube(int e){
        return e*e*e;
}
public static void main(String args[]){
        int length=15;
        Cube obj=new Cube();
        System.out.println("Area of Cube: "+obj.areaOfCube(length));
        System.out.println("Perimeter of Cube: "+obj.volumeOfCube(length));



}


}
