public class Player
{
  private String name,game,gender;
  private static int age,rank;
  public Player()
  {
    name="lul";
    game="dull";
    gender="tanpajantina";
    age=0;
    rank=0;
  }
  public Player(String a,String b, String c, int d,int e)
  {
    name=a;
    game=b;
    gender=c;
    age=d;
    rank=e;
  }
  public String getPlayer()
  {
    return "This is the default value: \nName: "+name+"\nGame: "
    +game+"\nGender: "+gender+"\nAge: "+age+"\nRank: "+rank;
  }
  
  public void setPlayer(String a,String b, String c,int d, int e)
  {
    name=a;
    game=b;
    gender=c;
    age=d;
    rank=e;
   }
  
  public String toPlayer()
  {
     return "Name: "+name+"\nGame: "+game+"\nGender: "+gender+"\nAge: "
     +age+"\nRank: "+rank;
     }
}