import java.util.ArrayList;

public class VehicleManager {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    //Initialize 3 sample of data
    public VehicleManager(){
        vehicles.add(new Vehicle("V101", "Toyota Corolla", 20));
        vehicles.add(new Vehicle("V102", "Nissan Sunny", 18));
        vehicles.add(new Vehicle("V103", "Hyundai Elantra", 22));
    }


}
