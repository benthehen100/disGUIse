import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class passwordReset extends JPanel {
	private JTextField answerResetPassword;
	private JButton submitResetPassword;
	private JButton cancelResetPassword;
	private popUp p4;
	
	public passwordReset() {

		answerResetPassword = new JTextField();
		answerResetPassword.setColumns(10);

		JLabel promptResetPassword = new JLabel("To reset your password, answer the following security question");
		JLabel questionResetPassword = new JLabel("This is where the security question will be placed?");
		questionResetPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		submitResetPassword = new JButton("Submit");
		cancelResetPassword = new JButton("Cancel");
		

		JLabel resetPasswordBanner = new JLabel("disGUIse Password Reset");
		resetPasswordBanner.setForeground(new Color(0, 0, 139));
		resetPasswordBanner.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(answerResetPassword, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE))
						.addComponent(promptResetPassword)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(submitResetPassword)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(cancelResetPassword))
							.addComponent(questionResetPassword, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE))
						.addComponent(resetPasswordBanner, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(resetPasswordBanner, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(promptResetPassword)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(questionResetPassword)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(answerResetPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(submitResetPassword)
						.addComponent(cancelResetPassword))
					.addContainerGap(108, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		passwordResetEvents();
		
		p4=new popUp();
		p4.getContentPane().add(this); //adds it to popUpwindow
		p4.pack();
		p4.show();
	}
	private void passwordResetEvents()
	{
		submitResetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//submit button
			}
		});
		//
		cancelResetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//cancel button
				p4.dispose();
			}
		});
	}
}
