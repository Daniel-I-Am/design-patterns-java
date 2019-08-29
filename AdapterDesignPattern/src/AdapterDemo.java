public class AdapterDemo {
    static void drawWithGreenInk (GreenInk marker){
        marker.useGreenInk();
        marker.draw();
    }

    static void drawWithRedInk (RedInk marker){
        marker.useRedInk();
        marker.draw();
    }

    public static void main(String[] args){
        GreenMarker greenMarker = new GreenMarker();
        RedMarker redMarker = new RedMarker();

        System.out.println("drawing green with green marker");
        drawWithGreenInk(greenMarker);

        System.out.println("drawing red with red marker");
        drawWithRedInk(redMarker);

        System.out.println("drawing green with red marker");
        drawWithGreenInk(new RedToGreenInkAdapter(redMarker));
    }
}
