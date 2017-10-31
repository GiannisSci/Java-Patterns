package pComposite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	List<Component> childs;
	
	public Composite(String name) {
		super(name);
		childs = new ArrayList<Component>();
	}

	@Override
	public void Add(Component c) {
		this.childs.add(c);
	}

	@Override
	public void Remove(Component c) {
		this.childs.remove(c);
	}

	@Override
	public void Display() {
		System.out.println(this.getName());
		for(Component c : this.childs)
		{
			c.Display();
		}
	}

	public void Display(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
