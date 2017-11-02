package pAbsFactory;

public abstract class Shape {

	protected String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
	
}
