package visitor.visitor.visitor;

class AddVehicleVisitor implements VehicleVisitor {

	private VehicleManager manager;
	public AddVehicleVisitor(VehicleManager manager) {
		this.manager = manager;
	}
	
	public void visit(Car car) {
		manager.add(car);
	}
	
	public void visit(Boat boat) {
		manager.add(boat);
	}
	
	public void visit(Plane plane) {
		manager.add(plane);
	}
}
