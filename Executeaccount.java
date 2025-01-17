import java.util.*;
class Account{
  private String Name;
  private int accno;
  private double balance;
  private String accType;
  Scanner sc=new Scanner(System.in);
  Account(){
    Name="";
    accno=0;
    balance=0.0;
    accType="";
  }
  void getDetails(){
    System.out.println("Name   ");
    Name=sc.next();
    System.out.print("Account Number:   ");
    accno=sc.nextInt();
    System.out.println("Account type: ");
    accType=sc.next();
    System.out.println("Enter balance: ");
    balance =sc.nextDouble();

  }

  void printDetails(){
    System.out.println("Name\t\tAccount Number \t\t Account Type\t\tbalance \t");
    System.out.println(Name+"\t\t"+accno+"\t\t"+accType+"\t\t"+balance);  
  }

  void deposit(){

    double amt;
    System.out.println("Enter amount to be deposited: ");
    amt=sc.nextDouble();
    balance+=amt;
    System.out.println("current balance: "+balance);
  
  }

  void withdrawl(){
    double amt;
    System.out.println("enter amount to be withdrawn: ");
    amt=sc.nextDouble();
    if(amt>balance){
      System.out.println("insufficient balance\nTransaction failed");

    }
    else{
      balance-=amt;
      System.out.println("Transaction Successfull\ncurrent balance: "+balance);
    
    }
  }

  boolean search(int acn){
    if(accno==acn){
      printDetails();
      return true;
    }
    return false;
  }


}

class Executeaccount{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of acc holders: ");
    int n=sc.nextInt();
    Account[] holder =new Account[n];

    for(int i=0;i<n;i++){
      holder[i]=new Account();
      System.out.println("Account holders: "+(i+1)+">>>>>");
      holder[i].getDetails();

    }
    int choice;
    do{
      System.out.println("\n\n******Main Menu*********\n\n1.isplay\n2.search accno\n3.deposit\n4.withdrawl\n5.to exit\nEnter your choice: ");
      choice=sc.nextInt();
      switch(choice){
        case 1:for(int i=0;i<n;i++){
                  holder[i].printDetails();

                }
                break;
        case 2: System.out.println("\nenter account number: ");
                int acn=sc.nextInt();
                boolean found=false;
                for(int i=0;i<n;i++){
                 found=holder[i].search(acn);
                 if(found){
                  System.out.println("account found");
                  break;
                 } 
                }
                if(!found){
                  System.out.println("not found");
                }
                break;
      case 3:System.out.print("\nEnter the account number: ");
              int ac = sc.nextInt();
              boolean dep = false;
              for (int i = 0; i < n; i++) {
                  dep = holder[i].search(ac);
                  if (dep) {
                      holder[i].deposit();
                      break;
                  }
              }
              if (!dep) {
                  System.out.print("\nSearch failed....\nAccount doesn't exits");
              }
              break;

        case 4:
           System.out.print("\nEnter account number: ");
            int acc = sc.nextInt();
            boolean fou = false;
            for (int i = 0; i < n; i++) {
                fou = holder[i].search(acc);
                if (fou) {
                    holder[i].withdrawl();
                    break;
                }
                }
                if (!fou) {
                    System.out.print("\nSearch failed.....\nAccount doesn't exists");
                }
                break;

        case 5:
                System.out.print("Thank you.....");
                break;
}

} while(choice != 5);
  sc.close();
}
}

