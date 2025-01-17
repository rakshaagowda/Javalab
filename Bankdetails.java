import java.util.*;
abstract class Bank{
  char bankType;
  double amt,interest;
  boolean platinCard;
  String Bankname;
  abstract void getRoi();

  void deposit(){
    bankType ='v';
    amt=0.0;
    interest=0.0;

  }


}


class Banking extends Bank{

  Scanner sc = new Scanner(System.in);
  int  term;
  double termdeposit;
  void getRoi(){
    if(bankType=='n'){
      platinCard = false;
     if(term>=3){ 
      interest = .07*termdeposit;
    }}
    if(bankType=='i'){
      platinCard =true;
      if(term>=3){
      interest = 0.08*termdeposit;
    }}

  }
  void deposit(){
    System.out.println("enter bank type (i/n): ");
    bankType = sc.next().charAt(0);
    System.out.println("Enter amount to be deposited: ");
    termdeposit = sc.nextDouble();
    System.out.println("enter the term: ");
    term = sc.nextInt();
    getRoi();    

  }

  void display(){
    if(bankType=='n'){
      Bankname="nationalized bank";

    }
    if(bankType=='i'){
      Bankname="international bank";

    }
    System.out.println(Bankname+"\t\t\t"+termdeposit+"\t\t"+term+"\t\t"+interest+"\t\t");
    if(platinCard){
      System.out.println("Eligible for platinum card");
    }else{
      System.out.println("not Eligible for platinum card"); 
    }

  }
}

class Bankdetails{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  int n;
  
  System.out.println("Enter number of banks: ");
  n=sc.nextInt();
  Banking[] banks = new Banking[n];
  for(int i=0;i<n;i++){
    banks[i]=new Banking();
    banks[i].deposit();
  }

  System.out.println("Bankname\t\t\ttermdeposit\t\tterm\t\tinterest\t\t");
  for(int i=0;i<n;i++){
    
    banks[i].display();
  }
}
}