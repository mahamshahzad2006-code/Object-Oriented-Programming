public class FindMaxPro{
     
//Making functions with same name is called function overloading

    public byte max(byte num1, byte num2){
         System.out.println("byte max is called.");
         return num1>num2? num1: num2;
    }

    public short max(short num1, short num2){
         System.out.println("short max is called.");
         return num1>num2? num1: num2;
    }

    public char max(char num1, char num2){
         System.out.println("char max is called.");
         return num1>num2? num1: num2;
    }

    public long max(long num1, long num2){
         System.out.println("long max is called.");
         return num1>num2? num1: num2;
    }


    public int max(int num1, int num2){
         System.out.println("int max is called.");
         return num1>num2? num1: num2;
    }

    public double max(double num1, double num2){
         System.out.println("double max is called.");
         return num1>num2? num1: num2;
     }

    public String max(String num1, String num2){
         System.out.println("String max is called.");
         return num2.compareTo(num1)>num1.compareTo(num2)? num2: num1;
     }

}