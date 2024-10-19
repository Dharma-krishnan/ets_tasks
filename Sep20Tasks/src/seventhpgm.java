public class seventhpgm {
    public static void main(String args[]){
        int min=1000000;//input

        int yearDays=365;
        int hourOfDay=24;
        int minOfHour=60;

        int year_min=minOfHour*hourOfDay*yearDays;
        int remainDays=min%year_min;
        int x=remainDays/(hourOfDay*minOfHour);
        System.out.println(min+" min is "+min/year_min+" year and "+x+" days");
    }
}
