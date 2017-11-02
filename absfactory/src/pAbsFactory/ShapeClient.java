package pAbsFactory;

public class ShapeClient {

	Shape circle;
	Shape triangle;
	Shape rectangle;
	ShapeClient(Factory factory)
	{
		circle = factory.createCircle();
		triangle = factory.createTriangle();
		rectangle = factory.createRectangle();
	}
}
