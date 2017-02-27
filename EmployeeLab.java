public class EmployeeLab
{
  public static void main(String[] args)
  {
    Employee emp = new Employee("Susan Meyers", 47899, "Accounting", "Vice Pres");
    Employee emp1 = new Employee("Mark Jones", 39119, "IT", "Programmer");
    Employee emp2 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
 
    System.out.println(" Name:        ID Number:   Department:      Position:  ");
    System.out.print(" " + emp.getName() + "  " + emp.getIdNumber() + "     " + emp.getDepartment());
    System.out.println("      " + emp.getPosition());
    System.out.print(" " + emp1.getName() + "    " + emp1.getIdNumber() + "     " + emp1.getDepartment());
    System.out.println("              " + emp1.getPosition());
    System.out.print(" " + emp2.getName() + "    " + emp2.getIdNumber() + "     " + emp2.getDepartment());
    System.out.println("   " + emp2.getPosition());
     }
  }
