import java.awt.*;

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
		//mainFrame.show();
	}
}
class disGuiseFrame extends JFrame
{
	final static String LOGINSCREEN="login";
	final static String PATIENT="patientPanel";
	final static String NURSE="nursePanel"; //made static
	final static String DOCTOR="doctorPanel";
	static JPanel contentPane; //made static
	
	public disGuiseFrame() 
	{
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
		contentPane.add(login,LOGINSCREEN);
		JPanel panel3=new JPanel();
	
		nursePane nurse=new nursePane();
		contentPane.add(nurse,NURSE);
		
		doctorPane doctor=new doctorPane();
		contentPane.add(doctor,DOCTOR);
		
		patientPane patient=new patientPane();
		contentPane.add(patient,PATIENT);
		
		
	}
}

class disGUIseMenuBar extends JMenuBar  
{  
	public disGUIseMenuBar()  
	{  
		setBackground(Color.cyan);  
		setPreferredSize(new Dimension(200, 20));  

		JMenu mnFile = new JMenu("File");		
		add(mnFile);
		
		JMenuItem mntmSignout = new JMenuItem("SignOut");
		mnFile.add(mntmSignout);
		
		JMenuItem mntmExitDisguise = new JMenuItem("Exit disGUIse");
		mnFile.add(mntmExitDisguise);
		JMenu mnAbout = new JMenu("About");
		add(mnAbout);
		
		JMenuItem mntmAboutDisguise = new JMenuItem("About disGUIse");
		mnAbout.add(mntmAboutDisguise);
	}  
}  



