class stuDetails{
    private int rollNo;
    private String stuName;
    private int mrk1;
    private int mrk2;
    private int mrk3;

    stuDetails(int rollNo, String name, int mark1, int mark2, int mark3){
        this.rollNo=rollNo;
        this.stuName=name;
        this.mrk1=mark1;
        this.mrk2=mark2;
        this.mrk3=mark3;
    }

    public void setRollNo(int roll){
        this.rollNo=roll;
    }
    public void setName(String sname){
        this.stuName=sname;
    }
    public void mrk1(int m1){
        this.mrk1=m1;
    }
    public void mrk2(int m2){
        this.mrk2=m2;
    }
    public void mrk3(int m3){
        this.mrk3=m3;
    }

    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return stuName;
    }
    public int getMrk1(){
        return mrk1;
    }
    public int getMrk2(){
        return mrk2;
    }
    public int getMrk3(){
        return mrk3;
    }

    public void displayAllDetails(){
        System.out.println("Roll No: "+rollNo+"\n Name :"+stuName+" \n Mark1: "+mrk1+"\n Mark2: "+ mrk2+"\n mark3: "+mrk3);
    }

}
public class Encapsulation {
    public static void main(String args[]){
        stuDetails obj=new stuDetails(1,"AKs",78,67,98);
        System.out.println(obj.getName());

        obj.setName("bks");
        System.out.println(obj.getName());
        System.out.println(obj.getRollNo());
        System.out.println(obj.getMrk1());
        System.out.println(obj.getMrk2());
        System.out.println(obj.getMrk3());

        obj.displayAllDetails();


    }
}
