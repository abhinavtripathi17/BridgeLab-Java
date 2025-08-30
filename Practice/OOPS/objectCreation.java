package OOPS;

public class objectCreation {
    static class Complex {
        int real;
        int imag;

        public Complex(int real, int imag) {
            this.real = real;
            this.imag = imag;
        }

        public Complex add(Complex c) {
            return new Complex(this.real + c.real, this.imag + c.imag);
        }

        public Complex subtract(Complex c) {
            return new Complex(this.real - c.real, this.imag - c.imag);
        }

        public Complex multiply(Complex c) {
            int newReal = this.real * c.real - this.imag * c.imag;
            int newImag = this.real * c.imag + this.imag * c.real;
            return new Complex(newReal, newImag);
        }

        public void display() {
            if (this.imag == 0) {
                System.out.printf("%d\n", this.real);
            } else if (this.real == 0) {
                System.out.printf("%di\n", this.imag);
            } else if (this.imag < 0) {
                System.out.printf("%d - %di\n", this.real, Math.abs(this.imag));
            } else {
                System.out.printf("%d + %di\n", this.real, this.imag);
            }
        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);

        System.out.print("c1 = ");
        c1.display();
        System.out.print("c2 = ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Sum = ");
        sum.display();

        Complex difference = c1.subtract(c2);
        System.out.print("Difference = ");
        difference.display();

        Complex product = c1.multiply(c2);
        System.out.print("Product = ");
        product.display();
    }
}
