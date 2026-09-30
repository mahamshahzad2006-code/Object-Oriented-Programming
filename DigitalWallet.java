public class DigitalWallet{
     private double balance;

     boolean deposit(double amount){
      if(amount > 0){
         balance +=  amount;
        return true;
       }
        return false;
}
     boolean spend(double amount){
      if(amount > 0 && amount <= balance){
         balance -=  amount;
        return true;
    }
       return false;
}
     double getBalance(){
      return balance;
}
     boolean canAfford(double amount){
     if(amount > 0 && amount <= balance){
       return true;
    }
      return false;
} 


}


