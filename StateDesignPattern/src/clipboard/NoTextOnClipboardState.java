package clipboard;

class NoTextOnClipboardState implements State {
    private Clipboard clipboard;

    NoTextOnClipboardState(Clipboard _clipboard) {
        clipboard = _clipboard;
    }

    public void copy(String text) {
        clipboard.setText(text);
        clipboard.setCurrentState(clipboard.getHasTextOnClipboardState());
    }

    public String paste() {
        return null;
    }
}
