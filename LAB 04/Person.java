public class Person{
     private String id;
     private String name;
     private Date dob;
     private String email;
     private String city;

     public Person(String name, String email){
         this(name, email, new Date());
     }

     public Person(String name, String email, Date dob){
          this(name, email, dob, "Default City");
     }

     public Person(String name, String email, Date dob, String city) {
          this.name = name;
          this.email = email;
          this.dob =dob;
          this.city = city;
     }

     public void display() {
          System.out.println("\nName: " + name);
          System.out.println("ID: " + id);
          System.out.println("Email Id: " + email);
          dob.displayDate();
          System.out.println("City: " + city);
     }
}
