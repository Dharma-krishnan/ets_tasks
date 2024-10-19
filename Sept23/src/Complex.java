public class Complex {
    int real,image;
    public Complex(int r, int i){
        this.real=r;
        this.image=i;
    }

    public static Complex add(Complex n1, Complex n2){
        Complex res= new Complex(0,0);
        res.real=n1.real+n2.real;
        res.image=n1.image+n2.image;
        return res;
    }
    public static Complex subtract(Complex n1, Complex n2){
        Complex res= new Complex(0,0);
        res.real= n1.real-n2.real;
        res.image=n1.image-n2.image;
        return res;
    }

    public static Complex product(Complex n1, Complex n2){
        Complex res=new Complex(0,0);
        res.real=n1.real*n2.real-n1.image*n2.image;
        res.image=n1.real*n2.image+n1.image*n2.real;
        return res;
    }


    public void display(){
        System.out.println(this.real+", i"+this.image);
    }
    public static void main(String args[]){
        Complex s1=new Complex(4,5);
        Complex s2=new Complex(10,6);

        Complex obj=add(s1,s2);
        obj.display();
        Complex obj1=subtract(s1,s2);
        obj1.display();
        Complex obj2=product(s1,s2);
        obj2.display();
    }
}
