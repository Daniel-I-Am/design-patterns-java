package nl.danieldecloet.images;

class GetImageReal implements GetImage {
    public Image get(String name) {
        return Server.getImage(name);
    }
}
