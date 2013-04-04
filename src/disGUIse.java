import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//


public class disGUIse
{
	public static void main(String[] args) 
	{
		disGuiseFrame mainFrame = new disGuiseFrame();
		mainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(disGUIse.class.getResource("/disGUIse_images/new_add_plus_red.png")));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		mainFrame.pack();
		mainFrame.show();
	}
}
class disGuiseFrame extends JFrame
{
	final static String LOGINSCREEN="login";
	final static String PATIENT="patientPanel";
	final static String NURSE="nursePanel"; //made static
	final static String DOCTOR="doctorPanel";
	static JPanel contentPane; //made static
	String username;
	public disGuiseFrame() 
	{
		String userName;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("disGUIse Well-Check Clinic");
		setBounds(100, 100, 600, 492);
		setVisible(true);
		
		disGUIseMenuBar menu1=new disGUIseMenuBar();
		setJMenuBar(menu1);
		
		contentPane=new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		
		loginPanel login=new loginPanel();
		
		login.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		Box box=new Box(BoxLayout.Y_AXIS);
		box.add(Box.createVerticalGlue());
		box.add(login);
		box.add(Box.createVerticalGlue());
		
		/*JPanel panel3=new JPanel();
		Dimension expectedDimension = new Dimension(250, 150);

        panel3.setPreferredSize(expectedDimension);
        panel3.setMaximumSize(expectedDimension);
        panel3.setMinimumSize(expectedDimension);
		panel3.add(box);*/
		
		contentPane.add(box,LOGINSCREEN);
		//contentPane.add(panel3,LOGINSCREEN);
		
	
		nursePane nurse=new nursePane();
		contentPane.add(nurse,NURSE);
		
		doctorPane doctor=new doctorPane();
		contentPane.add(doctor,DOCTOR);
		
		patientPane patient=new patientPane();
		contentPane.add(patient,PATIENT);
		
		
	}}

class disGUIseMenuBar extends JMenuBar  
{  
	
	private JMenuItem mntmExitDisguise;
	private JMenuItem mntmAboutDisguise;
	private JMenu mnAbout;
	private JMenuItem mntmSignout;
	private JMenu mnFile;
	public disGUIseMenuBar()  
	{  
		setBackground(Color.LIGHT_GRAY);  
		setPreferredSize(new Dimension(200, 20));  

		mnFile = new JMenu("File");		
		add(mnFile);
		
		mntmSignout = new JMenuItem("SignOut");
		mnFile.add(mntmSignout);
		
		

		mntmExitDisguise = new JMenuItem("Exit disGUIse");
		mnFile.add(mntmExitDisguise);
		
		
		mnAbout = new JMenu("About");
		add(mnAbout);
		
		mntmAboutDisguise = new JMenuItem("About disGUIse");
		mnAbout.add(mntmAboutDisguise);
		menuEvents();
	}  
	private void menuEvents()
	{
		/*mntmSignout.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				disGUIse again = new disGUIse();
		}}
		);*/
		mntmExitDisguise.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
		}}
		);
	}
}  




