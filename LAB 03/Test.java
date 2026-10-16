public class Test{
    public static void main(String args[]){
        System.out.println("Application to find out maximum number");

        FindMax o1=new FindMax();

        System.out.println("Maximum number: " + o1.maxInt(7,5));

        System.out.println("Maximum float number: " + o1.maxDouble(6.88, 8.77));

        System.out.println(o1.maxString("shahid", "ahmad"));
    }
}