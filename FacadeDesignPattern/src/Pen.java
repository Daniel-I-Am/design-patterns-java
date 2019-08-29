public class Pen {
    private int x;
    private int y;

    public void drawToCoordinate(int x, int y) {
        // The pen would draw a line from the current coordinate to the one
        // Given as arguments
        this.x = x;
        this.y = y;
    }
}
