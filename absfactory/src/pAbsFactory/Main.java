package pAbsFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		ShapeClient d2Shapes = new 
				ShapeClient( new Factory2D() );
		
		ShapeClient d3Shapes = new 
				ShapeClient( new Factory3D() );
	}

}
