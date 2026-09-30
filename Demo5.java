public class Demo5{
   public static void main(String args[]){
    
    LibraryBook book1 = new LibraryBook();
    LibraryBook book2 = new LibraryBook();
   
        book1.configure(3);
        book2.configure(1);
        System.out.println("book1 available: " + book1.getAvailable() + ", book2 available: " + book2.getAvailable());
 
        run("borrow(2)", book1.borrow(2), book1);
        run("borrow(2) again", book1.borrow(2), book1);
        run("returnCopies(1)", book1.returnCopies(1), book1);
        run("returnCopies(2)", book1.returnCopies(2), book1);
        run("borrow()", book1.borrow(), book1);
 
        // Task 4: reconfiguring after setup must fail and must not disturb existing state
        System.out.println("configure(10) again -> " + book1.configure(10));
        System.out.println("book1 borrowed/available unchanged: " + book1.getBorrowed() + "/" + book1.getAvailable());
    }
 
    static void run(String label, boolean result, LibraryBook b) {
        System.out.println(label + " -> " + result + ", borrowed/available = " + b.getBorrowed() + "/" + b.getAvailable());
    }
}