import java.util.*;
public class first
{
  public static void main (String[]args)
  {
    int[] empNo = new int[]{ 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
      String[] empName = new String[]
    {
    "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
    String[]joinDate = new String[]
    {
    "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005",
	"1/1/2000", "12/06/2006"};
    String[]desigCode = new String[]
    {
    "e", "c", "k", "r", "m", "e", "c"};
    String[]dept = new String[]
    {
    "R&D", "PM", "Acct.", "Front Desk", "Engg", "Manufacturing", "PM"};
    int[] basic =
      new int[]{ 20000, 20000, 10000, 12000, 50000, 23000, 29000 };
    int[] hra = new int[]{ 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
    int[] it = new int[]{ 3000, 9000, 1000, 2000, 20000, 4400, 10000 };
    System.out.print ("Enter the employee ID: ");
    Scanner sc = new Scanner (System.in);
    int enteredId = sc.nextInt ();
    int employeeIdx = -1;
    for (int i = 0; i < 7; i++)
      {
	if (empNo[i] == enteredId)
	  employeeIdx = i;
      }
    if (employeeIdx == -1)
      {
	System.out.print ("There is no employee with empid: " + enteredId);
	return;

      }
    System.out.println ("Employee Number: " + empNo[employeeIdx]);
    System.out.println ("Employee Name: " + empName[employeeIdx]);
    System.out.println ("Employee Department: " + dept[employeeIdx]);
    System.out.println ("Employee Designation: " +
			findEmployeeDesig (desigCode[employeeIdx]));
    int salary =
      basic[employeeIdx] + hra[employeeIdx] +
      findDa (desigCode[employeeIdx]) - it[employeeIdx];
    System.out.println ("Salary of the Eployee: " + salary);
  } public static String findEmployeeDesig (String code)
  {
    switch (code)
      {
      case "e":
	return "Engineer";
      case "c":
	return "Consulatant";
      case "k":
	return "Clerk";
      case "r":
	return "Receptional";
      case "m":
	return "Manager";
      }
    return "No Such Desig Code found";
  }
  public static int findDa (String str)
  {
    switch (str)
      {
      case "e":
	return 20000;
      case "c":
	return 32000;
      case "k":
	return 12000;
      case "r":
	return 15000;
      case "m":
	return 40000;
      }
    return 0;
  }
}