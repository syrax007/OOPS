import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

   
    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

   
    void display() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();  

   
        Employee[] employees = new Employee[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Employee No: ");
            int eNo = scanner.nextInt();
            scanner.nextLine();  

            System.out.print("Employee Name: ");
            String eName = scanner.nextLine();

            System.out.print("Employee Salary: ");
            double eSalary = scanner.nextDouble();
            scanner.nextLine(); 

           
            employees[i] = new Employee(eNo, eName, eSalary);
        }

    
        System.out.print("Enter the Employee No to search: ");
        int searchENo = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchENo) {
                employees[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with Employee No " + searchENo + " not found.");
        }

        scanner.close();
    }
}

