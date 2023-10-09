package Shapes;

public class Main {
    // Create a class hierarchy for geometric shapes
    // (e.g., Circle, Rectangle, Triangle) with methods to calculate
    // area and perimeter for each shape.

    // circle A = 3.14 * r*r
    // Rect A = length * width
    // Tri A = base * height * 0.5

    public static void main(String[] args) {
        try{
        Circle cObj = new Circle(5);
        System.out.println("Cirle area is " + cObj.area());
        System.out.println("Cirle perimeter is " + cObj.perimeter());
        cObj.setRadius(12);
        System.out.println("New area " +  cObj.area());
        } catch(Exception e ){
            System.out.println("Something went wrong");
        }


        // Rectangle rObj = new Rectangle(5,10);

        // System.out.println("Rectangle area is " + rObj.area());
        // System.out.println("Rectangle perimeter is " + rObj.perimeter());

        // Triangle tObj = new Triangle(5,10,12);

        // System.out.println("Triangle area is " + tObj.area());
        // System.out.println("Triangle perimeter is " + tObj.perimeter());
    }
}

