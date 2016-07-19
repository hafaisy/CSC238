public class Plane // class name Plane
{
  private String dest;
  private int kelas;
  private double pticket;
  private int quantity;
  private double totalprice;
  //declare the data members
  public Plane()//default constructor definiton
  {
  dest="";
  kelas=0;
  pticket=0.0;
  quantity=0;
  totalprice=0.0;
  }
  public void setPlane(String a,int b,int d)//set the data for object
  {
     dest=a;
     kelas=b;
     quantity=d;
  }
  
  public void displaychoice()//display available choices 
  {
    System.out.println("Welcome to Arau Airline System !");
    System.out.println("****************************************************************");
    System.out.println("DESTINATION\t\t TICKET PRICE(one way)\t\tTICKET PRICE(one way)");
    System.out.println("        \t\t\tCLASS 1\t\t\t\tCLASS 2\n");
    System.out.println("(P)enang\t\t\tRM89.00\t\t\t\tRM65.00");
    System.out.println("(K)uala Terengganu\t\tRM186.00\t\t\tRM120.00");
    System.out.println("(J)ohor Bharu\t\t\tRM117.00\t\t\tRM99.00");
    System.out.println("****************************************************************");

  }
  public void setDestination (String a,int b,int d)
  {
      if(a.equals("P"))
      {
         dest="Penang";
         
         if (b==1)
         {
            pticket=89.00;
         }
         else if (b==2)
         {
            pticket=65.00;
         }
         
      }
      if(a.equals("K"))
      {
         dest="Kuala Terengganu";
         
         if (b==1)
         {
            pticket=186.00;
         }
         else if (b==2)
         {
            pticket=120.00;
         }
        
      }
      if(a.equals("J"))
      {
         dest="Johor Bharu";
         
         if (b==1)
         {
            pticket=117.00;
         }
         else if (b==2)
         {
            pticket=990.00;
         }
         
      }
      totalprice=pticket*quantity;
     
  }
   
 public String toString()
 {
 return "Destination: "+dest+"\nQuantity: "+quantity+"\nPrice Per Ticket: "+pticket+"\nTotal Price: RM"+totalprice;
 }
  
}