package Adapter;

public class Client {
    public static void main(String[] args) {
        Veichle car = new Car();
        Veichle bicycle = new BicycleAdapter(new Bicycle());
        playWithVehicle(car);

        playWithVehicle(bicycle);
    }
    //Client method expecting Vehicle object
    private static void playWithVehicle(Veichle Veichle) {
        Veichle.accelerate();
        Veichle.pushBreak();
        Veichle.soundHorn();
    }

}
