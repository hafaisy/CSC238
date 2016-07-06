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
    
    Movie x=new Movie();
    System.out.println(x.getMovie()+"\n");
    System.out.print("Enter Name: ");
    a=scan.nextLine();
    System.out.print("Enter the Director: ");
    b=scan.nextLine();
    System.out.print("Enter the duration: ");
    c=scan.nextDouble();
    System.out.print("Enter the ticket Price: ");
    d=scan.nextDouble();
    
    x.setMovie(a,b,c,d);
    System.out.println("\n"+x.toMovie());
   }
}