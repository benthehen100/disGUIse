

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JFrame;

public class grapher {

		
		public static int[] convertIntegers(ArrayList<Integer> integers) 	//this method converts arrayLists into arrays
		{
		    int[] ret = new int[integers.size()];
		    Iterator<Integer> iterator = integers.iterator();
		    for (int i = 0; i < ret.length; i++)
		    {
		        ret[i] = iterator.next().intValue();
		    }
		    return ret;
		}
		
		public static String[] convertStrings(ArrayList<String> strings)   //this method converts StringArraylists into array
		{
			String[] ret2 = new String[strings.size()];
			Iterator<String> iterator2 = strings.iterator();
			for (int i =0; i< ret2.length; i++)
			{
				ret2[i] = iterator2.next().toString();
			}
			return ret2;
 		}
		
		public static void main(String[] args) {
			
			ArrayList<String> data = new ArrayList<String>(); 				//These are arraylists for all the indicators.
			ArrayList<String> date = new ArrayList<String>();               //arraylists or vectors have to be used 
			ArrayList<Integer> weight = new ArrayList<Integer>();           //because of changing values.        
			ArrayList<Integer> syspressure = new ArrayList<Integer>();
			ArrayList<Integer> diapressure = new ArrayList<Integer>();
			ArrayList<Integer> bldsugar = new ArrayList<Integer>();
			
			String filename = "dasindicators";
			Scanner fileScanner = null;
			try {
					fileScanner = new Scanner(new File(filename));
			    } 
			    catch (FileNotFoundException e) 
			    {
			    	e.printStackTrace();
			    }
			
			String blank = null;           
			while (fileScanner.hasNext())  			//this code scans and reads the file. Blank is any line.
	     	{                                       //If the blank has a string length > 0, then it is 
				blank = fileScanner.nextLine();     //added to a big string arrayList of data.
				
				if (blank.length() > 0)
	            data.add(blank);
			}
			
			for(int i =0; i<data.size(); i=i+5)               //this seperates all the data into their
			{                                                 //respective int and string arraylists.
				date.add(data.get(i));     
				weight.add((int)(Double.parseDouble(data.get(i+1))));
				syspressure.add((int)(Double.parseDouble(data.get(i+2))));
				diapressure.add((int)(Double.parseDouble(data.get(i+3))));
				bldsugar.add((int)(Double.parseDouble(data.get(i+3))));
			}
			
			int datalength = date.size();					//creates an integer carrying number of data points
		
		JFrame frame1 = new JFrame("	Graph");            //calls the graph.
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graphPanel graph = new graphPanel();
		graph.getDataPoints(datalength);
        graph.getAllIndicators(convertStrings(date), convertIntegers(weight), convertIntegers(syspressure), convertIntegers(diapressure), convertIntegers(bldsugar));
		frame1.getContentPane().add(graph);
		frame1.setSize(500,500); 
		frame1.setVisible(true);
	}

}
