import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
 


public class GraphPrototype{
	public static void main(String[] args) {
		
        JFrame Frame = new JFrame();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.getContentPane().add(new GraphED()); 
        Frame.setSize(500,500); 
        Frame.setVisible(true);
    }
}

 class GraphED extends JPanel {
    int[] bldpressure = { 0, 99, 80, 21, 120, 32};                               //this is the data run through the graph
    int scalefact = 20;                                                          //zoom of graph/scaling factor
 
    protected void paintComponent(Graphics g) {
    	int width = getWidth();      //width of component
        int height = getHeight();    //height of component
        
        super.paintComponent(g);
        Graphics2D Graph = (Graphics2D)g;                                                               //creates paint component
        Graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);     //makes lines cleaner
        Graph.draw(new Line2D.Double(scalefact, scalefact, scalefact, height-scalefact));               //y-axis black line

        Graph.draw(new Line2D.Double(scalefact, height-scalefact, width-scalefact, height-scalefact)); //x-axis black line
   
        
        double xScale = (double)(width - 2*scalefact)/(bldpressure.length-1);      //set zoom
        double yScale = (double)(height - 2*scalefact)/getMax();
        Graph.setPaint(Color.blue.darker());                                      //color of line
        for(int i = 0; i < bldpressure.length-1; i++) {
            double xcoor1 = scalefact + i*xScale;                                  //set x coordinate first point
            double ycoor1 = height - scalefact - yScale*bldpressure[i];            //set y coordinate of first point
            double xcoor2 = scalefact + (i+1)*xScale;                              //set x coor of second point
            double ycoor2 = height - scalefact - yScale*bldpressure[i+1];          //set y coor of second point
            Graph.draw(new Line2D.Double(xcoor1, ycoor1, xcoor2, ycoor2));         //draw a line between those points
        }
        
        Graph.setPaint(Color.blue);                                       //color of data points
        for(int i = 0; i < bldpressure.length; i++) {
            double x = scalefact + i*xScale;                            //where x is based on the line
            double y = height - scalefact - yScale*bldpressure[i];     //where y is based on the line
            Graph.fill(new Ellipse2D.Double(x-2, y-2, 4, 4));         //draw circle/eclipse at points on line
        }
    }
 
    
    public void updateBloodPressure(int[] a)
    {
    	bldpressure = a;
    }
    
    
     private int getMax() {                                         //determines max to see how high to make graph
        int val_max = 0;
        for(int i = 0; i < bldpressure.length; i++) {
            if(bldpressure[i] > val_max)
                val_max = bldpressure[i];
        }
        return val_max;
    }
     
 
}