package pAbsFactory;

public class Factory2D extends Factory {

	@Override
	public Shape createCircle() {
		return new Circle2D("Circle 2D");
	}

	@Override
	public Shape createTriangle() {
		return new Triangle2D("Triangle 3D");
	}
	
	@Override
	public Shape createRectangle() {
		return new Triangle2D("Rectangle 3D");
	}

}
