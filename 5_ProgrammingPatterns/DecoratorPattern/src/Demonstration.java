public class Demonstration {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape colorCircle = new ColorShapeDecorator(new Circle(), "Red");

        circle.draw();
        System.out.println("------------------");
        colorCircle.draw();
    }
}