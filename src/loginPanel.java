import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class loginPanel extends JPanel {
	private JTextField uNameInput=new JTextField(10);
	private JTextField passInput=new JTextField(10);
	private JButton submitBL=new JButton("SignIn");
	private JButton forgotBL=new JButton("Forgot Password?");
	private JLabel passLbl=new JLabel("Password:");
	private JLabel usernameLbl=new JLabel("Username:");
	
	public loginPanel()
	{
		setBackground(Color.RED);
		setBounds(0, 0, 482, 343);
		setVisible(true);
		
		GroupLayout gl_loginPanel = new GroupLayout(this);
		gl_loginPanel.setHorizontalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(147)
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
					.addContainerGap(147, Short.MAX_VALUE))
		);
		gl_loginPanel.setVerticalGroup(
			gl_loginPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_loginPanel.createSequentialGroup()
					.addGap(128)
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
					.addContainerGap(128, Short.MAX_VALUE))
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
				System.out.println("Button Pressed");
				if(uNameInput.getText().equals("nurse"))
				{
					card.show(disGuiseFrame.contentPane, disGuiseFrame.NURSE);
				}
				else if(uNameInput.getText().equals("doctor"))
				{
					card.show(disGuiseFrame.contentPane, disGuiseFrame.DOCTOR);
				}
				else if(uNameInput.getText().equals("patient"))
				{
					card.show(disGuiseFrame.contentPane, disGuiseFrame.PATIENT);
				}
			}
		});
	}
}

