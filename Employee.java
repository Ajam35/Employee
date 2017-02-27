
//Andrew LaRoche
//CS310 Data Structures
//Employee Class programming assignment


public class Employee
{
  //fields
  private String name;
  private int idNumber;
  private String department;
  private String position;
  
  //constructors
  
  public Employee(String nam,int id,String dep, String pos)
  {
    name = nam;
    idNumber = id;
    department = dep;
    position = pos;
  }
  public Employee(String nam, int id)
  {
    name = nam;
    idNumber = id;
    department = " ";
    position = " ";
  }
  public Employee()
  {
    name =  " ";
    idNumber = 0;
    department = " ";
    position = " ";
    
  }
  //"setter" and "getter" methods:
  public void setName(String nam)
  {
    name = nam;
  }
  public String getName()
  {
    return name;
  }
  public void setIdNumber(int id)
  {
    idNumber = id;
  }
  public int getIdNumber()
  {
    return idNumber;
  }
  
  public void setDepartment(String dep)
  {
    department = dep;
  }
  public String getDepartment()
  {
    return department;
  }
    public void setPosition(String pos)
  {
    position = pos;
  }
  public String getPosition()
  {
    return position;
  }
  

}
  
  