public class Player
{
  String plaName;
  String plaGame;
  String plaGender;
  int age;
  String plaRank;
  
  public Player()
  {
  plaName=" ";
  plaGame=" ";
  plaGender=" ";
  age=0;
  plaRank=" ";
  }
  
  public Player(String Name, String Game, String Gender,String rank, int xage)
  {
  plaName=Name;
  plaGame=Game;
  plaGender=Gender;
  plaRank=rank;
  age=xage;
  }
}