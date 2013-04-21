import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class securityQuestion extends JPanel {
	private JTextField securityQuestionAnswer;
	private JTextField secuityQuestionInput;
	private JButton securityQuestionSubmit;
	private JButton securityQuestionCancel;
	private popUp p5;
	
	public securityQuestion() {
		
		securityQuestionAnswer = new JTextField(10);
		secuityQuestionInput = new JTextField(10);
		
		
		JLabel lblWhatWouldYou = new JLabel("What would you like your security Question to be? ");
		JLabel lblAnswer = new JLabel("Answer:");
		
		JLabel securityQuestionBanner = new JLabel("disGUIse Security Questions");
		securityQuestionBanner.setForeground(new Color(0, 0, 139));
		securityQuestionBanner.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		
		securityQuestionSubmit = new JButton("Submit");
		securityQuestionCancel = new JButton("Cancel");
		
	
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(83)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(secuityQuestionInput, Alignment.LEADING)
									.addComponent(securityQuestionAnswer, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(9)
								.addComponent(lblAnswer))
							.addComponent(lblWhatWouldYou))
						.addComponent(securityQuestionBanner, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(61, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(204, Short.MAX_VALUE)
					.addComponent(securityQuestionSubmit)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(securityQuestionCancel)
					.addGap(62))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(securityQuestionBanner, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblWhatWouldYou)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(secuityQuestionInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(securityQuestionAnswer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addComponent(lblAnswer)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(securityQuestionSubmit)
						.addComponent(securityQuestionCancel))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		securityQuestionEvents();
		
		p5=new popUp();
		p5.getContentPane().add(this); //calls secuity question Panel
		p5.pack();
		p5.show();
	}	
		private void securityQuestionEvents()
		{
			securityQuestionSubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					//submit button
				}
			});
			//
			securityQuestionCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					//cancel button
					p5.dispose();
				}
			});
		}

}
