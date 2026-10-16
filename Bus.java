public class Bus{
  private String busNumber;
  private Seat seats[][];
  public Bus(){
    this("Default bus", 2);
  }
  public Bus(String busNumber,int rows){
    this.busNumber = busNumber;
    seats = new Seat[rows][4];
    int seatNumber =1;
    
    for(int i=0; i<rows; i++){
      for(int j=0; j<4; j++){
        seats[i][j] = new Seat(seatNumber);
        seatNumber++;
        }
    }
  }
public void displaySeats(){
    for(int i=0; i<seats.length; i++){
     System.out.print("Row : " + (i+1) + ":");
    for(int j=0; j<4; j++){
     System.out.printf(
     "%02d:%s",
    seats[i][j].getSeatNumber(),seats[i][j].isReserved() ? "X" : "O");

  if (j==1) System.out.println("||");
  else if (j<3) System.out.println(" ");
  System.out.println();
}
  }
}
public void reserveSeat(int seatNumber){
     for(int i=0; i<seats.length; i++){
         for(int j=0; j<4; j++){
           if(seats[i][j].getSeatNumber() == seatNumber){
             if(seats[i][j].reserve()){
             System.out.println("Reserving seat:" + seatNumber + "successful");
}
             else{
             System.out.println("Reserving seat:" + seatNumber + "already reserved");
    }
   return;
   }
  }
 }
}
public int countAvailableSeats(){
   int count = 0;
   for(int i=0; i<seats.length; i++){
       for(int j=0; j<4; j++){
          if(!seats[i][j].isReserved() ){
           count++;
    }
  }
}
  return count;
}
}
