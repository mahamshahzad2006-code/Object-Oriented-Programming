public class Demo2{
    
   static void increaseNumber(int n) { 
    n += 3; 
}
    static void updateObject(LabProgress p) { 
     p.completeOne(); 
}
    static void replaceLocal(LabProgress p) {
    p = new LabProgress();
    p.completeOne();
}
public static void main(String args[]){
    int n = 4;
    LabProgress progress = new LabProgress();

    System.out.println("Before n:" + n );
    System.out.println("Before progress:" + progress.getCompletedLabs());

    increaseNumber(n);
    System.out.println("After calling increase number:" + n );

    updateObject(progress);
    System.out.println("After calling update obj:" +progress.getCompletedLabs());

    replaceLocal(progress);
    System.out.println("After calling replace local:" + progress.getCompletedLabs());
}
}