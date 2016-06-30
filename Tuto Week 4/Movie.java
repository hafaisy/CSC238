public class Movie{
	String MovName;
	String MovDirec;
	double MovDura;
	double MovPrice;
	
	
	public Movie()
	{
		MovName="";
		MovDirec="";
		MovDura=0;
		MovPrice=0;
	}
	public  Movie(String name,String direc,Double duration, double price)
	{
		MovName=name;
		MovDirec=direc;
		MovDura=duration;
		MovPrice=price;
	}
}