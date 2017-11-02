package pAbsFactory;

public class Factory3D extends Factory {

	@Override
	public Shape createCircle() {
		return new Circle3D("Circle 3D");
	}

	@Override
	public Shape createTriangle() {
		return new Triangle3D("Triangle 3D");
	}
	
	@Override
	public Shape createRectangle() {
		return new Triangle3D("Rectangle 3D");
	}

}
