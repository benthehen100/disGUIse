import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//

public class disGUIse //main class
{
	public static void main(String[] args) //creates main frame and packs
	{
		disGuiseFrame mainFrame = new disGuiseFrame(); //instantiates frame
		mainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(disGUIse.class.getResource("/disGUIse_images/new_add_plus_red.png"))); //sets icon of frame
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		mainFrame.pack();
		mainFrame.show(); //shows frame
	}
}
//
class disGuiseFrame extends JFrame //class extends jframe
{
	static public String Username;
	
	final static String LOGINSCREEN="login";  //parameters
	final static String PATIENT="patientPanel";
	final static String NURSE="nursePanel"; //made static
	final static String DOCTOR="doctorPanel";
	static JPanel contentPane; //made static
	static public doctorPane doctor=new doctorPane(); //creates new object of type doctorPane
	static public nursePane nurse=new nursePane(); //creates new object of type nursePane *universal
	static public patientPane patient=new patientPane(); //creats new patientpane *universal

	public disGuiseFrame() //frame class
	{
		String userName;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit no close
		setTitle("disGUIse Well-Check Clinic"); //sets title for frame
		setBounds(100, 100, 600, 492); //sets bound of frame
		 
		disGUIseMenuBar menu1=new disGUIseMenuBar(); //instantiates object of menu class 
		setJMenuBar(menu1); //sets the bar to menu1
		
		contentPane=new JPanel(); //creates Jpanel
		setContentPane(contentPane); //sets contentPnae to contentpane
		contentPane.setLayout(new CardLayout(0, 0)); //creates cardLayout
		
		contentPane.setBackground(Color.WHITE); //sets background to white
		
		loginPanel login=new loginPanel(); //creates new object of type loginPanel
		
		
	    login.setAlignmentX(JComponent.CENTER_ALIGNMENT); //sets the alignment to the center
		Box box=new Box(BoxLayout.Y_AXIS); //creates new box layout
		box.add(Box.createVerticalGlue());
		box.add(login);
		box.add(Box.createVerticalGlue());
		
		contentPane.add(box,LOGINSCREEN); //adds the box to contentpane
		//contentPane.add(login,LOGINSCREEN);
		
	
		contentPane.add(nurse,NURSE); //add nurse to contentPane
		
		contentPane.add(doctor,DOCTOR); //adds it to Contentpane
		
		contentPane.add(patient,PATIENT);//adds it to contentPane
	} 
}

class disGUIseMenuBar extends JMenuBar  //class for JMenuBar
{  
	private JMenuItem mntmExitDisguise;
	private JMenuItem mntmAboutDisguise;
	private JMenu mnAbout;
	private JMenuItem mntmSignout;
	private JMenu mnFile;
	public disGUIseMenuBar()  
	{    
		setPreferredSize(new Dimension(200, 20));  

		mnFile = new JMenu("File");		//creates JMenu
		add(mnFile);
		
		mntmSignout = new JMenuItem("SignOut"); //creates menubutton and addes to File
		mnFile.add(mntmSignout);

		mntmExitDisguise = new JMenuItem("Exit disGUIse"); //creates new menubutton adds to file
		mnFile.add(mntmExitDisguise);
		
		mnAbout = new JMenu("About"); //creates to Jmenu
		add(mnAbout);
		
		mntmAboutDisguise = new JMenuItem("About disGUIse"); //creates Jmenu Button
		mnAbout.add(mntmAboutDisguise);
		
		menuEvents();//calls menuEventsmethod
	}  
	private void menuEvents()
	{
		mntmSignout.addActionListener(new ActionListener(){ //when user chooses file->signOut
			public void actionPerformed(ActionEvent e) {
			
				final CardLayout card=(CardLayout)disGuiseFrame.contentPane.getLayout();
				card.show(disGuiseFrame.contentPane, disGuiseFrame.LOGINSCREEN); //returns to logIn screen
		}}
		);
		mntmExitDisguise.addActionListener(new ActionListener(){ //when user chooses file->exit
			public void actionPerformed(ActionEvent e) { //closes program
				System.exit(0);
		}}
		);
	}
}  




