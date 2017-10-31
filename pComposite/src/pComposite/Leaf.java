package pComposite;


public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void Add(Component c) {
		//throw new Arg
		//throw new ApplicationException("Add cannot be called on a leaf!");		
	}

	@Override
	public void Remove(Component c) {

	}

	@Override
	public void Display() {
		System.out.println(this.getName());

	}

}
