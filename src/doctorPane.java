import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;


public class doctorPane extends JTabbedPane{ //creates a Doctrpane class of type JtabbedPane
		
	//field variables
		private JPanel doctorContactPanel; 
		private JPanel doctorPatientsPanel;
		private JPanel doctorAccountPanel;
		private JTextArea doctorContactBanner;
		private JLabel doctorContactDoctorLbl;
		private JLabel doctorContactDoctorIdLbl;
		private JLabel doctorContactEmailLbl;
		private JLabel doctorContactPhoneLbl;
		private JTable doctorPatientList;
		private JButton doctorSelectPatient;
		private JButton doctorAddPatient;
		private JScrollPane doctorScrollPane;
		private JButton doctorManageSecurityQuestions;
		private JButton doctorRecoverPassword;
		private JButton doctorChangePassword;
		private JTextArea doctorAccountManagementBanner;
		private JTextField doctorContactPanelDoctorInput;
		private JTextField doctorContactpanelIDInput;
		private JTextField doctorContactPanelEmailInput;
		private JTextField doctorContactPanelZipInput;
		private JTextField doctorContactPanelStateInput;
		private JTextField doctorContactPanelStreetInput;
		private JLabel label;
		private JLabel label_1;
		private JLabel label_2;
		private JLabel label_3;
		private JTextField doctorContactPanelOfficePhoneInput;
		private String name,  id, email, phone, street,city, state, zip, insurance, doctor;
		private JTextField doctorContactPanelCityInput;
		private JLabel lblCity;
		private JButton btnDoctorEditInformation;
		private JButton btnDoctorAcceptnewInfo;
		private String user;
		private JButton addNurseButton;
		public selectedPatientPane spp2=new selectedPatientPane();
		
