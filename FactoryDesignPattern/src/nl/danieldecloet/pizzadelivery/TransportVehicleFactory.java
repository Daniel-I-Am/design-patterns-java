package nl.danieldecloet.pizzadelivery;

public class TransportVehicleFactory {
    public TransportVehicle getVehicle(String transportVehicle) {
        switch (transportVehicle) {
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            case "MOTORBIKE":
                return new MotorBike();
            default:
                return null;
        }
    }
}
