package nl.danieldecloet.images;

class ConcreteImage implements Image {
    private String name;

    ConcreteImage(String _name) {
        name = _name;
    }

    @Override
    public String getName() {
        return name;
    }
}
