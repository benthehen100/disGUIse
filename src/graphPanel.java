

import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class graphPanel extends JPanel{

	private final int SIZE = 4;			//diameter of dots
	
	private String date[]=null;			//indicators,
	private int weight[] = null;        //set to null, will recieve values from accessor method.
	private int syspress[] = null;      
	private int diapress[] = null;
	private int bldsugar[] = null;
			
	public int datapoints = 0;				
	public final int borderdist = 50;			//The borderdist variable essentially anchors everything away
			                                    //from the edges of the panel
	public graphPanel()
	{
		setBackground(Color.white);
		
	}
	
	public void getAllIndicators(String[] dates, int[] w, int[] systolic, int[] diastolic, int[] glucose)		
    {
		date = dates;							//accessor method to get variables from Grapher class.
    	weight = w;
    	syspress = systolic;
    	diapress = diastolic;
    	bldsugar = glucose;

    }
	
	public void getDataPoints(int datalength) 
	{		
		datapoints = datalength;    			//this grabs the amount of datapoints from Grapher class.
	}
    
	
	public void paintComponent (Graphics page)
	{
		int width = getWidth()-100;      		//width of component (-100 is used to make room for a graph key)
        int height = getHeight()-75;    		 //height of component (-75  is used to make room for visit dates)
        
        super.paintComponent(page);
        Graphics2D Graph = (Graphics2D)page;
        Graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //adds cleaner lines and dots
		
		Graph.setColor (Color.black);
		Graph.drawLine(borderdist, height-borderdist, width-borderdist, height-borderdist );		//draws x-axis (x1,y1,x2,y2)
		Graph.drawLine(borderdist, borderdist, borderdist, height-borderdist);                  	//draws y-axis
		
		Font revertFont = Graph.getFont();					//reverts the font back to normal
		Font bold = new Font("Arial", Font.BOLD, 12);   	//changes font to bold
        Font small = new Font("Arial", Font.BOLD, 10);		//changes font to smaller font, used later.
        
        Graph.setFont(bold);
		Graph.drawString("Visit Dates", width/2, height-borderdist+95);	 	//Visit Dates label
		
		Graph.setFont(revertFont);
		int keybox1 = width-borderdist/2;									//coordinates of keybox position
		int keybox2 = height-borderdist*6;		
		
		Graph.drawRect(keybox1, keybox2, (borderdist*2)+5, borderdist*4);
		Graph.setFont(bold);
		Graph.drawString("Graph Key", keybox1+borderdist/2, keybox2-5);
		Graph.setFont(revertFont);
		Graph.drawString("Weight      ", keybox1+borderdist/2, keybox2+25);		//this code forms the Graph Key
		Graph.drawString("(lbs.)      ", keybox1+borderdist/2, keybox2+40);		
		Graph.drawString("Sys Pressure", keybox1+borderdist/2, keybox2+65);		
		Graph.drawString("(mmHg)      ", keybox1+borderdist/2, keybox2+80);
		Graph.drawString("Dia Pressure", keybox1+borderdist/2, keybox2+105);
		Graph.drawString("(mmHg)      ", keybox1+borderdist/2, keybox2+120);
		Graph.drawString("Bld Sugar   ", keybox1+borderdist/2, keybox2+145);
		Graph.drawString("(mg/dL)     ", keybox1+borderdist/2, keybox2+160);
		
		Graph.setPaint(Color.blue.darker());
		Graph.fillOval(keybox1+10, keybox2+16, SIZE*2, SIZE*2);		//creates color dots next to each string in the key
		Graph.setPaint(Color.green.darker());                   	//to colorcode the indicators on the graph
		Graph.fillOval(keybox1+10, keybox2+56, SIZE*2, SIZE*2);
		Graph.setPaint(Color.red.darker());
		Graph.fillOval(keybox1+10, keybox2+96, SIZE*2, SIZE*2);
		Graph.setPaint(Color.orange.darker());
		Graph.fillOval(keybox1+10, keybox2+136, SIZE*2, SIZE*2);
		
		Graph.setPaint(Color.black);
		
		/*
		 * The following of code creates tickmarks on the y-axis
		 * and correct numerical values on y-axis
		 */
		double space = (height-borderdist*2)/10.00;
		double[] inter = {space,space,space,space,space,space,space,space,space,space,space};
		double ticklabels = 0.00;
		ticklabels = ((double)getMax());
		ticklabels = (ticklabels/5);
		
		/*
		 * The for loop uses inter[] - which is the length of the y-axis split into tenths - to
		 * create 11 tick marks, including one at (0,0). The ticklabels take the max value of
		 * all the data, make it into a double, put that into fifths, and convert it back to an
		 * int to display increments at every other line.
		 */
		
		for(int i = 0; i<11; i++)
		{
			Graph.draw(new Line2D.Double(borderdist, height-borderdist-inter[i]*i, borderdist-5, height-borderdist-inter[i]*i));
			
			if (i == 0)
				Graph.drawString((""+0+""), (float)borderdist-30, (float)((height-borderdist-inter[i]*i)+5));
			else if(i==2)
				Graph.drawString((""+(int)ticklabels+""), (float)borderdist-30, (float)((height-borderdist-inter[i]*i)+5));
			else if(i==4)
				Graph.drawString((""+(int)(ticklabels*2)+""), (float)borderdist-30, (float)((height-borderdist-inter[i]*i)+5));		
			else if(i==6)
				Graph.drawString((""+(int)(ticklabels*3)+""), (float)borderdist-30, (float)((height-borderdist-inter[i]*i)+5));
			else if(i==8)
				Graph.drawString((""+(int)(ticklabels*4)+""), (float)borderdist-30, (float)((height-borderdist-inter[i]*i)+5));
			else if(i==10)
				Graph.drawString((""+(int)(ticklabels*5)+""), (float)borderdist-30, (float)((height-borderdist-inter[i]*i)+5));	
		}
		
		/*Graph.setFont(bold);
		int deg = -90; 								// rotate text to be vertical if I choose to include the verticle label
		AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(deg)); 
		Graph.setFont((Graph.getFont()).deriveFont(at)); 
		
		Graph.drawString("Values", borderdist-10, height/2);
		Graph.setFont(revertFont);*/
		
		int deg = -60; 								                                  //rotate text at angle for dates
		AffineTransform at2 = AffineTransform.getRotateInstance(Math.toRadians(deg));
		Graph.setFont((Graph.getFont()).deriveFont(at2)); 
		
		int deg2 = 0;
		AffineTransform atrevert = AffineTransform.getRotateInstance(Math.toRadians(deg2)); //rotates text back to normal
		 //swtiches font back
		
		/*
		 * The x and y scale variables are the intervals between each point on the graph.
		 * x intervals are calculated by width (length of the component) - borderdist*2 / the number of points - 1.
		 * This is found from tweaking values, and resizes the x intervals depending on the amount of
		 * visits put into the graph. The y scale is similar, but determines its intervals based of the highest
		 * value out of any of the indicators. All this is done to create a flexible graph that can morph within
		 * the specified pixel directions accomodated to any amount of data you're using.
		 */
		
		double xScale = (double)(width-2*borderdist)/(datapoints-1);  
		double yScale = (double)(height-2*borderdist)/getMax();
		
		/*
		 * This next for loop draws ticks marks along the x-axis.
		 */
		
		Graph.setPaint(Color.black);
		for(int i =0; i<weight.length; i++)
		{
			double xcoor1 = borderdist + i*xScale;                                  //set x coordinate first point
	        double ycoor1 = height - borderdist - yScale*weight[i]; 
	        Graph.draw(new Line2D.Double(xcoor1,height-borderdist,xcoor1,height-borderdist+5));
	        Graph.drawString(date[i], (float)xcoor1-25, height-borderdist+65);
	        
		}
		
		/*
		 * These next couple for loops graph the weight onto the graph. 
		 */
		
		Graph.setPaint(Color.blue.darker());	//sets color
		for(int i = 0; i<weight.length-1; i++)  //-1 because the amount of lines is one less than the datapoints
		{
			 double xcoor1 = borderdist + i*xScale;                             //set x coordinate first point
	         double ycoor1 = height - borderdist - yScale*weight[i];            //set y coordinate of first point
	         double xcoor2 = borderdist + (i+1)*xScale;                         //set x coor of second point
	         double ycoor2 = height - borderdist - yScale*weight[i+1];          //set y coor of second point
	         Graph.draw(new Line2D.Double(xcoor1,ycoor1,xcoor2,ycoor2));
	         //draw line on axis
		}
		

        Graph.setFont((Graph.getFont()).deriveFont(atrevert)); 
        Graph.setFont(small);
		for(int i = 0; i<weight.length; i++)	
		{
			double xcoor1 = borderdist + i*xScale;                                  //set x coordinate first point
	        double ycoor1 = height - borderdist - yScale*weight[i];
	        Graph.fill(new Ellipse2D.Double(xcoor1-2,ycoor1-2,4,4));
	        //draws dots
	        if (i>0)
	        {
	        	Graph.drawString(""+weight[i]+"", (float)xcoor1, (float)ycoor1);
	        }//this puts the values next to the dots
		}
		

		/*
		 * The following loops draw lines, dots, and values for systolic blood pressure, and functions
		 * fairly identical to the previous loops that graphed weight.
		 */
		
		Graph.setPaint(Color.green.darker());
		for(int i = 0; i<syspress.length-1; i++)  
		{
			 double xcoor1 = borderdist + i*xScale;                                 
	         double ycoor1 = height - borderdist - yScale*syspress[i];            
	         double xcoor2 = borderdist + (i+1)*xScale;                              
	         double ycoor2 = height - borderdist - yScale*syspress[i+1];          
	         Graph.draw(new Line2D.Double(xcoor1,ycoor1,xcoor2,ycoor2));
	         
		}
		
		
		for(int i = 0; i<syspress.length; i++)
		{
			double xcoor1 = borderdist + i*xScale;                                  
	        double ycoor1 = height - borderdist - yScale*syspress[i];
	        Graph.fill(new Ellipse2D.Double(xcoor1-2,ycoor1-2,4,4));
	        if (i>0)
	        	Graph.drawString(""+syspress[i]+"", (float)xcoor1, (float)ycoor1);
		}
		
		/*
		 * The following loops draw lines, dots, and values for the diastolic blood pressure.
		 */
		
		Graph.setPaint(Color.red.darker());
		for(int i = 0; i<diapress.length-1; i++)  
		{
			 double xcoor1 = borderdist + i*xScale;                                 
	         double ycoor1 = height - borderdist - yScale*diapress[i];            
	         double xcoor2 = borderdist + (i+1)*xScale;                              
	         double ycoor2 = height - borderdist - yScale*diapress[i+1];         
	         Graph.draw(new Line2D.Double(xcoor1,ycoor1,xcoor2,ycoor2));

		}
		
		for(int i = 0; i<diapress.length; i++)
		{
			double xcoor1 = borderdist + i*xScale;                                 
	        double ycoor1 = height - borderdist - yScale*diapress[i];
	        Graph.fill(new Ellipse2D.Double(xcoor1-2,ycoor1-2,4,4));
	        if (i>0)
	        	Graph.drawString(""+diapress[i]+"", (float)xcoor1, (float)ycoor1);
		}
		
		/*
		 * The following loops draw lines, dots, and values for the blood sugar array
		 */
		
		Graph.setPaint(Color.orange.darker());
		for(int i = 0; i<bldsugar.length-1; i++)  
		{
			 double xcoor1 = borderdist + i*xScale;                                  
	         double ycoor1 = height - borderdist - yScale*bldsugar[i];            
	         double xcoor2 = borderdist + (i+1)*xScale;                             
	         double ycoor2 = height - borderdist - yScale*bldsugar[i+1];          
	         Graph.draw(new Line2D.Double(xcoor1,ycoor1,xcoor2,ycoor2));
	         //draw line on axis
		}
		
		for(int i = 0; i<bldsugar.length; i++)
		{
			double xcoor1 = borderdist + i*xScale;                                  
	        double ycoor1 = height - borderdist - yScale*bldsugar[i];
	        Graph.fill(new Ellipse2D.Double(xcoor1-2,ycoor1-2,4,4));
	        if (i>0)
	        	Graph.drawString(""+bldsugar[i]+"", (float)xcoor1, (float)ycoor1);
		}
		
	}
	

	private int getMax() {                                         //determines max to see how high 
																   //to make graph
        int val_max = 0;
        for(int i = 0; i < weight.length; i++) {
            if(weight[i] > val_max)
                val_max = weight[i];
            if(syspress[i] > val_max)
            	val_max = syspress[i];
            if(diapress[i] > val_max)
            	val_max = diapress[i];
            if(bldsugar[i] > val_max)
            	val_max = bldsugar[i];
        }
        return val_max;
    }
	
	
}
