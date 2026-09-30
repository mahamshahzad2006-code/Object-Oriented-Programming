package model;
   public class SamePackageCheck{
         public static void main(String args[]){
     AcessBox box = new AcessBox();
     System.out.println(box.open);
     System.out.println(box.family);
     System.out.println(box.packageOnly);
    //System.out.println(box.secret);
     box.printInside();
}
}