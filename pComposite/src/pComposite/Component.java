package pComposite;

public abstract class Component {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Component(String name)
	{
		this.name = name;
	}
	
    public abstract void Add(Component c);
    public abstract void Remove(Component c);
    public abstract void Display();
	
}
