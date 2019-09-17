package whiteboard;

public class Eraser extends WhiteboardUtensil {
    // Override step 1
    @Override
    protected void putOnWhiteboard() {
        System.out.println("Put eraser in upper-right corner");
    }

    // Define step 2
    protected void moveOverWhiteboard() {
        System.out.println("Erasing whiteboard");
    }

    // Override step 3, calling original
    @Override
    protected void pullOffWhiteboard() {
        super.pullOffWhiteboard();
        System.out.println("This object was the eraser");
    }
}
