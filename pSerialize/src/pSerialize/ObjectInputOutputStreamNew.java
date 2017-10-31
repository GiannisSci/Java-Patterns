package pSerialize;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;


public class ObjectInputOutputStreamNew {

	 public static void Go() throws IOException, ClassNotFoundException {
		 
		 
		 // --------------- Write
	      
		 // create ObjectOutputStream - to write
	     ObjectOutputStream out = new ObjectOutputStream
	    		 (new BufferedOutputStream
	    		 ( new FileOutputStream("C://Users//ioannisg/lakers.txt")));

	     // Preparing a Team object to write into the file
	     Team lakers = new Team("Lakers", "USA Basketball Team");
	     
	     // Writing Team Object into the file
	     out.writeObject(lakers);
	      
	     // CLose the file (buffer)
	     out.close();


	     // --------------- Read
	     
		 // create ObjectInputtream - to read
	     ObjectInputStream in = new ObjectInputStream
	    		 (new BufferedInputStream
	    				 ( new FileInputStream
	    						 ("C://Users//ioannisg/lakers.txt")));

	     // Reading Team object from file
	     Team lakers_Read = (Team)in.readObject();
	      
	     // Let's print the Team
	     System.out.println(lakers_Read);
	     
	     // CLose the file (buffer)
	     in.close();
	     
	     
	 }
	 
}
