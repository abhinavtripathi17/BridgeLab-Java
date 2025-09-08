package JavaClassandObject.Level1;

public class AreaOfCircle {
    double radius;

    // Constructor
    AreaOfCircle(double radius) {
        this.radius = radius;
    }

    // Method for calculating area of circle
    public void areaCircle() {
        System.out.printf("Area of circle: %.4f", (Math.PI * radius * radius));
    }

    // Method for calculating circumference of circle
    public void circumferenceCircle() {
        System.out.printf("\nCircumference of circle: %.4f", (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        AreaOfCircle circle = new AreaOfCircle(2.5); // Constructor invoke

        circle.areaCircle();           // Area method calling
        circle.circumferenceCircle();  // Circumference method calling
    }
}
