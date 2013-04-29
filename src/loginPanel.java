import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class loginPanel extends JPanel {
	//field variables
	private JTextField uNameInput=new JTextField(10);
	private JPasswordField passInput = new JPasswordField(10);
	private JButton submitBL=new JButton("Log In");
	private JButton forgotBL=new JButton("Forgot Password?");
	private JLabel passLbl=new JLabel("Password:");
	private JLabel usernameLbl=new JLabel("Username:");
	public String user;
	
	public String returnUser() //returns the user who is loggin in
	{
		return user; 
	}
	
	public loginPanel()
	{
		setBackground(Color.white); //sets the background to white
		
	   //sets dimensions
	   Dimension expectedDimension = new Dimension(250, 150);
       setPreferredSize(expectedDimension);
       setMaximumSize(expectedDimension);
       setMinimumSize(expectedDimension);
       
		GroupLayout gl_loginPanel = new GroupLayout(this); //creates new grouplayout
		//sets the postions fo the components using WindowBuilder
		gl_loginPanel.setHorizontalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(31)
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addComponent(submitBL)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(forgotBL))
						.addGroup(gl_loginPanel.createSequentialGroup()
							.addGap(15)
							.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(usernameLbl)
								.addComponent(passLbl))
							.addGap(18)
							.addGroup(gl_loginPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(uNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(passInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		gl_loginPanel.setVerticalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(uNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(usernameLbl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(passInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(passLbl))
					.addGap(18)
					.addGroup(gl_loginPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(submitBL)
						.addComponent(forgotBL))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		setLayout(gl_loginPanel); //sets the layout of this panel to the above
		logInEvents();//calls events method
	}
	
	//method for the button listeners of this class
	private void logInEvents()
	{
		final CardLayout card=(CardLayout)disGuiseFrame.contentPane.getLayout(); //gets the layout of the disguiseFrame
		submitBL.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int cleared = 0;
				String username,password;
				System.out.println("Button Pressed");
				username = uNameInput.getText();
				password = passInput.getText();
				
				linkList people = new linkList();
				Link temp;
				FileReader fr;
				try {
					fr = new FileReader("LoginCred.txt");
				
				BufferedReader br = new BufferedReader(fr);
				String a,b,c,d,e2,f; //e is already used by action listener, so I used e2
				while((a = br.readLine()) != null)
				{
					b = br.readLine();
					c = br.readLine();
					d = br.readLine();
					e2 = br.readLine();
					f = br.readLine();
					
					System.out.println("a = " + a);
					System.out.println("b = " + b);
					System.out.println("c = " + c);
					System.out.println("d = " + d);
					System.out.println("e2 = " + e2);
					System.out.println("f = " + f);
					
					people.insert(a, b, c, d , e2, f);
				}
				//people.printList();
				fr.close();
				
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String idFile;//used for storing patient's file
				temp = people.head;
				while(temp != null)
				{
					System.out.println(temp.username);
					System.out.println(username);
					if(username.equalsIgnoreCase(temp.username))
					{
						if(password.equals(temp.password)) //if the password is correct
						{
							disGuiseFrame.setUsername(temp.username); //sets the username to the user that is logged in
							System.out.println("User match!");
							user = temp.username;
							String name= user + ".txt"; // generate text file name based on username;
							System.out.println(name);
							if(temp.type.equalsIgnoreCase("nurse")) //if its a nurse loads nurse screen
							{
								card.show(disGuiseFrame.contentPane, disGuiseFrame.NURSE);
								disGuiseFrame.nurse.refreshPane(name); // refreshes panel based on inputted text file name;
								cleared = 1;
							}
							else if(temp.type.equalsIgnoreCase("doctor")) //if its a doctor loads doctor screen
							{
								card.show(disGuiseFrame.contentPane, disGuiseFrame.DOCTOR);
								disGuiseFrame.doctor.refreshPanel(name);
								cleared = 1;
							}
							else if(temp.type.equalsIgnoreCase("patient")) //if its a patient loads patient screen
							{
								idFile = temp.id + ".txt";
								disGuiseFrame.patient.refreshPanel(idFile);
								disGuiseFrame.patient.refreshIndicatorTable(temp.id);
								disGuiseFrame.patient.refreshPrescriptionTable(temp.id);
								card.show(disGuiseFrame.contentPane, disGuiseFrame.PATIENT);
								cleared = 1;
							}
						}
						//
						else
						{
							//password and username do not match
							//System.out.println("Incorrect Username/Password"); 
							//JOptionPane.showMessageDialog(null, "Invalid username or password. Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
							temp = null;
						}
					}
					if(temp != null)
						temp = temp.next;

				}
				
				if(cleared == 0)
				{
				System.out.println("Incorrect Username/Password"); 
				JOptionPane.showMessageDialog(null, "Invalid username or password. Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		forgotBL.addActionListener(new ActionListener() { //if the forgot button is clicked
			public void actionPerformed(ActionEvent arg0) 
			{
				// Opens new box when 'Forgot Password?' is selected
				String username = uNameInput.getText(); //gets the username enterd
				linkList people = new linkList();
				Link temp;
				FileReader fr;
				
				//searches for mathed username from logincred file
				try {
				fr = new FileReader("LoginCred.txt");	
				BufferedReader br = new BufferedReader(fr);
				String a, b, c, d, e2, f;
				while((a = br.readLine()) != null)
				{
					b = br.readLine();
					c = br.readLine();
					d = br.readLine();
					e2 = br.readLine();
					f = br.readLine();
					
					System.out.println("a = " + a);
					System.out.println("b = " + b);
					System.out.println("c = " + c);
					System.out.println("d = " + d);
					System.out.println("e2 = " + e2);
					System.out.println("f = " + f);
					
					people.insert(a, b, c, d , e2, f);
				}
				fr.close();
				}catch (Throwable e1) {
					e1.printStackTrace();
				}
				temp = people.head;
				while (temp != null && !(username.equalsIgnoreCase(temp.username)))
				{
						temp = temp.next; //if it doestn equal goes to next line
				}
				if (temp == null)
				{
					//prompts user to enter username
					JOptionPane.showMessageDialog(null, "Please enter a real user.", "Error Message", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					//loadsthe password resetpage
					passwordReset pr = new passwordReset(username);
					
				}
			}
		});
		
	}
	

}
