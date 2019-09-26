// This is the class which adapts the Rectangle class to more user-friendly code
public class RectangleAdapter implements Shape {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("\nDrawing using RectangleAdapter");
        rectangle.draw(x1, y1, x2, y2);
    }
}
