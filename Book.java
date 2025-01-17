import java.util.*;
class Bookdetail{
  String Name="";
  int code;
  int up;
  int quantity;
  int total;
  Bookdetail(){

  }

  void getdetails(){
    Scanner in = new Scanner(System.in);
    System.out.println("\nEnter book name: ");
    Name=in.next();
    System.out.println("\nEnter book code: ");
    code=in.nextInt();
    System.out.println("\nEnter book unit price: ");
    up=in.nextInt();
    System.out.println("\nEnter book quantity: ");
    quantity=in.nextInt();
    total=quantity*up;


  }

  void display(){
     
      System.out.println(Name+"\t\t"+code+"\t\t"+up+"\t\t\t"+quantity+"\t\t"+total+"\t");
  }


}
class Book{
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of different types of books: ");
    int n=in.nextInt();
    Bookdetail[] book = new Bookdetail[n];
    for(int i=0;i<n;i++){
      System.out.println("Enter the details of book ("+(i+1)+"): ");
      book[i]=new Bookdetail();
      book[i].getdetails();
    }
    System.out.println("bookname \t\t code\t\tunitprice\t\tquantity\t\ttotal");
    for(int i=0;i<n;i++){
      System.out.println("details of book ("+(i+1)+"): ");
      book[i].display();
    }

  }
}