package clipboard;

public class Clipboard {
    private State noTextOnClipboardState;
    private State hasTextOnClipboardState;

    private State currentState;
    private String text;

    public Clipboard() {
        this(null);
    }

    public Clipboard(String text) {
        noTextOnClipboardState = new NoTextOnClipboardState(this);
        hasTextOnClipboardState = new HasTextOnClipboardState(this);

        if (text != null) {
            setCurrentState(hasTextOnClipboardState);
            setText(text);
        } else {
            setCurrentState(noTextOnClipboardState);

        }
    }

    void setCurrentState(State state) {
        currentState = state;
    }

    State getCurrentState() {
        return currentState;
    }

    State getNoTextOnClipboardState() {
        return noTextOnClipboardState;
    }

    State getHasTextOnClipboardState() {
        return hasTextOnClipboardState;
    }

    public void copy(String text) {
        currentState.copy(text);
    }

    public String paste() {
        return currentState.paste();
    }

    String getText() {
        return text;
    }

    void setText(String text) {
        this.text = text;
    }
}
