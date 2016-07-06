import java.util.*;

public class PlayerApp
{
  public static void main (String[] args)
  {
    String a,b,c;
    int d,e;
    
    Scanner x=new Scanner(System.in);
    Player y=new Player();
    
    y.getPlayer();
    System.out.println(y.getPlayer()+"\n");
    
    System.out.print("Name: ");
    a=x.nextLine();
    System.out.print("Game: ");
    b=x.nextLine();
    System.out.print("Gender: ");
    c=x.nextLine();
    System.out.print("Age: ");
    d=x.nextInt();
    System.out.print("Rank: ");
    e=x.nextInt();
    
    y.setPlayer(a,b,c,d,e);
    System.out.println("\n"+y.toPlayer());
  }
}
    