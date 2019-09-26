package nl.danieldecloet.images;

class Server {
    static Image getImage(String name) {
        System.out.println("Started fetching image.");
        simulateNetworkDelay();
        System.out.println("Returning image.");
        return new ConcreteImage(name);
    }

    private static void simulateNetworkDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}
    }
}
