import java.util.Scanner;


class Student {
    String studentName;
    int rollNo;
    double academicScore;
    public Student(String studentName, int rollNo, double academicScore) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.academicScore = academicScore;
    }

   
    public void displayAcademic() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Academic Score: " + academicScore);
    }
}

class Sports {
    double sportsScore;

   
    public Sports(double sportsScore) {
        this.sportsScore = sportsScore;
    }

    public void displaySports() {
        System.out.println("Sports Score: " + sportsScore);
    }
}

class Result extends Student {
    Sports sports; 

 
    public Result(String studentName, int rollNo, double academicScore, double sportsScore) {
        super(studentName, rollNo, academicScore); 
        this.sports = new Sports(sportsScore); 
    }

    public void displayResult() {
        displayAcademic();
        sports.displaySports();
    }
}

public class ResultDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Academic Score: ");
        double academicScore = sc.nextDouble();

        System.out.print("Enter Sports Score: ");
        double sportsScore = sc.nextDouble();

  
        Result result = new Result(studentName, rollNo, academicScore, sportsScore);

     
        System.out.println("\n--- Student Result ---");
        result.displayResult();

        sc.close();
    }
}

