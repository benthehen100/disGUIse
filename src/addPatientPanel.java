import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class addPatientPanel extends JPanel { //this panel is the called when a new patient is created
	
	private JTextField addPatientFirstInput;
	private JTextField addPatientLastInput;
	private JTextField addPatientPatientIDInput;
	private JTextField addPatientUsernameInput;
	private JTextField addPatientPasswordInput; //parameters
	private JTextField addPatientStreetInput;
	private JTextField addPatientCityInput;
	private JTextField addPatientStateInput;
	private JTextField addPatientZipInput;
	private JTextField addPatientNurseIDInput;
	private JTextField addPatientDoctorIDInput;
	private JTextField addPatientInsuranceInput;
	private JTextField addPatientEmailInput;
	private JTextField addPatientDOBInput;
	private JTextField addPatientPhoneInput;
	private JButton addPatientSubmit;
	private JButton addPatientCancel;
	
	public addPatientPanel() {
		
		addPatientFirstInput = new JTextField(10);
		addPatientLastInput = new JTextField(10);
		addPatientPatientIDInput = new JTextField(10); //sets size of textfields to 10
		addPatientUsernameInput = new JTextField(10);
		addPatientPasswordInput = new JTextField(10);
		addPatientStreetInput = new JTextField(10);
		
		addPatientCityInput = new JTextField(10);
		addPatientStateInput = new JTextField(10);
		addPatientZipInput = new JTextField(10);
		
		addPatientNurseIDInput = new JTextField(10);
		addPatientDoctorIDInput = new JTextField(10);
		
		addPatientInsuranceInput = new JTextField(10);
		addPatientEmailInput = new JTextField(10);
		addPatientDOBInput = new JTextField(10);
		addPatientPhoneInput = new JTextField(10);
		
		JLabel lblFirst = new JLabel("First:"); //creates and sets labels 
		JLabel lblLast = new JLabel("Last: ");
		JLabel lblNewLabel = new JLabel("Patient ID:");
		JLabel lblPatientUsername = new JLabel("Patient Username:");
		JLabel lblPatientPassword = new JLabel("Patient Password:");
		
		JLabel lblStreet = new JLabel("Street:");
		JLabel lblCity = new JLabel("City:");
		JLabel lblState = new JLabel("State:");
		JLabel lblZip = new JLabel("Zip:");
		JLabel lblPatientAddress = new JLabel("Patient Address");
		JLabel lblPatientInformation = new JLabel("Patient Name");
		
		JLabel lblNurseId = new JLabel("Nurse ID:");
		JLabel lblDoctorId = new JLabel("Doctor ID:");
		
		JLabel lblInsurance = new JLabel("Insurance:");
		JLabel lblEmail = new JLabel("Email:");
		JLabel lblDob = new JLabel("DOB:");
		JLabel lblPhone = new JLabel("Phone:");
		
		addPatientSubmit = new JButton("Submit"); //submit button for the patient
		addPatientCancel = new JButton("Cancel"); //cancel the character creation
		
		JLabel lblAddPatient = new JLabel("Add Patient"); //add patient banner
		lblAddPatient.setForeground(new Color(0, 0, 139));
		lblAddPatient.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		
		//group layout sets the layout and positioning of addPatient panel
		GroupLayout groupLayout = new GroupLayout(this); 
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(112)
									.addComponent(lblFirst))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(110)
									.addComponent(lblLast))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(85)
									.addComponent(lblNewLabel))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(119)
									.addComponent(lblZip))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(48)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPatientUsername)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(2)
											.addComponent(lblPatientPassword))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(13)
											.addComponent(lblPatientAddress))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(55)
											.addComponent(lblStreet))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(66)
											.addComponent(lblCity))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(59)
											.addComponent(lblState)))))
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(addPatientFirstInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientLastInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientPatientIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientUsernameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPhone)
										.addComponent(lblDob)
										.addComponent(lblEmail)
										.addComponent(lblInsurance)
										.addComponent(lblDoctorId)
										.addComponent(lblNurseId))
									.addGap(5)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(addPatientNurseIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(addPatientDoctorIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(addPatientInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(addPatientEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(addPatientDOBInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(addPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(addPatientSubmit)
									.addGap(6)
									.addComponent(addPatientCancel)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(73)
							.addComponent(lblPatientInformation))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(240)
							.addComponent(lblAddPatient)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(lblAddPatient)
					.addGap(6)
					.addComponent(lblPatientInformation)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblFirst))
						.addComponent(addPatientFirstInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNurseId))
						.addComponent(addPatientNurseIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblLast))
						.addComponent(addPatientLastInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDoctorId))
						.addComponent(addPatientDoctorIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(addPatientPatientIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPatientUsername)
							.addGap(11)
							.addComponent(lblPatientPassword)
							.addGap(6)
							.addComponent(lblPatientAddress)
							.addGap(14)
							.addComponent(lblStreet)
							.addGap(12)
							.addComponent(lblCity)
							.addGap(17)
							.addComponent(lblState))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(addPatientUsernameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(addPatientPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(addPatientStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(addPatientCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(addPatientStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(lblInsurance)
							.addGap(12)
							.addComponent(lblEmail)
							.addGap(17)
							.addComponent(lblDob)
							.addGap(17)
							.addComponent(lblPhone))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(25)
							.addComponent(addPatientInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(addPatientEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(addPatientDOBInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(addPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblZip))
								.addComponent(addPatientZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(addPatientSubmit)
								.addComponent(addPatientCancel)))))
		); //end of grouplayout
		setLayout(groupLayout); //sets the layout of this panel to groupLayout
		//
		addPatientEvents(); //calls the events that are done in this panel
	}
	private void addPatientEvents()
	{
		addPatientSubmit.addActionListener(new ActionListener() { //what happens when the user submits
			public void actionPerformed(ActionEvent arg0) 
			{
				//submit button
				
				// Saves the text in the field to a corresponding string
				String pPatientID = addPatientPatientIDInput.getText(); // Patient ID
				String pFirst = addPatientFirstInput.getText(); // Patient's first name
				String pLast = addPatientLastInput.getText(); // Patient's last name
				String pStreet = addPatientStreetInput.getText(); // Patient's street (address)
				String pCity = addPatientCityInput.getText(); // Patient's city (address)
				String pState = addPatientStateInput.getText(); // Patient's state (address)
				String pZip = addPatientZipInput.getText(); // Patient's zipcode (address)
				String pPhone = addPatientPhoneInput.getText(); // Patient's phone number
				String pEmail = addPatientEmailInput.getText(); // Patient's email
				String pDOB = addPatientDOBInput.getText(); // Patient's Date of birth
				String pInsurance = addPatientInsuranceInput.getText(); // Patient's insurance
				String pUsername = addPatientUsernameInput.getText(); // Patient username
				String pPassword = addPatientPasswordInput.getText(); // Patient password
				String pDoctorID = addPatientDoctorIDInput.getText(); // Doctor ID (of assigned doctor)
				String pNurseID = addPatientNurseIDInput.getText(); // Nurse ID (of assigned nurse)
				
				// Pop up message after clicking submit
				JOptionPane.showConfirmDialog(addPatientSubmit, "Are you sure you want to submit"); //ask user for confirmation
			}
		});
		//
		addPatientCancel.addActionListener(new ActionListener() { //what happens when user cancels
			public void actionPerformed(ActionEvent e) 
			{
				//cancel button
			}
		});
	}

}
