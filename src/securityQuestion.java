import javax.swing.JOptionPane;
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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class securityQuestion extends JPanel {
	private JTextField securityQuestionAnswer;
	private JTextField securityQuestionInput;
	private JButton securityQuestionSubmit;
	private JButton securityQuestionCancel;
	private popUp p5;
	
	public securityQuestion() {
		
		securityQuestionAnswer = new JTextField(10);
		securityQuestionInput = new JTextField(10);
		
		
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
									.addComponent(securityQuestionInput, Alignment.LEADING)
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
							.addComponent(securityQuestionInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
					String securityQuestion, securityAnswer;
					securityQuestion = securityQuestionInput.getText();
					securityAnswer = securityQuestionAnswer.getText();
					
					linkList people = new linkList();
					Link temp;
					FileReader fr;
					if (securityQuestion.length() != 0 && securityAnswer.length() != 0)
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
						if(disGuiseFrame.Username.equalsIgnoreCase(temp.username))
						{
							System.out.println("User Match!");
							temp.recovery = securityQuestion;
							temp.answer = securityAnswer;
							JOptionPane.showMessageDialog(null, "Security Question and Answer changed", "Security Change Status", JOptionPane.OK_OPTION);
							p5.dispose();
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
						JOptionPane.showMessageDialog(null, "Please enter all fields.", "Error Message", JOptionPane.ERROR_MESSAGE);
					}
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
