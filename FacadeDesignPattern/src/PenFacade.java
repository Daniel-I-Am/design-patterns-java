public class PenFacade {
    private Pen pen;

    public PenFacade() {
        this.pen = new Pen();
    }

    public void drawLetter(char letter) {
        // This somehow calls
        // pen.drawToCoordinate(x, y);
        // In order to move the pen around in the shape
        // Of the letter given as argument
        pen.drawToCoordinate((int)letter, (int)letter);
    }

    public void drawString(String string) {
        // Even easier method on the facade, which
        // draws out a string instead of one character
        for (char c : string.toCharArray()) {
            this.drawLetter(c);
        }
    }
}
