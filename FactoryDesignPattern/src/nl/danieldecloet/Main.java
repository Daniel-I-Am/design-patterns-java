package nl.danieldecloet;

import nl.danieldecloet.pizzadelivery.TransportVehicle;
import nl.danieldecloet.pizzadelivery.TransportVehicleFactory;

public class Main {

    public static void main(String[] args) {
        TransportVehicleFactory factory = new TransportVehicleFactory();

        TransportVehicle vehicle = factory.getVehicle("CAR");

        vehicle.transportPizza();
    }
}
