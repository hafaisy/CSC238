
public class Student
{
  String stuNum;
  String stuName;
  String stuProg;
  double cgpa;
  
  public Student()
  {
  stuNum=" ";
  stuName="  ";
  stuProg=" ";
  cgpa=3.95;
  }
  
  public Student(String Num,String Name,String Prog,double xcgpa)
  {
  stuNum=Num;
  stuName=Name;
  stuProg=Prog;
  cgpa=xcgpa;
  }
}