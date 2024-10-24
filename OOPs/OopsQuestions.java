public class OopsQuestions {
    public static void main(String[] args) {
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}

// Class Complex to handle complex numbers
class Complex {
    int real, imag;

    // Constructor to initialize the real and imaginary parts
    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    // Method to subtract two complex numbers
    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    // Method to multiply two complex numbers
    public static Complex product(Complex a, Complex b) {
        int realPart = a.real * b.real - a.imag * b.imag;
        int imagPart = a.real * b.imag + a.imag * b.real;
        return new Complex(realPart, imagPart);
    }

    // Method to print the complex number in the standard form
    public void printComplex() {
        System.out.println("Complex Number: " + real + " + " + imag + "i");
    }
}