		public doctorPane() //doctorpane class
		{

			setTabPlacement(JTabbedPane.LEFT); //sets the tabs to the left of pane
			
			doctorContactPanel = new JPanel(); //creates panel for doctor contactInfo
			doctorContactPanel.setBorder(null);
			addTab("Contact Information", null, doctorContactPanel, null); //adds panel to tabbed pane
			
			//creates Banner of information page
			doctorContactBanner = new JTextArea();
			doctorContactBanner.setText(" \t    Welcome\r\n\r\n            disGUIse Well-Check Clinic");
			doctorContactBanner.setForeground(new Color(0, 0, 102));
			doctorContactBanner.setFont(new Font("Times New Roman", Font.BOLD, 13));
			doctorContactBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			doctorContactBanner.setBackground(Color.WHITE);
			
			//creates labels for information page
			doctorContactDoctorLbl = new JLabel("Doctor:");
			doctorContactDoctorIdLbl = new JLabel("Doctor ID:");
			doctorContactEmailLbl = new JLabel("Email Address:");
			doctorContactPhoneLbl = new JLabel("Office Phone:");
			label = new JLabel("Office Address:");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label_1 = new JLabel("Street:");
			lblCity = new JLabel("City:");
			label_2 = new JLabel("State:");
			label_3 = new JLabel("Zip:");
			
			//creates textboxes and sets them to be uneditable
			doctorContactPanelDoctorInput = new JTextField();
			doctorContactPanelDoctorInput.setEditable(false);
			doctorContactPanelDoctorInput.setColumns(10);
			doctorContactPanelDoctorInput.setText("N/A"); //sets the text for to the name in database
			
			doctorContactpanelIDInput = new JTextField();
			doctorContactpanelIDInput.setEditable(false);
			doctorContactpanelIDInput.setColumns(10);
			doctorContactpanelIDInput.setText("N/A");	//sets the text for to the ID in database
			
			doctorContactPanelEmailInput = new JTextField();
			doctorContactPanelEmailInput.setEditable(false);
			doctorContactPanelEmailInput.setColumns(10);
			doctorContactPanelEmailInput.setText("N/A");	//sets the text for to the email in database
			
			doctorContactPanelZipInput = new JTextField();
			doctorContactPanelZipInput.setEditable(false);
			doctorContactPanelZipInput.setColumns(10);
			doctorContactPanelZipInput.setText("N/A");	//sets the text for to the zip in database
			
			doctorContactPanelStateInput = new JTextField();
			doctorContactPanelStateInput.setEditable(false);
			doctorContactPanelStateInput.setColumns(10);
			doctorContactPanelStateInput.setText("N/A");	//sets the text for to the state in database
			
			doctorContactPanelStreetInput = new JTextField();
			doctorContactPanelStreetInput.setEditable(false);
			doctorContactPanelStreetInput.setColumns(10);
			doctorContactPanelStreetInput.setText("N/A");	//sets the text for to the address in database
			
			doctorContactPanelCityInput = new JTextField();
			doctorContactPanelCityInput.setText("N/A");
			doctorContactPanelCityInput.setEditable(false);
			doctorContactPanelCityInput.setColumns(10);
			
			doctorContactPanelOfficePhoneInput = new JTextField();
			doctorContactPanelOfficePhoneInput.setEditable(false);
			doctorContactPanelOfficePhoneInput.setColumns(10);
			doctorContactPanelOfficePhoneInput.setText("N/A");
			
			
			
			//creates buttons
			btnDoctorEditInformation = new JButton("Edit Information");
			btnDoctorAcceptnewInfo = new JButton("Accept");
			
			GroupLayout gl_doctorContactPanel = new GroupLayout(doctorContactPanel); //creates new grouplayout
			//sets positions of components with grouplayout using WindowBuilder
			gl_doctorContactPanel.setHorizontalGroup(
				gl_doctorContactPanel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_doctorContactPanel.createSequentialGroup()
						.addContainerGap(34, Short.MAX_VALUE)
						.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_doctorContactPanel.createSequentialGroup()
								.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_doctorContactPanel.createSequentialGroup()
												.addGap(34)
												.addComponent(doctorContactDoctorLbl, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_doctorContactPanel.createSequentialGroup()
												.addGap(34)
												.addComponent(doctorContactDoctorIdLbl, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_doctorContactPanel.createSequentialGroup()
												.addGap(34)
												.addComponent(doctorContactPhoneLbl, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_doctorContactPanel.createSequentialGroup()
												.addGap(65)
												.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_doctorContactPanel.createSequentialGroup()
												.addGap(65)
												.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_doctorContactPanel.createSequentialGroup()
												.addGap(65)
												.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_doctorContactPanel.createSequentialGroup()
												.addGap(65)
												.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
										.addGap(10)
										.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
											.addComponent(doctorContactPanelDoctorInput, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addComponent(doctorContactpanelIDInput, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addComponent(doctorContactPanelOfficePhoneInput, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addComponent(doctorContactPanelStreetInput, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addComponent(doctorContactPanelCityInput, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addComponent(doctorContactPanelStateInput, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addComponent(doctorContactPanelZipInput, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addComponent(doctorContactPanelEmailInput, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(34)
										.addComponent(doctorContactEmailLbl, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(34)
										.addComponent(label, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(89)
										.addComponent(doctorContactBanner, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)))
								.addGap(153))
							.addGroup(Alignment.TRAILING, gl_doctorContactPanel.createSequentialGroup()
								.addComponent(btnDoctorEditInformation)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnDoctorAcceptnewInfo, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addGap(36))))
			);
			gl_doctorContactPanel.setVerticalGroup(
				gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_doctorContactPanel.createSequentialGroup()
						.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_doctorContactPanel.createSequentialGroup()
								.addGap(11)
								.addComponent(doctorContactBanner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(11)
								.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(6)
										.addComponent(doctorContactDoctorLbl))
									.addComponent(doctorContactPanelDoctorInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(6)
										.addComponent(doctorContactDoctorIdLbl))
									.addComponent(doctorContactpanelIDInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addComponent(doctorContactEmailLbl)
								.addGap(21)
								.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
									.addComponent(doctorContactPhoneLbl)
									.addComponent(doctorContactPanelOfficePhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(29)
								.addComponent(label)
								.addGap(11)
								.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(6)
										.addComponent(label_1))
									.addComponent(doctorContactPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(8)
								.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(6)
										.addComponent(lblCity))
									.addComponent(doctorContactPanelCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(5)
								.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(6)
										.addComponent(label_2))
									.addComponent(doctorContactPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(6)
								.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_doctorContactPanel.createSequentialGroup()
										.addGap(6)
										.addComponent(label_3))
									.addComponent(doctorContactPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_doctorContactPanel.createSequentialGroup()
								.addGap(146)
								.addComponent(doctorContactPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
						.addGroup(gl_doctorContactPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnDoctorEditInformation)
							.addComponent(btnDoctorAcceptnewInfo))
						.addGap(21))
			);
			doctorContactPanel.setLayout(gl_doctorContactPanel); //sets the layout of this panel to the layoutabove

			///////////////////////////////////////Doctor Patient List tab
			doctorPatientsPanel = new JPanel(); //creates Panel for Doctorpatients
			addTab("Patient List", null, doctorPatientsPanel, null); //adds panel to tab
			
			//creates buttons
			doctorAddPatient = new JButton("Add Patient");
			doctorSelectPatient = new JButton("Select Patient");
			addNurseButton = new JButton("Add Nurse");
			//creates a scroll  pane
			doctorScrollPane = new JScrollPane();
			doctorScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			doctorScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			doctorPatientList = new JTable(); //creates a new table
			doctorPatientList.setModel(new DefaultTableModel( // creates empty table
					new Object[][] {
					},
					new String[] {
							"Patient ID:", "Patient First:", "Patient Last:", "Nurse Name:", "Last Checkup:" //table columns
					}
					));
			
			DefaultTableModel model = (DefaultTableModel) doctorPatientList.getModel();
			
			createPatientList list1 = new createPatientList(); //creates new patientlist
			patientLinkedList temp = list1.head;
			while( temp != null)
			{
				String date, weight, blood1, blood2, glucose;
				date = "N/A";
				String fileName = temp.getId() + "indicators.txt";
				FileReader fr; //reads data from file

				try {
					fr = new FileReader(fileName);
				
					BufferedReader br = new BufferedReader(fr);

					
					while( (weight = br.readLine()) != null)
					{
						date = weight;
						weight = br.readLine(); //sets lines to variables
						blood1 = br.readLine();
						blood2 = br.readLine();
						glucose= br.readLine();
					}
				fr.close();
				
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				model.addRow(new Object[]{temp.getId(), temp.getFirstName(), temp.getLastName(), temp.getNurseId(),date});
				temp = temp.getNext();
			}
			//sets size of each column
			doctorPatientList.getColumnModel().getColumn(0).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(1).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(2).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(3).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(4).setPreferredWidth(80);
			doctorScrollPane.setViewportView(doctorPatientList);
			
			
			GroupLayout gl_doctorPatientsPanel = new GroupLayout(doctorPatientsPanel);//creates new grouplayout for this panel
			//sets positions of components for PatientsPanel using WindowBuilder
			gl_doctorPatientsPanel.setHorizontalGroup(
				gl_doctorPatientsPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_doctorPatientsPanel.createSequentialGroup()
						.addGap(20)
						.addComponent(addNurseButton, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addGap(70)
						.addComponent(doctorAddPatient)
						.addGap(10)
						.addComponent(doctorSelectPatient, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_doctorPatientsPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(doctorScrollPane, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
						.addContainerGap())
			);
			gl_doctorPatientsPanel.setVerticalGroup(
				gl_doctorPatientsPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_doctorPatientsPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(doctorScrollPane, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
						.addGap(7)
						.addGroup(gl_doctorPatientsPanel.createParallelGroup(Alignment.LEADING)
							.addComponent(addNurseButton)
							.addComponent(doctorAddPatient)
							.addComponent(doctorSelectPatient)))
			);
			doctorPatientsPanel.setLayout(gl_doctorPatientsPanel); //sets the layout to the above

			//Doctor Account Management Tab
			doctorAccountPanel = new JPanel(); //doctor panel for account management
			addTab("Account Management", null, doctorAccountPanel, null); //adds the tab
			
			//creates new buttons
			doctorManageSecurityQuestions = new JButton("Manage Security Questions?"); 
			doctorRecoverPassword = new JButton("Recover Password?");
			doctorChangePassword = new JButton("Change Password?");

			doctorManageSecurityQuestions.setForeground(new Color(0, 0, 102));
			doctorRecoverPassword.setForeground(new Color(0, 0, 102));
			doctorChangePassword.setForeground(new Color(0, 0, 102));
			//creates new Banner
			doctorAccountManagementBanner = new JTextArea();
			doctorAccountManagementBanner.setText("         disGUIse Account Management");
			doctorAccountManagementBanner.setForeground(new Color(0, 0, 102));
			doctorAccountManagementBanner.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			doctorAccountManagementBanner.setEditable(false);
			doctorAccountManagementBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			
			//creates layout for account management components
			GroupLayout gl_doctorAccountPanel = new GroupLayout(doctorAccountPanel);
			gl_doctorAccountPanel.setHorizontalGroup(
				gl_doctorAccountPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_doctorAccountPanel.createSequentialGroup()
						.addGap(46)
						.addGroup(gl_doctorAccountPanel.createParallelGroup(Alignment.LEADING)
							.addComponent(doctorAccountManagementBanner, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
							.addComponent(doctorChangePassword, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addComponent(doctorRecoverPassword, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
							.addComponent(doctorManageSecurityQuestions, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			gl_doctorAccountPanel.setVerticalGroup(
				gl_doctorAccountPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_doctorAccountPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(doctorAccountManagementBanner, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGap(56)
						.addComponent(doctorChangePassword)
						.addGap(18)
						.addComponent(doctorRecoverPassword)
						.addGap(11)
						.addComponent(doctorManageSecurityQuestions)
						.addContainerGap(84, Short.MAX_VALUE))
			);
			gl_doctorAccountPanel.linkSize(SwingConstants.HORIZONTAL, new Component[] {doctorManageSecurityQuestions, doctorRecoverPassword, doctorChangePassword});
			doctorAccountPanel.setLayout(gl_doctorAccountPanel); //sets the layout of this panel to the above
			
			doctorPaneEvents();//calls events method
		}
		
		//method that refreshes the panel with the data whenever patients are added
		public void refreshPanel(String file)
		{
				user=file;
				FileReader fr; //reads data from file
				try {
					fr = new FileReader(file);
				
				BufferedReader br = new BufferedReader(fr);
					name = br.readLine();
					id = br.readLine(); //sets lines to variables
					email = br.readLine();
					phone = br.readLine();
					street = br.readLine();
					city = br.readLine();
					state = br.readLine();
					zip = br.readLine();
				//people.printList();
				fr.close();
				
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				doctorContactPanelCityInput.setText(city);
				doctorContactPanelStreetInput.setText(street);
				doctorContactPanelStateInput.setText(state);
				doctorContactPanelOfficePhoneInput.setText(phone);
				doctorContactpanelIDInput.setText(id);
				doctorContactPanelEmailInput.setText(email);
				doctorContactPanelDoctorInput.setText(name);
				doctorContactPanelZipInput.setText(zip);
				
		}
		//refreshes the patient List table
		public void refreshTable()
		{
			
			DefaultTableModel model = (DefaultTableModel) doctorPatientList.getModel();
			createPatientList list1 = new createPatientList();
			int row = model.getRowCount()-1; // get the number of rows already in the table
			System.out.println("number of row is: " + row);
			while(row >= 0)
			{
				model.removeRow(row);
				System.out.println(row);
				row--;
			}
			patientLinkedList temp = list1.head;
			while( temp != null)
			{
				String date, weight, blood1, blood2, glucose;
				date = "N/A";
				
				String fileName = temp.getId() + "indicators.txt";
				FileReader fr; //reads data from file
				

				try {
					fr = new FileReader(fileName);
				
					BufferedReader br = new BufferedReader(fr);

					
					while( (weight = br.readLine()) != null)
					{
						date = weight;
						weight = br.readLine(); //sets lines to variables
						blood1 = br.readLine();
						blood2 = br.readLine();
						glucose= br.readLine();
					}
	//					
					
				fr.close();
				
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				model.addRow(new Object[]{temp.getId(), temp.getFirstName(), temp.getLastName(), temp.getNurseId(),date});
				temp = temp.getNext();
			}
		}
		//method for the button listeners
		private void doctorPaneEvents()
		{
			btnDoctorEditInformation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					//allows the following textboxes to be edited
					doctorContactPanelEmailInput.setEditable(true);
					doctorContactPanelOfficePhoneInput.setEditable(true);
				}
			});
			btnDoctorAcceptnewInfo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					//updates file
					doctorContactPanelEmailInput.setEditable(false);
					doctorContactPanelOfficePhoneInput.setEditable(false);
					
					try
					{
					File file=new File(user);
					BufferedReader br=new BufferedReader(new FileReader(file));
					
					String newEmail=doctorContactPanelEmailInput.getText();
					String newPhone=doctorContactPanelOfficePhoneInput.getText();
					//reads the line in the doctors file
					name = br.readLine();
					id = br.readLine();
					email = br.readLine();
					phone = br.readLine();
					street = br.readLine();
					city=br.readLine();
					state = br.readLine();
					zip = br.readLine();
					//swaps the old data with the new data
					email=newEmail;
					phone=newPhone;
					
					//rewrites the file using the new data
					FileWriter fr=new FileWriter(file);
					fr.write(name+"\n");
					
					fr.write(id+"\n");
					fr.write(email+"\n");
					fr.write(phone+"\n");
					fr.write(street+"\n");
					fr.write(city+"\n");
					fr.write(state+"\n");
					fr.write(zip+"\n");
					fr.close();
					
					}catch (Throwable e1) {
						e1.printStackTrace();
					}	
				}
			});
			addNurseButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					addNursePanel aN=new addNursePanel(); //calls add nurse panel
				}
			});
			
			doctorAddPatient.addActionListener(new ActionListener() { //when add pateint is selcted
				public void actionPerformed(ActionEvent arg0) 
				{
					//when the doctor selects add patient
					addPatientPanel ap=new addPatientPanel(); //creates new add patient panel
					
				}
			});
			doctorSelectPatient.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					//when the doctor clicks on a patient profile
					popUp p2=new popUp();
					selectedPatientPane spp=new selectedPatientPane(); //calls selected patient
					System.out.println("patient: " + doctorPatientList.getValueAt(doctorPatientList.getSelectedRow(), 0));
					String fileName = doctorPatientList.getValueAt(doctorPatientList.getSelectedRow(), 0)+ ".txt"; // returns the patient .txt file;
					spp.refreshPanel(fileName);
					spp.refreshIndicatorTable((String)doctorPatientList.getValueAt(doctorPatientList.getSelectedRow(), 0));
					spp.refreshPrescriptionTable((String)doctorPatientList.getValueAt(doctorPatientList.getSelectedRow(), 0));
					spp.patientID = (String)doctorPatientList.getValueAt(doctorPatientList.getSelectedRow(),0);
					spp2=spp; //stores spp into public spp2
					p2.getContentPane().add(spp); //adds the selectedPateintPane to a popup window
					p2.pack();
					System.out.println(fileName);
					p2.show();
					
				}
			});
			//
			doctorChangePassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					changePassword cp=new changePassword(); //calls createpassword panel
				}
			});
			doctorRecoverPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{

					passwordReset pr=new passwordReset(disGuiseFrame.Username); //calls resetpassword Panel
				}
			});
			doctorManageSecurityQuestions.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					securityQuestion sq=new securityQuestion(); //calls security question Panel
				}
			});

		}
}
