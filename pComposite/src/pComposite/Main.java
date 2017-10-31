package pComposite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a tree structure
	      Composite root = new Composite("ROOT");
	      root.Add(new Leaf("Star"));
	      root.Add(new Leaf("Circle"));
	 
	      Composite comp = new Composite("COMPOSITE 1");
	      comp.Add(new Leaf("Rectangle"));
	      comp.Add(new Leaf("Cube"));
	 
	      root.Add(comp);
	      root.Add(new Leaf("Triangle"));
	 
	      // Add and remove a leaf
	      Leaf leaf = new Leaf("Leaf D");
	      root.Add(leaf);
	      root.Remove(leaf);
	 
	      // Recursively display tree
	      root.Display();

	}

}
