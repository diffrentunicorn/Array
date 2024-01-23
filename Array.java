import java.util.*;

public class Array{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] arr = new int[5];
    for(int i = 0 i < arr.length; i++){
      System.out.print("Enter the Number for index : "+i+" : ");
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i < arr.length; i++){
      System.out.println("The Value of index "+i+" is "+ arr[i]);
    }
  }
}
