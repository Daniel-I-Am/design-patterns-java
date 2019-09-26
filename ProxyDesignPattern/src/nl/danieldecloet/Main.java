package nl.danieldecloet;

import nl.danieldecloet.images.GetImage;
import nl.danieldecloet.images.GetImageProxy;

public class Main {

    public static void main(String[] args) {
        GetImage getImage = new GetImageProxy();

        getImage.get("cat");
        getImage.get("cat");
        getImage.get("cat");
        getImage.get("dog");
        getImage.get("dog");
        getImage.get("cat");
    }
}
