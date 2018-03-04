package visitor.visitor.visitor;

interface VehicleVisitor {

	public void visit(Car car) ;
	
	public void visit(Boat boat) ;
	
	public void visit(Plane plane) ;
}
