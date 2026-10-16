public class TestPro{
    public static void main(String args[]){
        System.out.println("Application to find out maximum number");

        FindMaxPro o1=new FindMaxPro();

        System.out.println("Maximum number: " + o1.max(3, 8));

        System.out.println("Maximum number: " + o1.max(4, 9.0f));

        System.out.println("Maximum number: " + o1.max('5', 'c'));

        System.out.println("Maximum number: " + o1.max(5, 'c'));

        System.out.println("Maximum number: " + o1.max(5, o1.max(6,3)));

        System.out.println("Maximum number: " + o1.max(6.88, 8.77));

        System.out.println("Maximum number: " + o1.max("shahid", "ahmad"));


//Reference datatypes are not interchangeable with primitive.
//The primitive data type that's lower in order will convert into the higher one if there's no original datatype in that function.

    }
}