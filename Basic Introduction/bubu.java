
import java.util.*;
public class bubu
{

public static void main(String[]args)
{
 String name;
 System.out.print("Please enter your name: ");
 Scanner scan=new Scanner (System.in);
 name=scan.nextLine();
 
 String one="Bob";
 String two="Alice";
 
 if(name.equalsIgnoreCase(one)){
  System.out.print("Hello "+name+", have a nice day!");
  }
  else if(name.equalsIgnoreCase(two)){
  System.out.print("Hello "+name+", have a nice day!");
  }
 else{
  System.out.print("Hello, I don't know you.");
  }

}
}