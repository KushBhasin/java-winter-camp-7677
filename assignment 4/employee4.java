import java.util.*;
public class employee4
{
    static ArrayList<String> empName = new ArrayList<>();
    static ArrayList<String> eid = new ArrayList<>();
    static ArrayList<String> designation = new ArrayList<>();
    static ArrayList<Integer> salary = new ArrayList<>();
    public static class Employee{
        
        public void addData(String name1, String eid1, String designation1, int salary1){
            empName.add(name1);
            eid.add(eid1);
            designation.add(designation1);
            salary.add(salary1);
        }
        
        public void display(){
            for (int i = 0; i < empName.size(); i++){
                System.out.println("Name: " + empName.get(i));
                System.out.println("Employee ID : " + eid.get(i));
                System.out.println("Designation: " + designation.get(i));
                System.out.println("Salary: " + salary.get(i));
            }
        }
    }
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while(true){
		    System.out.println("Enter Choices: ");
    		System.out.println("1. Add Employee");
    		System.out.println("2. Display");
    		System.out.println("3. Exit"); 
    		
		    int choices = in.nextInt();
		    
		    Employee emp = new Employee();
		    
		    switch(choices){
		        case 1:
		            System.out.println("Enter your Name: ");
		            String name = in.next();
		            System.out.println("Enter your Designation: ");
		            String designation = in.next();
		            System.out.println("Enter your Eid: ");
		            String eid = in.next();
		            System.out.println("Enter your Salary: ");
		            int salary = in.nextInt();
		            emp.addData(name, eid, designation, salary);
		            continue;
		        case 2:
		            emp.display();
		            continue;
		        case 3:
		            return;
		    }
		}
	}
}
