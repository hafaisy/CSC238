import java.util.*;

public class HelloWorld
{
  public static void main(String[] args)
  {
  String name;
  
    System.out.print("Enter your name: ");
    Scanner input=new Scanner(System.in);
    name=input.nextLine();
    
    System.out.println("Hello "+name+". Have a nice day!");
    
  }
}