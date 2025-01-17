import java.util.*;
class Election{
  int spoilt=0,total=0;
  void countingmachine(int[] count){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter candidate no to cast ur vote: \nor 0 to stop voting");
    int vote=sc.nextInt();
  while(vote!=0){
    total++;
    switch(vote){
              case 1: count[0]++;
                      break;
              case 2: count[1]++;
                    break;
              case 3: count[2]++;
                    break;
              case 4: count[3]++;
                    break;
              case 5: count[4]++;
                    break;
              
              default: spoilt++;
    }
    vote=sc.nextInt();

  }
  if(vote==0){
    System.out.println("exiting \n thank you\n");
    
  }
  }
  void display(int[] count){
    System.out.print("\nResult:-\n");
    for(int i=0;i<5;i++){
      System.out.println("c~"+(i+1)+":"+count[i]);
    }
    System.out.println("spoilt ballots: "+(spoilt)+"\ntotal votes casted: "+(total));
  }

  
}

class Electionapp{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] candidates = new int[5];
    Election obj=new Election();
    obj.countingmachine(candidates);
    obj.display(candidates);
  }
}