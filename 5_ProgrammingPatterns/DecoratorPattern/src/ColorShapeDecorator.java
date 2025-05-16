public class ColorShapeDecorator extends ShapeDecorator {

    private String color;

    public ColorShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setColorBorder(decoratedShape);
    }

    private void setColorBorder(Shape decoratedShape) {
        System.out.println(color + " border color.");
    }
}
