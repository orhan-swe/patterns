package visitor.visitor.visitor;

class Car extends Vehicle {

	@Override
	public void accept(VehicleVisitor visitor) {
		visitor.visit(this);
	}

}
