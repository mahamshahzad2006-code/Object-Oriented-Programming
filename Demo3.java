public class Demo3{
   public static void main(){
     StudentProfile student = new StudentProfile();
      
     System.out.println(student.registerId("SP26-BCS-047"));
     System.out.println(student.registerId("NEW-ID"));
     System.out.println(student.setGpa(3.40)); 
     System.out.println(student.setGpa(4.50));
     System.out.println(student.addCredits(15));
     System.out.println(student.addCredits(-2));
     System.out.println(student.addCredits(3));
     System.out.println(student.summary());
}
}