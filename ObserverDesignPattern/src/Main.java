public class Main {

    public static void main(String[] args) {
        CameraObserver cameraObserverA = new CameraObserver();
        CameraObserver cameraObserverB = new CameraObserver();

        PersonSubject personSubject = new PersonSubject();

        personSubject.move();
        personSubject.attach(cameraObserverA);
        personSubject.move();
        personSubject.attach(cameraObserverB);
        personSubject.move();
    }

}
