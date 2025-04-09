import java.util.Scanner;
class Person {
    String name;
    String gender;
    String address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}


class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

 
    public Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}


class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;


    public Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
        System.out.println();
    }
}


public class TeacherDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of teachers: ");
        int N = sc.nextInt();
        sc.nextLine();  

        Teacher[] teachers = new Teacher[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details for teacher " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();  

            System.out.print("Enter Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();  

            System.out.print("Enter Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Enter Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();  

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Teacher ID: ");
            int teacherId = sc.nextInt();
            sc.nextLine();  

        
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, qualification, salary, subject, department, teacherId);
        }

     
        System.out.println("\nTeacher Details:");
        for (int i = 0; i < N; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}

