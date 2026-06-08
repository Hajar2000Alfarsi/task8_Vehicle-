import java.util.ArrayList;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    //Initialize 3 sample of data
    public VehicleManager(){
        vehicles.add(new Vehicle("V101", "Toyota Corolla", 20));
        vehicles.add(new Vehicle("V102", "Nissan Sunny", 18));
        vehicles.add(new Vehicle("V103", "Hyundai Elantra", 22));
    }

    public String addVehicle(Vehicle vehicle){
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(vehicle.getVehicleId())) {
                return "Vehicle ID already exists \n" +
                        "No vehicle was added";
            }
        }

        vehicles.add(vehicle);

        return "****************************\n" +
                "Vehicle Added Successfully\n"
                + "Vehicle ID: " + vehicle.getVehicleId() + "\n"
                + "Vehicle Model: " + vehicle.getVehicleModel() + "\n"
                + "Rental Price Per Day: " + vehicle.getRentalPricePerDay() + " OMR\n"
                + "Status: Created\n"+
                "***************************\n";
    }

}
