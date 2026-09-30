
public class Demo{
public static void main(String args[]){
    Cart c = new Cart();
    c.addItem(120);
    c.addItem(50,3);
    System.out.println("total after valid purchase" + c.getTotal());
    c.addItem(-10); 
    c.addItem(10, 0);
    double before = c.getTotal();
    System.out.println("total after invalid purchase" + c.getTotal());
   System.out.println("total unchanged" +" " + (before == c.getTotal()));
  
}
}