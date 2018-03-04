package visitor.visitor.visitor;

class Boat extends Vehicle {


	@Override
	public void accept(VehicleVisitor visitor) {
		visitor.visit(this);
	}

}
