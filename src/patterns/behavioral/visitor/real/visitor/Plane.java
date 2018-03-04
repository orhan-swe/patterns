package visitor.visitor.visitor;

class Plane extends Vehicle {

	@Override
	public void accept(VehicleVisitor visitor) {
		visitor.visit(this);
	}

}
