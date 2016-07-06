public class Movie{
	
  private String MovName,MovDirec;
	private static double MovDura,MovPrice;
	
	public Movie()
	{
		MovName="";
		MovDirec="";
		MovDura=0;
		MovPrice=0;
	}
	public  Movie(String name,String direc,double duration, double price)
	{
		MovName=name;
		MovDirec=direc;
		MovDura=duration;
		MovPrice=price;
	}
  public String getMovie()
  {
    return "Default value is: \n"+MovName+" "+MovDirec+" "+MovDura+" "+MovPrice;
  }
  public void setMovie(String name,String direc,double duration, double price)
  {
  	MovName=name;
		MovDirec=direc;
		MovDura=duration;
		MovPrice=price;
  }
  
  public String toMovie()
  {
    return MovName+"\n"+MovDirec+"\n"+MovDura+"\nRM"+MovPrice;
   }
    
}