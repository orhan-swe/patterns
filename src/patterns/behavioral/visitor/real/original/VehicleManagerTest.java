package visitor.visitor.original;

import org.junit.Test;

public class VehicleManagerTest {

	@Test
	public void test() {
		VehicleManager manager = new VehicleManager();
		Vehicle vehicle1 = new Car();
		Vehicle vehicle2 = new Car();
		Vehicle vehicle3 = new Car();
		Vehicle vehicle4 = new Boat();
		Vehicle vehicle5 = new Boat();
		Vehicle vehicle6 = new Plane();
		Vehicle vehicle7 = new Plane();
		Vehicle vehicle8 = new Plane();
		Vehicle vehicle9 = new Plane();
		
		manager.add(vehicle1);
		manager.add(vehicle2);
		manager.add(vehicle3);
		manager.add(vehicle4);
		manager.add(vehicle5);
		manager.add(vehicle6);
		manager.add(vehicle7);
		manager.add(vehicle8);
		manager.add(vehicle9);
		
		manager.printAllPlanes();
		manager.printAllVehicles();
	}

}
