import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class addPatientPanel extends JPanel { //this panel is the called when a new patient is created
	//creates field varaibles
	private JTextField addPatientFirstInput;
	private JTextField addPatientLastInput;
	private JTextField addPatientPatientIDInput;
	private JTextField addPatientUsernameInput;
	private JTextField addPatientPasswordInput; 
	private JTextField addPatientStreetInput;
	private JTextField addPatientCityInput;
	private JTextField addPatientStateInput;
	private JTextField addPatientZipInput;
	private JTextField addPatientNurseNameInput;
	private JTextField addPatientDoctorNameInput;
	private JTextField addPatientInsuranceInput;
	private JTextField addPatientEmailInput;
	private JTextField addPatientDOBInput;
	private JTextField addPatientPhoneInput;
	private JButton addPatientSubmit;
	private JButton addPatientCancel;
	private popUp p;
	private String pPatientID;
	
	public addPatientPanel() {
	
		createPatientList list = new createPatientList(); //creates new patient list
		pPatientID = Integer.toString(list.returnID()); //confirst int to string
		//creates the texboxes used in panel
		addPatientFirstInput = new JTextField(10);
		addPatientLastInput = new JTextField(10);
		addPatientPatientIDInput = new JTextField(10);
		addPatientPatientIDInput.setText(pPatientID); //sets the text of this file to pPatientID
		addPatientPatientIDInput.setEditable(false); //unable to edit this box
		addPatientUsernameInput = new JTextField(10);
		addPatientPasswordInput = new JTextField(10);
		addPatientStreetInput = new JTextField(10);
		addPatientCityInput = new JTextField(10);
		addPatientStateInput = new JTextField(10);
		addPatientZipInput = new JTextField(10);
		addPatientNurseNameInput = new JTextField(10);
		addPatientDoctorNameInput = new JTextField(10);
		addPatientInsuranceInput = new JTextField(10);
		addPatientEmailInput = new JTextField(10);
		addPatientDOBInput = new JTextField(10);
		addPatientPhoneInput = new JTextField(10);
		
		//creates labels that will be used in this panel
		JLabel lblFirst = new JLabel("First:");
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
		JLabel lblNurseId = new JLabel("Nurse Name:");
		JLabel lblDoctorId = new JLabel("Doctor Name:");
		JLabel lblInsurance = new JLabel("Insurance:");
		JLabel lblEmail = new JLabel("Email:");
		JLabel lblDob = new JLabel("DOB:");
		JLabel lblPhone = new JLabel("Phone:");
		//creates buttons for this panel
		addPatientSubmit = new JButton("Submit");
		addPatientCancel = new JButton("Cancel");
		
		//creates add Pateint Banner on top of panel
		JLabel lblAddPatient = new JLabel("Add Patient");
		lblAddPatient.setForeground(new Color(0, 0, 139));
		lblAddPatient.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 21));
		
		GroupLayout groupLayout = new GroupLayout(this); //creates new grouplayout
		//sets horizontal and verical positions of all components using window builder
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
									.addGap(48)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPatientUsername)
										.addComponent(lblPatientPassword)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(33)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblPatientAddress)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(70)
											.addComponent(lblStreet))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(114)
									.addComponent(lblCity))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(107)
									.addComponent(lblState))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(119)
									.addComponent(lblZip)))
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
							.addGap(108)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNurseId)
								.addComponent(lblDoctorId)
								.addComponent(lblInsurance)
								.addComponent(lblEmail)
								.addComponent(lblDob)
								.addComponent(lblPhone))
							.addGap(5)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(addPatientDoctorNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientNurseNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientDOBInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(addPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(341)
							.addComponent(addPatientSubmit)
							.addGap(6)
							.addComponent(addPatientCancel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(73)
							.addComponent(lblPatientInformation))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(240)
							.addComponent(lblAddPatient)))
					.addGap(54))
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
						.addComponent(addPatientNurseNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblLast))
						.addComponent(addPatientLastInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDoctorId))
						.addComponent(addPatientDoctorNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(addPatientPatientIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPatientUsername)
							.addGap(17)
							.addComponent(lblPatientPassword))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(addPatientUsernameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(addPatientPasswordInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addComponent(lblInsurance)
							.addGap(12)
							.addComponent(lblEmail))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addComponent(addPatientInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(addPatientEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPatientAddress)
							.addGap(5)
							.addComponent(lblStreet))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(16)
							.addComponent(addPatientStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(9)
							.addComponent(lblDob))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(addPatientDOBInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(lblCity))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(addPatientCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblPhone))
						.addComponent(addPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblState))
						.addComponent(addPatientStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(lblZip))
						.addComponent(addPatientZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(addPatientSubmit)
						.addComponent(addPatientCancel)))
		);
		setLayout(groupLayout); //sets the layout of this panel to grouplayout
		//
		
		addPatientEvents(); //calls the events that are done in this panel
		p=new popUp(); //creates new popup instance
		p.getContentPane().add(this); //adds this panel to popUP
		p.pack(); //packs the popup frame
		p.show(); //shows the popup
	}
	//method used for holding all the button listeners in this class
	private void addPatientEvents()
	{
		addPatientSubmit.addActionListener(new ActionListener() { //what happens when the user submits
			public void actionPerformed(ActionEvent arg0) 
			{
				//submit button
				
				// Saves the text in the field to a corresponding string
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
				String pDoctorID = addPatientDoctorNameInput.getText(); // Doctor ID (of assigned doctor)
				String pNurseID = addPatientNurseNameInput.getText(); // Nurse ID (of assigned nurse)
				
				
				if(pPatientID.length()!=0 && //check if informatoin is entered in all textboxes
				   pFirst.length()!=0 &&
				   pLast.length()!=0 &&
				   pStreet.length()!=0 &&
				   pCity.length()!=0 &&
				   pZip.length()!=0 &&
				   pPhone.length()!=0 &&
				   pEmail.length()!=0 &&
				   pDOB.length()!=0 &&
				   pInsurance.length()!=0 &&
				   pUsername.length()!=0 &&
				   pPassword.length()!=0 &&
				   pDoctorID.length()!=0 &&
				   pNurseID.length()!=0)
				{
				
				
				// Pop up message after clicking submit
				int response=JOptionPane.showConfirmDialog(addPatientSubmit, "Are you sure you want to submit");//ask user for confirmation
				if(response != JOptionPane.YES_OPTION) //if yes is not chosen then doesnt submit
				{
					return;
				}
				
				createPatientList list1 = new createPatientList(); //creates a linked-list of the patients In the file already
				try {
		 
					File file = new File("patientList.txt"); //creates a new file with the patients name
		 
					// if file doesnt exists, then create it
					if (!file.exists()) {
						file.createNewFile();
					}
		 
					FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);//adds informaiton to bottom of file
					/*BufferedWriter bw = new BufferedWriter(fw);
					patientLinkedList temp;
					temp = list1.head;
					
					while(temp != null)
					{
					
						bw.write(temp.getId() + "\n");
						bw.write(temp.getFirstName() + "\n");
						bw.write(temp.getLastName() + "\n");
						bw.write(temp.getNurseId() + "\n");
						bw.write("None" + "\n");
						temp = temp.getNext();
					}
					*/
					//writes the patients ID and Name
					fw.write(pPatientID + "\n");
					fw.write(pFirst + "\n");
					fw.write(pLast + "\n");
					fw.write(pNurseID + "\n");
					fw.write("None" + "\n");
					fw.close();
		 
					System.out.println("Done");
		 
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				String filename = pPatientID +".txt";
				try {
					 
					File file = new File(filename); //creates a file for the new patient using his ID
		 
					// if file doesnt exists, then create it
					if (!file.exists()) {
						file.createNewFile();
					}
		 
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					//writes patients contact information to file
					bw.write(pFirst + "\n");
					bw.write(pLast + "\n");
					bw.write(pPatientID + "\n");
					bw.write(pStreet + "\n");
					bw.write(pCity + "\n");
					bw.write(pState + "\n");
					bw.write(pZip + "\n");
					bw.write(pNurseID + "\n");
					bw.write(pDoctorID + "\n");
					bw.write(pInsurance + "\n");
					bw.write(pEmail + "\n");
					bw.write(pPhone + "\n");
					bw.close();
		 
					System.out.println("Done");
		 
				} catch (IOException e) {
					e.printStackTrace();
				}

				
				linkList people = new linkList();
				Link temp2;
				FileReader fr;
				try {
					fr = new FileReader("LoginCred.txt");
				
				BufferedReader br = new BufferedReader(fr);
				String a,b,c,d,e2,f; //e is already used by action listener, so I used e2
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
				//people.printList();
				fr.close();
				
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					
					temp2 = people.head;
					File file = new File("LoginCred.txt");
		 
					// if file doesnt exists, then create it
					if (!file.exists()) {
						file.createNewFile();
					}
		 
					FileWriter fw3 = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw3 = new BufferedWriter(fw3);
					patientLinkedList temp;
					temp = list1.head;
					
					while(temp2 != null)
					{
						bw3.write(temp2.username);
						bw3.newLine();
						bw3.write(temp2.password);
						bw3.newLine();
						bw3.write(temp2.type);
						bw3.newLine();
						bw3.write(temp2.id);
						bw3.newLine();
						bw3.write(temp2.recovery);
						bw3.newLine();
						bw3.write(temp2.answer);
						bw3.newLine();
						temp2 = temp2.next;
					}
					
					bw3.write(pUsername);
					bw3.newLine();
					bw3.write(pPassword);
					bw3.newLine();
					bw3.write("patient");
					bw3.newLine();
					bw3.write(pPatientID);
					bw3.newLine();
					bw3.write("Not set");
					bw3.newLine();
					bw3.write("N/A");
					bw3.close();
		 
					System.out.println("Done");
		 
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				filename = pPatientID +"indicators.txt"; //creates indicators file for patient
				try {
					 
					File file = new File(filename);
		 

					if (!file.exists()) {
						file.createNewFile();
					}
		 
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				filename = pPatientID +"prescriptions.txt"; //creates indicators file for patient
				try {
					 
					File file = new File(filename);
		 

					if (!file.exists()) {
						file.createNewFile();
					}
		 
				} catch (IOException e) {
					e.printStackTrace();
				}
				disGuiseFrame.doctor.refreshTable(); //refreshes the patient list for doctor
				disGuiseFrame.nurse.refreshTable(); //refreshes the patient list for nurse
				p.dispose(); //closes the window
				}
				else
				{
					JOptionPane.showMessageDialog(addPatientSubmit, "Please Fill All Fields"); //prompts user to input all fields
				}
				
			}
			
			
		});
		//
		addPatientCancel.addActionListener(new ActionListener() { //what happens when user cancels
			public void actionPerformed(ActionEvent e) 
			{
				//cancel button
				p.dispose(); //closes the window
			}
		});
	}

}
