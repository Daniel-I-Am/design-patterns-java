import clipboard.Clipboard;

public class Main {
    public static void main(String[] args) {
        // Paste empty clipboard
        Clipboard clipboard_empty = new Clipboard();
        System.out.println(clipboard_empty.paste());

        // Initialize clipboard with content
        Clipboard clipboard_initialized = new Clipboard("asdf");
        System.out.println(clipboard_initialized.paste());

        // Copy text after creation
        Clipboard clipboard_copied = new Clipboard();
        System.out.println(clipboard_copied.paste());
        clipboard_copied.copy("asdf");
        System.out.println(clipboard_copied.paste());
        clipboard_copied.copy("zxcv");
        System.out.println(clipboard_copied.paste());
    }
}
