import java.util.*;

public class sumn
{
  public static void main(String[] args)
  {
    int limit,sum=0,count=0;
    System.out.println("How many number you want to enter?");
    Scanner input=new Scanner(System.in);
    limit=input.nextInt();
    
    for(int x=0;x<limit;x++)
    {
      int number=0;
      count++;
      
      System.out.print("Enter value for number "+count+" :");
      number=input.nextInt();
      
      sum+=number;
    }
    System.out.print("The sum is :"+sum);
  }
}    
    