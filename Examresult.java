import java.util.*;
class Result{
  String Name,result,Grade;
  int usn,s1,s2,s3,total;
  double avg;
  Scanner in = new Scanner(System.in);

  void read(){
    
      System.out.println("Enter name: ");
      Name=in.next();
      System.out.println("Enter usn: ");
      usn=in.nextInt();
      System.out.println("Enter sub1 marks: ");
      s1=in.nextInt();
      System.out.println("Enter sub2 marks: ");
      s2=in.nextInt();
      System.out.println("Enter sub3 marks: ");
      s3=in.nextInt();
    }

    void result(){
      total = s1+s2+s3;
      avg=(s1+s2+s3)/3.0;
      if(s1<35||s2<35||s3<35||avg<35){
        result="FAIL!!";
        Grade="E";
      }
      else{
        result="PASS";
        if(avg>90){
          Grade="S";
        }
        if(avg>75&&avg<=90){
          Grade="A";
        }
        if(avg>65&&avg<=75){
          Grade="B";
        }
        if(avg>40&&avg<=65){
          Grade="C";
        }
        if(avg>35&&avg<=40){
          Grade="D";
        }
      }
    }

    void display(){
      System.out.println(Name+"\t\t"+usn+"\t\t"+s1+"\t\t"+s2+"\t\t"+s3+"\t\t"+Grade+"\t\t"+result);

      
    }
    
    void topperlist(Result[] std,int n){
      int hs1,hs2,hs3;
      hs1=std[0].s1;
      hs2=std[0].s2;
      hs3=std[0].s3;
      for(int i=1;i<n;i++){
        if(hs1<std[i].s1){
          hs1=std[i].s1;
         }
         if(hs2<std[i].s2){
          hs2=std[i].s2;
         }
         if(hs3<std[i].s3){
          hs3=std[i].s3;
         }

      }

      for(int i=0;i<n;i++){
        if(std[i].s1==hs1){
          System.out.println("Sub1 topper: "+std[i].Name+" usn: "+std[i].usn+" has scored marks: "+std[i].s1);
        }
        if(std[i].s2==hs2){
          System.out.println("Sub2 topper: "+std[i].Name+" usn: "+std[i].usn+" has scored marks: "+std[i].s2);
        }
        if(std[i].s3==hs3){
          System.out.println("Sub3 topper: "+std[i].Name+" usn: "+std[i].usn+" has scored marks: "+std[i].s3);
        }
      }


    }

    

  }
  class Examresult{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      System.out.println("enter number of students: ");
    
    int n=sc.nextInt();
    Result[] student = new Result[n];
    int i;
    for(i=0;i<n;i++){
      System.out.println("Enter details of student"+(i+1)+": ");
      student[i]=new Result();
      student[i].read();
      student[i].result();

    }
    System.out.println("Name\t\tusn\t\tsub1\t\tsub2\t\tsub3\t\tGrade\t\tresult");
    for(i=0;i<n;i++){
      
      
      student[i].display();

    }
    Result obj = new Result();
    obj.topperlist(student,n);
    


  }
  }


