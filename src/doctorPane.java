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
	
		private JPanel doctorContactPanel; //field variables
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
		
		public doctorPane() //doctorpane class
		{

			
			setTabPlacement(JTabbedPane.LEFT); //sets the tabs to the left of pane
			
			doctorContactPanel = new JPanel(); //creates panel for doctor contactInfo
			doctorContactPanel.setBorder(null);
			addTab("Contact Information", null, doctorContactPanel, null); //adds panel to tabbed pane

			doctorContactBanner = new JTextArea();
			doctorContactBanner.setText(" \t    Welcome\r\n\r\n            disGUIse Well-Check Clinic");
			doctorContactBanner.setForeground(new Color(0, 0, 102));
			doctorContactBanner.setFont(new Font("Times New Roman", Font.BOLD, 13));
			doctorContactBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			doctorContactBanner.setBackground(Color.WHITE);

			doctorContactDoctorLbl = new JLabel("Doctor:");
			doctorContactDoctorIdLbl = new JLabel("Doctor ID:");
			doctorContactEmailLbl = new JLabel("Email Address:");
			doctorContactPhoneLbl = new JLabel("Office Phone:");
			
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
			
			label = new JLabel("Office Address:");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			
			label_1 = new JLabel("Street:");
			label_2 = new JLabel("State:");
			label_3 = new JLabel("Zip:");
			
			doctorContactPanelOfficePhoneInput = new JTextField();
			doctorContactPanelOfficePhoneInput.setEditable(false);
			doctorContactPanelOfficePhoneInput.setColumns(10);
			doctorContactPanelOfficePhoneInput.setText("N/A");
			
			lblCity = new JLabel("City:");
			
			btnDoctorEditInformation = new JButton("Edit Information");
			
			btnDoctorAcceptnewInfo = new JButton("Accept");
			
			GroupLayout gl_doctorContactPanel = new GroupLayout(doctorContactPanel);
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
			doctorContactPanel.setLayout(gl_doctorContactPanel);

			///////////////////////////////////////Doctor Patient List tab
			doctorPatientsPanel = new JPanel(); //creates Panel for Doctorpatietns
			addTab("Patient List", null, doctorPatientsPanel, null); //adds panel to tab

			doctorAddPatient = new JButton("Add Patient"); //adds button
			doctorSelectPatient = new JButton("Select Patient");

			doctorScrollPane = new JScrollPane(); //creates scroll pane
			doctorScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			doctorScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

			//creates grouplayout for doctropatientsPanel
			GroupLayout gl_doctorPatientsPanel = new GroupLayout(doctorPatientsPanel);
			gl_doctorPatientsPanel.setHorizontalGroup(
					gl_doctorPatientsPanel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_doctorPatientsPanel.createSequentialGroup()
							.addGroup(gl_doctorPatientsPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_doctorPatientsPanel.createSequentialGroup()
											.addGap(60)
											.addComponent(doctorAddPatient)
											.addGap(97)
											.addComponent(doctorSelectPatient, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_doctorPatientsPanel.createSequentialGroup()
													.addContainerGap()
													.addComponent(doctorScrollPane, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)))
													.addContainerGap())
					);
			gl_doctorPatientsPanel.setVerticalGroup(
					gl_doctorPatientsPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_doctorPatientsPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(doctorScrollPane, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addGroup(gl_doctorPatientsPanel.createParallelGroup(Alignment.LEADING)
									.addComponent(doctorAddPatient)
									.addComponent(doctorSelectPatient))
									.addContainerGap(54, Short.MAX_VALUE))
					);
			
			
			
			doctorPatientList = new JTable(); //cretes a new table
			doctorPatientList.setModel(new DefaultTableModel( // creates empty table
					new Object[][] {
					},
					
					new String[] {
							"Patient ID:", "Patient First:", "Patient Last:", "Nurse Name:", "Last Checkup:" //table columns
					}
					));
			
			DefaultTableModel model = (DefaultTableModel) doctorPatientList.getModel();
			createPatientList list1 = new createPatientList();
			patientLinkedList temp = list1.head;
			while( temp != null)
			{
				model.addRow(new Object[]{temp.getId(), temp.getFirstName(), temp.getLastName(), temp.getNurseId(),temp.getLastCheckUp()});
				temp = temp.getNext();
			}
			

			doctorPatientList.getColumnModel().getColumn(0).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(1).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(2).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(3).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(4).setPreferredWidth(80);
			doctorScrollPane.setViewportView(doctorPatientList);
			doctorPatientsPanel.setLayout(gl_doctorPatientsPanel);

			/////////////////////////////////////////Doctor Account Management Tab
			doctorAccountPanel = new JPanel(); //doctor panel for account management
			addTab("Account Management", null, doctorAccountPanel, null);

			doctorManageSecurityQuestions = new JButton("Manage Security Questions?"); //creates new buttons
			doctorRecoverPassword = new JButton("Recover Password?");
			doctorChangePassword = new JButton("Change Password?");

			doctorManageSecurityQuestions.setForeground(new Color(0, 0, 102));
			doctorRecoverPassword.setForeground(new Color(0, 0, 102));
			doctorChangePassword.setForeground(new Color(0, 0, 102));

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
			doctorAccountPanel.setLayout(gl_doctorAccountPanel);
			
			doctorPaneEvents();//calls events method
		}

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
				model.addRow(new Object[]{temp.getId(), temp.getFirstName(), temp.getLastName(), temp.getNurseId(),temp.getLastCheckUp()});
				temp = temp.getNext();
			}
		}
		
		private void doctorPaneEvents()
		{
			btnDoctorEditInformation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
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
					
					name = br.readLine();
					id = br.readLine();
					email = br.readLine();
					phone = br.readLine();
					street = br.readLine();
					city=br.readLine();
					state = br.readLine();
					zip = br.readLine();
					
					email=newEmail;
					phone=newPhone;
					
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
					p2.getContentPane().add(spp); //adds the selectedPateintPane to a popup window
					p2.pack();
					System.out.println(fileName);
					p2.show();
					
				}
			});
			doctorChangePassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					//popUp p3=new popUp();
					changePassword cp=new changePassword(); //calls creatpasswrd panel
					//p3.getContentPane().add(cp); //addes it to popup window
					//p3.pack();
					//p3.show();
				}
			});
			doctorRecoverPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					//popUp p4=new popUp();
					passwordReset pr=new passwordReset(); //calls resetpassword Panel
					//p4.getContentPane().add(pr); //adds it to popUpwindow
					//p4.pack();
					//p4.show();
				}
			});
			doctorManageSecurityQuestions.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					//popUp p5=new popUp();
					securityQuestion sq=new securityQuestion(); //calls security question Panel
					//p5.getContentPane().add(sq); //calls secuity question Panel
					//p5.pack();
					//p5.show();
				}
			});

		}
}
