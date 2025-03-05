import java.util.Scanner;

class Complex {
    double real, imaginary;
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }
    void display() {
        if (imaginary < 0)
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
        else
            System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        double real1 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1 = sc.nextDouble();
        System.out.println("Enter the real part of the second complex number:");
        double real2 = sc.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2 = sc.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);
        Complex result = complex1.add(complex2);
        System.out.print("Result of addition: ");
        result.display();
        sc.close();
    }
}

