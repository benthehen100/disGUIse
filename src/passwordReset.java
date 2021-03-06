import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;



public class passwordReset extends JPanel { //new Jpanel calss
	//field varaibles
	private JTextField answerResetPassword;
	private JButton submitResetPassword;
	private JButton cancelResetPassword;
	private popUp p4;
	public static String username;
	String question;


	public static void setUsername(String s) //sets the username
	{
		username = s;
	}
	public static String getUsername() //gets the username
	{
		return username;
	}
	public passwordReset(String userName) { //main method

		//creates new textfield
		answerResetPassword = new JTextField();
		answerResetPassword.setColumns(10);
		
		setUsername(userName);
		linkList people = new linkList();
		Link temp;
		FileReader fr;

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
		while (temp != null && !(userName.equalsIgnoreCase(temp.username)))
		{
				temp = temp.next;
		}
		if (temp == null)
			System.out.println("User Not Found.");
		else
			question = temp.recovery;
		
		//creates labes
		JLabel promptResetPassword = new JLabel("To reset your password, answer the following security question");
		JLabel questionResetPassword = new JLabel(question);
		questionResetPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		//creates buttons
		submitResetPassword = new JButton("Submit");
		cancelResetPassword = new JButton("Cancel");

		//creates Password Reset Banner Lable
		JLabel resetPasswordBanner = new JLabel("disGUIse Password Reset");
		resetPasswordBanner.setForeground(new Color(0, 0, 139));
		resetPasswordBanner.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		
		//creates new grouplayout for this panel
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
		setLayout(groupLayout); //sets this layout to the group layout above
		passwordResetEvents(); //calls passwords events method

		p4=new popUp(); //creates new popUP
		p4.getContentPane().add(this); //adds it to popUpwindow
		p4.pack();//packs frame
		p4.show(); //shows frame
	}
	private void passwordResetEvents()
	{
		submitResetPassword.addActionListener(new ActionListener() { //code when submit is pressed
			public void actionPerformed(ActionEvent e) 
			{
				linkList people = new linkList();
				Link temp;
				FileReader fr;
				String answer = answerResetPassword.getText(), username = getUsername();
				
				//seraches through loginCred file to find correct users password
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
				String tempUsername = temp.username;
				while (!tempUsername.equalsIgnoreCase(username))
				{
					temp = temp.next;
					tempUsername = temp.username;
				}
				if (answer.equalsIgnoreCase(temp.answer))	{ //displays the password if correct info is entered
					System.out.println("Answer Match");
					JOptionPane.showMessageDialog(null, temp.password, "Your Password", JOptionPane.ERROR_MESSAGE);
					p4.dispose(); //closes window
				}
				else	{
					//if wrong answer is entered
					JOptionPane.showMessageDialog(null, "Wrong answer to Security Question, Sorry.", "Error Message", JOptionPane.ERROR_MESSAGE);
				}


			}
		});
		//
		cancelResetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//cancel button
				p4.dispose(); //closes window
			}
		});
	}
}