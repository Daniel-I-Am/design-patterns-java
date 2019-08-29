public class GreenMarker implements GreenInk {
    private boolean onPaper;

    @Override
    public void useGreenInk() {
        onPaper = true;
        System.out.println("using green marker");
    }

    @Override
    public void draw() {
        if (onPaper){
            System.out.println("started drawing with green ink");
            System.out.println("stopped drawing with green ink");
        } else{
            System.out.println("start drawing something nice");
        }
    }
}
