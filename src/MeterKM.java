public class MeterKM {
    public double mTokm(double m) {
        return m / 1000;

    }
    public double kmTom(double m){
        return m*1000;
    }

    public static void main(String args[]) {
        MeterKM obj = new MeterKM();
        double a = 2000;

        System.out.println(obj.mTokm(a)+" Kilometers");
//        System.out.println(obj.kmTom(a)+" meters");
    }
}