import java.util.*;
class StackException extends Exception{
  StackException(String s1){
    super(s1);
  }
}
class Stack{
  private final int[] stk;
  private int top;
  Stack(int size){
    stk= new int[size];
    top =-1;
  }

  void push(int val) throws StackException{
    if(top==stk.length -1){
      throw new StackException("Stack overflow");
    }
    else{
      stk[++top]=val;
    }
  }

  int pop() throws StackException{
    if(top==-1){
      throw new StackException("Stack underflow");
    }
    else{
      return stk[top--];
    }
  }

    void display(){
      if(top==-1){
        System.out.println("Stack underflow");
      }
      else{
        for(int i=top;i>-1;i--){
           System.out.println(stk[i]);        }
      }

      }
      void peek(){
        if(top==-1){
          System.out.println("Stack underflow");
        }
        else{
          
             System.out.println(stk[top]);        
        }
  
    }
}

public class StackImplementation{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
   System.out.println("Enter the size of the stack");
    int size = in.nextInt();
    Stack stkobj = new Stack(size);
    int choice;
    do{
        System.out.println("Enter\n1.to push\n2.pop\n3.peek\n4.display\n0.exit\nENter your choice: ");
        choice =in.nextInt();
        switch ( choice) {
          case 1:try{
                System.out.println("enter value to push: ");
                int val =in.nextInt();
                  stkobj.push(val);
                }
                catch(StackException e){
                  System.out.println("Exception caught");
                }
                  break;
                
          case 2: try{
                  int popped=stkobj.pop();
                  System.out.println(popped);
                }
                catch(StackException e){
                  System.out.println("Exception caught");
                }
          
                  break;
          case 3: stkobj.peek();
                  break;
          case 4: stkobj.display();
                  break;
          case 0:break;

          default:System.out.println("invalid choice");
            
        }
    }while(choice!=0);

  }
}