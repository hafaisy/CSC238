public class Employee
{
  private String name,design,id;
  public Employee()
  {
    name="Ummu";
    design="Popo";
    id="undefined";
  }
  
  public Employee(String n,String d,String i)
  {
    name=n;
    design=d;
    id=i;
  }
  
  public String getEmployee()
  {
    return "Default value is: \nName: "+name+" \nDesignation: "+design+" \nID: "+id;
  }
  
  public void setEmployee(String n,String d,String i)
  {
    name=n;
    design=d;
    id=i;
  }
  
  public String toEmployee()
  {
    return name+"\n"+design+"\n"+id;
  }
}
   