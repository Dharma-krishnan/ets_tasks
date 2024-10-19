public class fifthpgm {
    public static void main(String args[]){
        String str=null;
        System.out.println(str instanceof String);

        String demoObject=new String();// not able to use "new String(null)" using that shows error
        System.out.println(demoObject instanceof String);

        String s="HeyhiETS";
        System.out.println(s instanceof String);



    }


}
