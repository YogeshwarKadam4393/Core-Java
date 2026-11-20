public class VehicleApp {
    public static void main(String[] args) {
        ElectricCar car = new ElectricCar();

        car.start();
        car.accelerate();
        car.chargeBattery();
        car.stop();
    }
}
