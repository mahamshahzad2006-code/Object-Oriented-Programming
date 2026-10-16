public class Test{
    public static void main(String args[]) {
        Person p1 = new Person("Faryal Sarfraz", "faryalksarfraz@gmail.com", new Date(12, 12, 2007), "Lahore");
        Person p2 = new Person("Hania Tanveer", "haniatanveer@gmail.com", new Date(18, 9, 2008));
        Person p3 = new Person("Maham Shahzad", "mahamshahzad@gmail.com");

        p1.display();
        p2.display();
        p3.display();
    }
}
