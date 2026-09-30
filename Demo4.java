public class Demo4 {
 
    public static void main(String[] args) {
 
        DigitalWallet wallet1 = new DigitalWallet();
        DigitalWallet wallet2 = new DigitalWallet();
 
        // Deposit only into wallet1
        System.out.println("=====WALLET 2 UNTOUCHED CHECK=========");
        System.out.println("wallet2 initial balance: " + wallet2.getBalance());
 
        boolean r;
 
        r = wallet1.deposit(500);
        System.out.println("deposit(500)   -> " + r + " | balance: " + wallet1.getBalance());
 
        r = wallet1.deposit(-10);
        System.out.println("deposit(-10)   -> " + r + " | balance: " + wallet1.getBalance());
 
        r = wallet1.spend(200);
        System.out.println("spend(200)     -> " + r + " | balance: " + wallet1.getBalance());
 
        r = wallet1.spend(1000);
        System.out.println("spend(1000)    -> " + r + " | balance: " + wallet1.getBalance());
 
        r = wallet1.canAfford(301);
        System.out.println("canAfford(301) -> " + r + " | balance: " + wallet1.getBalance());
 
        r = wallet1.spend(300);
        System.out.println("spend(300)     -> " + r + " | balance: " + wallet1.getBalance());
 
        System.out.println("=====FINAL CHECK: WALLET 2 STILL UNTOUCHED=========");
        System.out.println("wallet2 balance: " + wallet2.getBalance());
}
}