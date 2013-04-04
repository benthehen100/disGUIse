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
	private JTextField uNameInput=new JTextField(10);
	private JPasswordField passInput = new JPasswordField(10);
	private JButton submitBL=new JButton("Log In");
	private JButton forgotBL=new JButton("Forgot Password?");
	private JLabel passLbl=new JLabel("Password:");
	private JLabel usernameLbl=new JLabel("Username:");
	public String user;
	
	public String returnUser()
	{
		return user; 
	}
	
	public loginPanel()
	{
		setBackground(Color.white);
		
		Dimension expectedDimension = new Dimension(250, 150);

        setPreferredSize(expectedDimension);
        setMaximumSize(expectedDimension);
        setMinimumSize(expectedDimension);
       
		
		GroupLayout gl_loginPanel = new GroupLayout(this);
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
		setLayout(gl_loginPanel);
			logInEvents();
			

	}
	

	private void logInEvents()
	{
		final CardLayout card=(CardLayout)disGuiseFrame.contentPane.getLayout();
		submitBL.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
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
				String a,b,c;
				while((a = br.readLine()) != null)
				{
					b = br.readLine();
					c = br.readLine();
					System.out.println("a = " + a);
					System.out.println("b = " + b);
					System.out.println("c = " + c);
					people.insert(a, b, c);
				}
				//people.printList();
				fr.close();
				
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				temp = people.head;
				while(temp != null)
				{
					System.out.println(temp.username);
					System.out.println(username);
					if(username.equalsIgnoreCase(temp.username))
					{
						if(password.equals(temp.password))
						{
							System.out.println("User match!");
							user = temp.username;
							if(temp.type.equalsIgnoreCase("nurse"))
								card.show(disGuiseFrame.contentPane, disGuiseFrame.NURSE);
							else if(temp.type.equalsIgnoreCase("doctor"))
								card.show(disGuiseFrame.contentPane, disGuiseFrame.DOCTOR);
							else if(temp.type.equalsIgnoreCase("patient"))
								card.show(disGuiseFrame.contentPane, disGuiseFrame.PATIENT);
						}
						else
						{
							System.out.println("Incorrect Username/Password");
							
							JOptionPane.showMessageDialog(null, "Invalid username or password. Try again.", "Error Message", JOptionPane.ERROR_MESSAGE);
						}
					}
					temp = temp.next;

				}
			}
		});
		
		forgotBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				// Opens new box when 'Forgot Password?' is selected
				popUp p1=new popUp();
				changePassword cp = new changePassword();
				p1.getContentPane().add(cp);
				p1.pack();
				p1.show();
			}
		});
		
	}
	

}
