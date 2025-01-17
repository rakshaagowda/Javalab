import java.util.*; 
class Cube{
  private int side;
  public Cube(int side){
    
    this.side=side;
  }

  double volume(){
    return Math.pow(side,3);
  }
  double surfar(){
    return 6*Math.pow(side,2);
  }
}
class Cubeapp{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Cube[] cubes=new Cube[3];
    for(int i=0;i<3;i++){
      System.out.println("Enter side of cube ("+(i+1)+"): ");
      int sidelength=sc.nextInt();
      cubes[i]=new Cube(sidelength);
    }
    for(int i=0;i<3;i++){
      System.out.println(" cube ("+(i+1)+"): ");
      System.out.println("volume: "+cubes[i].volume());
      System.out.println("surface area: "+cubes[i].surfar());
    }

  }
}