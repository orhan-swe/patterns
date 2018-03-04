package visitor.visitor.original;

import java.util.ArrayList;
import java.util.List;

class VehicleManager {

	private List<Vehicle> allVehicles = new ArrayList<>();
	private List<Car> carList = new ArrayList<>();
	private List<Boat> boatList = new ArrayList<>();
	private List<Plane> planeList = new ArrayList<>();

	public void add(Vehicle vehicle) {
		allVehicles.add(vehicle);
		if (vehicle instanceof Car) {
			carList.add((Car) vehicle);
		} else if (vehicle instanceof Boat) {
			boatList.add((Boat) vehicle);
		} else if (vehicle instanceof Plane) {
			planeList.add((Plane) vehicle);
		}
	
	}
	
	public void printAllPlanes() {
		for(Plane plane: planeList) {
			System.out.println("This is " + plane.getClass().getName());
		}
	}

	public void printAllVehicles() {
		for(Vehicle vehicle: allVehicles) {
			System.out.println("This is " + vehicle.getClass().getName());
		}
	}


}
