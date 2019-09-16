package clipboard;

public interface State {
    void copy(String text);
    String paste();
}
