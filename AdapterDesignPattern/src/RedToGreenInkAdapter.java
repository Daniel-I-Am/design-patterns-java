public class RedToGreenInkAdapter implements GreenInk{
    private final RedInk redInk;

    public RedToGreenInkAdapter(RedInk redInk){
        this.redInk = redInk;
    }

    @Override
    public void useGreenInk() {
        System.out.println("drawing with green ink");
        redInk.useRedInk();
    }

    @Override
    public void draw() {
        redInk.draw();
    }
}
