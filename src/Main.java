public class Main {
    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();

        System.out.println("Vehicles Before POST:");
        manager.displayVehicle();

        Vehicle newVehicle = new Vehicle("V104", "Kia Sportage", 30);


    }
}