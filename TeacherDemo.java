import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;
    String address;

    public Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
class Teacher extends Employee {
    String department;
    String subjectsTaught;
    public Teacher(int empId, String name, double salary, String address, String department, String subjectsTaught) {
      
        super(empId, name, salary, address);
        this.department = department;
        this.subjectsTaught = subjectsTaught;
    }

    
    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subjects Taught: " + subjectsTaught);
        System.out.println();
    }
}

public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the number of teachers: ");
        int N = sc.nextInt();
        sc.nextLine();  

        
        Teacher[] teachers = new Teacher[N];

      
        for (int i = 0; i < N; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");

            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();  

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Subjects Taught: ");
            String subjectsTaught = sc.nextLine();

           
            teachers[i] = new Teacher(empId, name, salary, address, department, subjectsTaught);
        }

        
        System.out.println("\nTeacher Details:");
        for (int i = 0; i < N; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}

