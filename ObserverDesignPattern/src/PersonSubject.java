import java.util.ArrayList;

public class PersonSubject {

    private ArrayList<CameraObserver> cameraObservers = new ArrayList<CameraObserver>();

    public void attach(CameraObserver cameraObserver) {
        cameraObservers.add(cameraObserver);
    }

    public void detach(CameraObserver cameraObserver) {
        cameraObservers.remove(cameraObserver);
    }

    public void move() {
        for (CameraObserver cameraObserver : cameraObservers) {
            cameraObserver.pointTowardsSubject();
        }
    }

}
