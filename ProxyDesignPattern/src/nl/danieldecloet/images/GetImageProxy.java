package nl.danieldecloet.images;

import java.util.HashMap;
import java.util.Map;

public class GetImageProxy implements GetImage {
    private GetImageReal getImageReal;
    private Map<String, Image> cachedImages;

    public GetImageProxy() {
        getImageReal = new GetImageReal();
        cachedImages = new HashMap<>();
    }

    public Image get(String name) {
        if (cachedImages.containsKey(name)) {
            System.out.printf("Returning awesome image for %s.\n", name);
            return cachedImages.get(name);
        }
        Image imageToStore = getImageReal.get(name);
        cachedImages.put(name, imageToStore);
        System.out.printf("Returning awesome image for %s.\n", name);
        return imageToStore;
    }
}
