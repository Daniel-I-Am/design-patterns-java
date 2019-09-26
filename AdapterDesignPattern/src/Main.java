public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new RectangleAdapter(new Rectangle()),
                            new LineAdapter(new Line())};

        int x1 = 20, y1 = 25;
        int x2 = 50, y2 = 75;

        for (Shape shape: shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}
