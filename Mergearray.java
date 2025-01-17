
import java.util.Arrays;
import java.util.Scanner;
class Mergearray{
  int[] array1;
  int[] array2;
  Mergearray(){

  }
  Mergearray(int[] a,int[] b){
    array1=a;
    array2=b;
  }
  int[] merge(){
    int alen=array1.length;
    int blen=array2.length;

    int[] c= new int[alen+blen];
    int i;
    for(i=0;i<alen;i++){
      c[i]=array1[i];
    }
    for(int j=0;j<blen;j++){
      c[alen+j]=array2[j];
    }
    return c;

  }

  int[] sortarr(int[] arr){
    Arrays.sort(arr);
    return arr;
  }

  void display(int[] arr){
    System.out.println("array elements are: ");
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+"\t");

    }
  }
  int[] readinputs(Scanner in){
    System.out.println(" no of array elements are: ");
    int n=in.nextInt();
    int[] arr =new int[n];
    for(int i=0;i<n;i++){
      arr[i]=in.nextInt();

    }
    return arr;
  }

  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    Mergearray obj1=new Mergearray();
    Mergearray obj2=new Mergearray();
    int[] a=obj1.readinputs(in);
    int[] b=obj2.readinputs(in);
    Mergearray obj = new Mergearray(a,b);
    int[] d=obj.merge();
    int[] SA=obj.sortarr(d);
    System.out.println("Sorted merged array: ");
    obj.display(SA);

  }
}