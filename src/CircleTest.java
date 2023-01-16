public class CircleTest {
    public static void main(String[] args) {
        Circle DefaultCircle = new Circle();
        Circle TestCircle = new Circle(3.5, "blue");

        System.out.println("Default radius is: " + DefaultCircle.getRadius());
        System.out.println("Default area is: " + DefaultCircle.getArea());
        System.out.println("Default color is: " + DefaultCircle.getColor());
        System.out.println("Assigned radius is: " + TestCircle.getRadius());
        System.out.println("Assigned area is: " + TestCircle.getArea());
        System.out.println("Assigned color is: " + TestCircle.getColor());
    }
}