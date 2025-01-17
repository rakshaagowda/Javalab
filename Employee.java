import java.util.*;
class Employeedetails{
  double  DA,HRA,grosspay,basicPay;
  String  Name,deptName;
  int id;

  Scanner sc = new Scanner(System.in);
  void read(){
    System.out.println("Enter Name:");
    Name = sc.next();
    System.out.println("Enter dept name:");
    deptName = sc.next();
    System.out.println("Enter id:");
    id = sc.nextInt();
    System.out.println("Enter basicPay:");
    basicPay = sc.nextDouble();
  }

  void calculategrossPay(){
    DA=(.58)*basicPay;
    HRA=(.16)*basicPay;
    grosspay=basicPay+HRA+DA;
  }
}

interface incomeTax{
  public void calculateIncomeTax();
}

class Calculate extends Employeedetails implements incomeTax{
  double Tax,Netpay;
  public void calculateIncomeTax(){
    if(grosspay<=200000){
      Tax=0;
    }
    else if(grosspay>200000 && grosspay<500000){
      Tax=0.15*grosspay;
    }
    else{
      Tax=.30*grosspay;
      Tax += .02*Tax;
    }

  }
  void calculateNetPay(){
    Netpay=grosspay-Tax;


  }

  void display(){
    System.out.println(Name+"\t\t"+deptName+"\t\t"+id+"\t\t"+basicPay+"\t\t"+grosspay+"\t\t"+Tax+"\t\t"+Netpay);
  }

}

class Employee{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of employee: ");
    int n = in.nextInt();
    Calculate[] employ = new Calculate[n];

    for(int i=0;i<n;i++){
      System.out.println("Enter details of employee: "+(i+1));
      employ[i]=new Calculate();
      employ[i].read();
      employ[i].calculategrossPay();
      employ[i].calculateIncomeTax();
      employ[i].calculateNetPay();
    }

    System.out.println("Name\t\tdeptName\t\tid\t\tbasicPay\t\tgrosspay\t\tTax\t\tNetpay");

    for(int i=0;i<n;i++){
      employ[i].display();
    }

  }


}