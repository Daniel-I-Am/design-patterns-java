import whiteboard.Eraser;
import whiteboard.GreenPen;
import whiteboard.RedPen;
import whiteboard.WhiteboardUtensil;

public class Main {
    public static void main(String[] args) {
        // Initialize all utensils
        final WhiteboardUtensil redPen = new RedPen();
        final WhiteboardUtensil greenPen = new GreenPen();
        final WhiteboardUtensil eraser = new Eraser();

        // Call the public method
        redPen.use();
        System.out.println();
        greenPen.use();
        System.out.println();
        eraser.use();
    }
}