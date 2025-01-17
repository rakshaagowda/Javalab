import java.util.*;
class Cities{
  String Name;
  int ht,lt,hd,ld;
  Scanner in = new Scanner(System.in);
  int[] t = new int[6];

  void read(){
    System.out.println("Enter the name of the city: ");
    Name = in.next();
    System.out.println("Enter the temperature of 6 days of "+Name+": ");
    for (int i=0;i<6;i++){
      t[i]=in.nextInt();
     
    
  }}

  void display(){
    System.out.print(Name);
    for (int i=0;i<6;i++){
      System.out.println(+"\t\t"+t[i]+"\t\t");
     
    
  }

  }

  void highestLowest(){

    ht=t[0];lt=t[0];hd=1;ld=1;
    for(int i=1;i<6;i++){
      if(ht<t[i]){
        ht=t[i];
        hd=i+1;
      }
      if(lt>t[i]){
        lt=t[i];
        ld=i+1;
      }
    }
  }

}
class Temperature{
  public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  Cities[] city = new Cities[5];
  System.out.println("Enter details of each city: ");
  for(int i=0;i<5;i++){
    city[i]=new Cities();
    city[i].read();
    city[i].highestLowest();
  }
  System.out.println("Name: \t\t day1\t\tday2\t\tday3\t\tday4\t\tday5\t\tday6\t\t");
  for(int i=0;i<5;i++){
    
    city[i].display();
    
  }

  
    int totht=city[0].ht;
    int totlt=city[0].lt;
    int tothd=city[0].hd;
    int totld=city[0].ld;
    String hcity=city[0].Name; 
    String lcity=city[0].Name;
    for(int i=1;i<5;i++){
    if(totht<city[i].ht){
      totht=city[i].ht;
      tothd=city[i].hd;
      hcity=city[i].Name;
    }
    if(totlt>city[i].lt){
      totlt=city[i].lt;
      tot ld=city[i].ld;
      lcity=city[i].Name;
    }

    }
    System.out.println("highest temp: "+totht+"City: "+hcity+"on day: "+tothd);
    System.out.println("lowest temp: "+totlt+"City: "+lcity+"on day: "+totld);


} 
}