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


public class changePassword extends JPanel {
	private JTextField confirmPasswordInput;
	private JTextField oldPasswordInput;
	private JTextField newPasswordInput;
	private JButton changePasswordSubmit;
	private JButton changePasswordCancel;

	public changePassword() {
		
		confirmPasswordInput = new JTextField(10);
		oldPasswordInput = new JTextField(10);
		newPasswordInput = new JTextField(10);
		
		
		JLabel oldPasswordLbl = new JLabel("Old Password: ");
		JLabel newPasswordLbl = new JLabel("New Password: ");
		JLabel confirmPasswordLbl = new JLabel("Confirm Password: ");
		
		changePasswordSubmit = new JButton("Submit");
		changePasswordCancel = new JButton("Cancel");
		
		
		JLabel changePasswordReset = new JLabel("disGUIse Password Change");
		changePasswordReset.setForeground(new Color(0, 0, 139));
		changePasswordReset.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		
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
		setLayout(groupLayout);
		changePasswordEvents();
	}
	private void changePasswordEvents()
	{
		changePasswordSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//submit button
			}
		});
		//
		changePasswordCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//cancel button
			}
		});
	}
	
}
