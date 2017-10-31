package pSerialize;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {

	static final String dataFile = "C://Users//ioannisg/lakers.txt";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
	    "Java T-shirt",
	    "Java Mug",
	    "Duke Juggling Dolls",
	    "Java Pin",
	    "Java Key Chain"
	};
	
	static double price;
	static int unit;
	static String desc;
	static double total = 0.0;
	
	public static void Go() throws IOException
	{
		DataOutputStream out = new DataOutputStream( new BufferedOutputStream(
	              new FileOutputStream(dataFile)));
		
		for (int i = 0; i < prices.length; i ++) {
		    out.writeDouble(prices[i]);
		    out.writeInt(units[i]);
		    out.writeUTF(descs[i]);
		}
		
		out.flush();
			
		DataInputStream in = new DataInputStream(new BufferedInputStream(
				new FileInputStream(dataFile)));
			
		try 
		{
		    while (in.available() > 0) 
		    {
		        price = in.readDouble();
		        unit = in.readInt();
		        desc = in.readUTF();
		        System.out.format("You ordered %d" + " units of %s at $%.2f%n",
		            unit, desc, price);
		        total += unit * price;
		    }
		} 
		catch (EOFException e) 
		{
			e.printStackTrace();
		}
		
		in.close();
		
		
	}
}
