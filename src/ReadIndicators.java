import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
	
	
public class ReadIndicators {
	
	public static int[] convertIntegers(ArrayList<Integer> integers) // this shit converts ArrayList to an int[]
	{
	    int[] ret = new int[integers.size()];
	    Iterator<Integer> iterator = integers.iterator();
	    for (int i = 0; i < ret.length; i++)
	    {
	        ret[i] = iterator.next().intValue();
	    }
	    return ret;
	}
	
	public static void main(String[] args) {
 
		ArrayList<Integer> data = new ArrayList<Integer>();             //So the arrayList data gets all the integers in the file,
		ArrayList<Integer> bldpressure = new ArrayList<Integer>();      //and then splits them into different arrayLists for the
		ArrayList<Integer> bldsugar = new ArrayList<Integer>();         //indicators.
		ArrayList<Integer> weight = new ArrayList<Integer>();
		Scanner fileScanner = null;
		try {
				fileScanner = new Scanner(new File("graphdata"));
		    } 
		    catch (FileNotFoundException e) 
		    {
		    	e.printStackTrace();
		    }
		while (fileScanner.hasNextInt())
		{
		   data.add(fileScanner.nextInt());
		}
		
		/*for(int i=0; i<data.size(); i++)           //test to see if arrayList gets values
		{
        System.out.println(data.get(i));
		}*/
		
		for(int i=0; i<data.size(); i=i+3)           //takes data, seperates it into three different
		{                                            //arrayLists for the 3 indicators.
			bldpressure.add(data.get(i));
			bldsugar.add(data.get(i+1));
			weight.add(data.get(i+2));
		}
		
		for (int i =0; i<bldpressure.size(); i++)   //this outputs the three arrayLists, shows that
		{                                           //they are getting correct values.
			System.out.println(bldpressure.get(i));
		}
		
		System.out.println();
		
		for (int i =0; i<bldsugar.size(); i++)
		{
			System.out.println(bldsugar.get(i));
		}
		
		System.out.println();
		
		for (int i =0; i<weight.size(); i++)
		{
			System.out.println(weight.get(i));
		}
		
		System.out.println(weight);
		
        JFrame Frame = new JFrame();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphED graph1 = new GraphED();
        graph1.updateBloodPressure(convertIntegers(weight)); //converts weight to an int[], which can then be used updatebloodPressure graph1.
        Frame.getContentPane().add(graph1); //plots graph1
        Frame.setSize(500,500); 
        Frame.setVisible(true);
        
		}
	}

