import javax.swing.*;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class addNursePanel extends JPanel { //creates class that extends JPanel
	//all field variables
	private popUp p;
	private JTextField addNursePanelNameInput;
	private JTextField addNursePanelUsernameInput;
	private JTextField addNursePanelDoctorInput;
	private JTextField addNursePanelDoctorUserNameInput;
	private JTextField addNursePanelEmailInput;
	private JTextField addNursePanelPhoneInput;
	private JTextField addNursePanelStreetInput;
	private JTextField addNursePanelCityInput;
	private JTextField addNursePanelStateInput;
	private JTextField addNursePanelZipInput;
	private JButton addNursePanelSubmit;
	private JButton addNursePanelCancel;
	private JLabel lblPassword;
	private JTextField addNursePanelPasswordInput;
	private JLabel lblNurseId;
	private JTextField addNursePanelIDInput;

	public addNursePanel() {
		
		JLabel lblAddNurse = new JLabel("Add Nurse");
		lblAddNurse.setForeground(new Color(0, 0, 139));
		lblAddNurse.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21)); //changes font type and size
		
		JLabel lblName = new JLabel("Name:");
		JLabel lblUsername = new JLabel("Username:");
		JLabel lblPassowrd = new JLabel("Doctor:");
		JLabel lblDoctorUsername = new JLabel("Doctor Username:");
		JLabel lblEmail = new JLabel("Email:");
		JLabel lblAddress = new JLabel("Address");
		JLabel lblStreet = new JLabel("Street:");
		JLabel lblCity = new JLabel("City:");
		JLabel lblState = new JLabel("State:");
		JLabel lblZip = new JLabel("Zip:");
		JLabel lblPhone = new JLabel("Phone:");
		lblPassword = new JLabel("Password:");
		lblNurseId = new JLabel("Nurse ID:");
		
		addNursePanelNameInput = new JTextField();
		addNursePanelNameInput.setColumns(10);
		addNursePanelUsernameInput = new JTextField();
		addNursePanelUsernameInput.setColumns(10);
		addNursePanelDoctorInput = new JTextField();
		addNursePanelDoctorInput.setColumns(10);
		addNursePanelDoctorUserNameInput = new JTextField();
		addNursePanelDoctorUserNameInput.setColumns(10);
		addNursePanelEmailInput = new JTextField();
		addNursePanelEmailInput.setColumns(10);
		addNursePanelPhoneInput = new JTextField();
		addNursePanelPhoneInput.setColumns(10);
		addNursePanelStreetInput = new JTextField();
		addNursePanelStreetInput.setColumns(10);
		addNursePanelCityInput = new JTextField();
		addNursePanelCityInput.setColumns(10);
		addNursePanelStateInput = new JTextField();
		addNursePanelStateInput.setColumns(10);
		addNursePanelZipInput = new JTextField();
		addNursePanelZipInput.setColumns(10);
		addNursePanelPasswordInput = new JTextField();
		addNursePanelPasswordInput.setColumns(10);
		addNursePanelIDInput = new JTextField();
		addNursePanelIDInput.setColumns(10);
		
		addNursePanelSubmit = new JButton("Submit");
		addNursePanelCancel = new JButton("Cancel");
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(208)
							.addComponent(lblAddNurse, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(324)
							.addComponent(addNursePanelSubmit, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addComponent(addNursePanelCancel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNurseId)
								.addComponent(lblPassowrd, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDoctorUsername, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(addNursePanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelUsernameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelDoctorInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelDoctorUserNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(83)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPhone, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblZip, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStreet, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(addNursePanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addNursePanelPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(256)
							.addComponent(lblAddress, GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
					.addGap(4))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(lblAddNurse)
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblName))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(addNursePanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblAddress))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsername)
						.addComponent(addNursePanelUsernameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblStreet))
								.addComponent(addNursePanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword)
						.addComponent(addNursePanelPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(addNursePanelCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCity))
					.addGap(2)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNurseId))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(addNursePanelIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblState)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(addNursePanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(2)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addComponent(lblZip))
								.addComponent(addNursePanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(2)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassowrd)
						.addComponent(addNursePanelDoctorInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(addNursePanelPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPhone))))
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDoctorUsername)
						.addComponent(addNursePanelDoctorUserNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmail)
						.addComponent(addNursePanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(67)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(addNursePanelSubmit)
						.addComponent(addNursePanelCancel)))
		);
		setLayout(groupLayout);
	
		
		addNurseEvents(); //calls addNurseEvents Method
		p=new popUp(); //creates a new popup
		p.getContentPane().add(this);
		p.pack(); //packs the popup frame
		p.show(); //shows the popup
		
		
	}
	private void addNurseEvents()
	{
		addNursePanelSubmit.addActionListener(new ActionListener() { //button Listener for submit
			public void actionPerformed(ActionEvent e)
			{
				String nName = addNursePanelNameInput.getText(); // Nurse's Name
				String nUsername = addNursePanelUsernameInput.getText(); // Nurse username
				String nPassword = addNursePanelPasswordInput.getText(); // Nurse password
				String nNurseID = addNursePanelIDInput.getText(); // Nurse ID (of assigned nurse)
				String nDoctor=addNursePanelDoctorInput.getText();
				String nDoctorUsername = addNursePanelDoctorUserNameInput.getText(); // Doctor ID (of assigned doctor)
				String nEmail = addNursePanelEmailInput.getText(); // Nurse's email
				String nStreet = addNursePanelStreetInput.getText(); // Nurse's street (address)
				String nCity = addNursePanelCityInput.getText(); // Nurse's city (address)
				String nState = addNursePanelStateInput.getText(); // Nurse's state (address)
				String nZip = addNursePanelZipInput.getText(); // Nurse's zipcode (address)
				String nPhone = addNursePanelPhoneInput.getText(); // Nurse's phone number
				
				if(nName.length()!=0 &&
						   nUsername.length()!=0 &&
						   nPassword.length()!=0 &&
						   nNurseID.length()!=0 &&
						   nDoctor.length()!=0 &&
						   nDoctorUsername.length()!=0 &&
						   nEmail.length()!=0 &&
						   nStreet.length()!=0 &&
						   nCity.length()!=0 &&
						   nState.length()!=0 &&
						   nZip.length()!=0 &&
						   nPhone.length()!=0)
				{
					JOptionPane.showConfirmDialog(addNursePanelSubmit, "Are you sure you want to submit");
					
					String filename = nUsername +".txt";
					try {
						 
						File file = new File(filename);
			 
						// if file doesnt exists, then create it
						if (!file.exists()) {
							file.createNewFile();
						}
			 
						FileWriter fw = new FileWriter(file.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						
						bw.write(nName + "\n");
						bw.write(nUsername + "\n");
						bw.write(nDoctor + "\n");
						bw.write(nDoctorUsername + "\n");
						bw.write(nEmail + "\n");
						bw.write(nPhone + "\n");
						bw.write(nStreet + "\n");
						bw.write(nCity + "\n");
						bw.write(nState + "\n");
						bw.write(nZip + "\n");
						bw.close();
			 
						System.out.println("Done");
			 
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						
						File file = new File("LoginCred.txt");
			 
						// if file doesnt exists, then create it
						if (!file.exists()) {
							file.createNewFile();
						}
			 
						FileWriter fw3 = new FileWriter(file.getAbsoluteFile(),true);
						BufferedWriter bw3 = new BufferedWriter(fw3);
						
						bw3.newLine();
						bw3.write(nUsername);
						bw3.newLine();
						bw3.write(nPassword);
						bw3.newLine();
						bw3.write("nurse");
						bw3.newLine();
						bw3.write(nNurseID);
						bw3.newLine();
						bw3.write("Not set");
						bw3.newLine();
						bw3.write("N/A");
						bw3.close();
			 
						System.out.println("Done");
			 
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(addNursePanelSubmit, "Please Fill All Fields");
				}
			p.dispose();
			}
		});
		addNursePanelCancel.addActionListener(new ActionListener() { //buttonListnere for cancel
			public void actionPerformed(ActionEvent e)
			{
				p.dispose(); //closes the popup
			}
		});
	}
}
