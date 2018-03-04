package visitor.visitor.visitor;

import org.junit.Test;

public class VehicleManagerTest {

	@Test
	public void test() {
		final VehicleManager manager = new VehicleManager();
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
		
		VehicleVisitor removePlanes = new VehicleVisitor() {
			
			@Override
			public void visit(Plane plane) {
				//manager.remove(plane);	
			}
			
			@Override
			public void visit(Boat boat) {
				manager.remove(boat);	
				
			}
			
			@Override
			public void visit(Car car) {
			}
		};
		manager.setVehicleVisitor(removePlanes);

		manager.remove(vehicle1);
		manager.remove(vehicle2);
		manager.remove(vehicle3);
		manager.remove(vehicle4);
		manager.remove(vehicle5);
		manager.remove(vehicle6);
		manager.remove(vehicle7);
		manager.remove(vehicle8);
		manager.remove(vehicle9);
		
		manager.printAllCars();
		manager.printAllPlanes();
		manager.printAllBoats();
		manager.printAllVehicles();

	}
}
