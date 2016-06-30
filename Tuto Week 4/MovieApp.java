import java.util.*;
public class MovieApp
{
  public static void main (String[] args)
  {
    String a;
    String b;
    double c;
    double d;
    
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter Name: ");
    a=scan.nextLine();
    System.out.print("Enter the Director: ");
    b=scan.nextLine();
    System.out.print("Enter the duration: ");
    c=scan.nextDouble();
    System.out.print("Enter the ticket Price: ");
    d=scan.nextDouble();
    
    Movie x=new Movie(a,b,c,d);
    System.out.println("Name: "+x.MovName);
    System.out.println("Director: "+x.MovDirec);
    System.out.println("Duration: "+x.MovDura+" minutes.");
    System.out.println("Price: RM"+x.MovPrice);
    
   }
}