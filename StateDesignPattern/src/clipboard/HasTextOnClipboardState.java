package clipboard;

public class HasTextOnClipboardState implements State {
    private Clipboard clipboard;

    HasTextOnClipboardState(Clipboard _clipboard) {
        clipboard = _clipboard;
    }

    public void copy(String text) {
        clipboard.setText(text);
    }

    public String paste() {
        return clipboard.getText();
    }
}
