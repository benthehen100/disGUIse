import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class changePassword extends JPanel {// changepassword Panel
	private JTextField confirmPasswordInput;
	private JTextField oldPasswordInput;
	private JTextField newPasswordInput;
	private JButton changePasswordSubmit;
	private JButton changePasswordCancel;
	private popUp p3;

	public changePassword() {
		
		confirmPasswordInput = new JTextField(10); //creates textfields and sets size to 10
		oldPasswordInput = new JTextField(10); //textfields are for inputs
		newPasswordInput = new JTextField(10);
		
		
		JLabel oldPasswordLbl = new JLabel("Old Password: "); //creates labels
		JLabel newPasswordLbl = new JLabel("New Password: ");
		JLabel confirmPasswordLbl = new JLabel("Confirm Password: ");
		
		changePasswordSubmit = new JButton("Submit"); //submit button
		changePasswordCancel = new JButton("Cancel"); //cancel button
		
		
		JLabel changePasswordReset = new JLabel("disGUIse Password Change"); //password change label
		changePasswordReset.setForeground(new Color(0, 0, 139));
		changePasswordReset.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		
		//grouplayout for changepassword class
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(changePasswordReset))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(oldPasswordLbl)
								.addComponent(newPasswordLbl)
								.addComponent(confirmPasswordLbl))
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(changePasswordSubmit)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(changePasswordCancel))
								.addComponent(oldPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(newPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(confirmPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(10, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(changePasswordReset)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(oldPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(oldPasswordLbl))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(newPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(newPasswordLbl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(confirmPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(confirmPasswordLbl))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(changePasswordSubmit)
						.addComponent(changePasswordCancel))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		setLayout(groupLayout); //sets the layout for this class to grouplayout
		
		changePasswordEvents(); //action events
		
		p3=new popUp();
		p3.getContentPane().add(this); //addes it to popup window
		p3.pack();
		p3.show();
	}
	private void changePasswordEvents()
	{
		changePasswordSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String oldPassword, newPassword, newPasswordConfirm;
				oldPassword = oldPasswordInput.getText();
				newPassword = newPasswordInput.getText();
				newPasswordConfirm = confirmPasswordInput.getText();
				
				linkList people = new linkList();
				Link temp;
				FileReader fr;
				if (newPassword.equals(newPasswordConfirm))
				{
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
				while (temp != null)
				{
					System.out.println(temp.password);
					if(disGuiseFrame.Username.equalsIgnoreCase(temp.username))
					{
						if(oldPassword.equals(temp.password))
						{
							System.out.println("User Match!");
							temp.password = newPassword;
							JOptionPane.showMessageDialog(null, "Password Changed", "Password Change Status", JOptionPane.OK_OPTION);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Old password not correct.", "Error Message", JOptionPane.ERROR_MESSAGE);
						}
					}
					temp = temp.next;
				}
				temp = people.head;
				try {
					
				FileWriter wr = new FileWriter("LoginCred.txt");
					while (temp != null)
					{
						wr.write(temp.username + "\n");
						wr.write(temp.password + "\n");
						wr.write(temp.type + "\n");
						wr.write(temp.id + "\n");
						wr.write(temp.recovery + "\n");
						wr.write(temp.answer + "\n");
						temp = temp.next;
					}
					wr.close();
				//submit button effects
				}catch (Throwable e1) {
					e1.printStackTrace();
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "New Password and Password Confirm do not match.", "Error Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		//
		changePasswordCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//cancel button effects
				p3.dispose();
			}
		});
	}
	
}
