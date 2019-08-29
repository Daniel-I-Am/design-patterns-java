public class RedMarker implements RedInk {
    private boolean onPaper;

    @Override
    public void useRedInk() {
        onPaper = true;
        System.out.println("using red marker");
    }

    @Override
    public void draw() {
        if (onPaper){
            System.out.println("started drawing with red ink");
            System.out.println("stopped drawing with red ink");
        } else{
            System.out.println("start drawing something nice");
        }
    }
}
