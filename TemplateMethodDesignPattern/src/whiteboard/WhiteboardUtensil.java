package whiteboard;

public abstract class WhiteboardUtensil {
    // Public method that calls all internal steps
    public void use() {
        putOnWhiteboard();
        moveOverWhiteboard();
        pullOffWhiteboard();
    }

    // Default step 1
    protected void putOnWhiteboard() {
        System.out.println("Put object on whiteboard");
    }

    // Custom step 2 - every child implements its own
    protected abstract void moveOverWhiteboard();

    // Default step 3
    protected void pullOffWhiteboard() {
        System.out.println("Pulled object off whiteboard");
    }
}
