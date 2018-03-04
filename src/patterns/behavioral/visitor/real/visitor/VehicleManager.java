package visitor.visitor.visitor;

import java.util.ArrayList;
import java.util.List;

class VehicleManager {

	private List <Vehicle> allVehicles = new ArrayList<>();
	private List <Car> carList = new ArrayList<>();
	private List <Boat> boatList = new ArrayList<>();
	private List <Plane> planeList = new ArrayList<>();
	private VehicleVisitor visitor = new AddVehicleVisitor(this);
	
	public void setVisitor(VehicleVisitor v) {
		visitor = v;
	}
	
	public void add(Vehicle vehicle) {
		allVehicles.add(vehicle);
		vehicle.accept(visitor);
	}
	
	public void add(Plane plane) {
		planeList.add(plane);
	}
	
	public void add(Boat boat) {
		boatList.add(boat);
	}
	
	public void add(Car car) {
		carList.add(car);
	}
	
	public void printAllPlanes() {
		for(Plane plane: planeList) {
			System.out.println("This is printing planes " + plane.getClass().getName());
		}
	}
	public void printAllCars() {
		for(Car car: carList) {
			System.out.println("This is printing cars " + car.getClass().getName());
		}
	}

	public void printAllBoats() {
		for(Boat boat: boatList) {
			System.out.println("This is printing boats " + boat.getClass().getName());
		}
	}


	public void printAllVehicles() {
		for(Vehicle vehicle: allVehicles) {
			System.out.println("This is printing vehicles " + vehicle.getClass().getName());
		}
	}


	public void remove(Vehicle vehicle) {
		allVehicles.remove(vehicle);
		vehicle.accept(visitor);
	}
	
	public void remove(Plane plane) {
		planeList.remove(plane);
	}
	
	public void remove(Boat boat) {
		boatList.remove(boat);
	}
	
	public void remove(Car car) {
		carList.remove(car);
	}

	public void setVehicleVisitor(VehicleVisitor v) {
		visitor = v;
	}
	
	
}
