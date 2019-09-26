// This is the class which adapts the Line class to more user-friendly code
public class LineAdapter implements Shape {
    private Line line;

    public LineAdapter(Line line) {
        this.line = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("\nDrawing using LineAdapter");
        line.draw(x1, y1, x2, y2);
    }
}
