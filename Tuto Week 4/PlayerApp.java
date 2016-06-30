import java.util.*;
                         
public class PlayerApp
 {
   public static void main(String args[])
   {
   String a;
   String b;
   String c;
   String d;
   int e;

   
   Scanner scan=new Scanner(System.in);
   System.out.println("Hello, please enter the player name: ");
   a=scan.nextLine();
   System.out.println("Enter the player Game: ");
   b=scan.nextLine();
   System.out.println("Enter the player Gender: ");
   c=scan.nextLine();
   System.out.println("Enter the player Rank:");
   d=scan.nextLine();
   System.out.println("Enter the player Age: ");
   e=scan.nextInt();
   
    Player x=new Player(a,b,c,d,e);
    
    System.out.println("Player Name: "+x.plaName);
    System.out.println("Game: "+x.plaGame);
    System.out.println("Gender: "+x.plaGender);
    System.out.println("Age: "+x.age);
    System.out.println("Rank: "+x.plaRank);
   }  
   
 }
  
  
  
  
