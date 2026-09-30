package app; 
import model.AcessBox;
   public class OutsideCheck {
        public static void main(){
       AcessBox box = new AcessBox();
       box.printInside();
       System.out.println(box.open);
    /*  System.out.println(box.family);
      System.out.println(box.packageOnly);
      System.out.println(box.secret); */
}
}
      