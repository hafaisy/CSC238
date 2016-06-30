import java.util.*;
public class namegreets
{

public static void main(String[]args)
{
 String name;
 System.out.print("Please enter your name: ");
 Scanner scan=new Scanner (System.in);
 name=scan.nextLine();
 System.out.print("Hello "+name+". Have a nice day!");
}
}