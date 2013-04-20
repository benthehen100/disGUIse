import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

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
		private String name, id, email, phone, address, state, zip, insurance, doctor;
		
		public doctorPane() //doctorpane class
		{

			
			setTabPlacement(JTabbedPane.LEFT); //sets the tabs to the left of pane
			
			doctorContactPanel = new JPanel(); //creates panel for doctor contactInfo
			doctorContactPanel.setBorder(null);
			addTab("Contact Information", null, doctorContactPanel, null); //adds panel to tabbed pane

			doctorContactBanner = new JTextArea(); //creates contactInfo Banner
			doctorContactBanner.setBounds(89, 11, 263, 54);
			doctorContactBanner.setText(" \t    Welcome\r\n\r\n            disGUIse Well-Check Clinic");
			doctorContactBanner.setForeground(new Color(0, 0, 102));
			doctorContactBanner.setFont(new Font("Times New Roman", Font.BOLD, 13));
			doctorContactBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			doctorContactBanner.setBackground(Color.WHITE);

			doctorContactDoctorLbl = new JLabel("Doctor:"); //creates labels
			doctorContactDoctorLbl.setBounds(34, 82, 67, 14);
			doctorContactDoctorIdLbl = new JLabel("Doctor ID:");
			doctorContactDoctorIdLbl.setBounds(34, 120, 67, 14);
			doctorContactEmailLbl = new JLabel("Email Address:");
			doctorContactEmailLbl.setBounds(34, 152, 93, 14);
			doctorContactPhoneLbl = new JLabel("Office Phone:");
			doctorContactPhoneLbl.setBounds(34, 226, 78, 14);
			
			doctorContactPanelDoctorInput = new JTextField(); //creates textboxes for contacInfo
			doctorContactPanelDoctorInput.setBounds(122, 76, 400, 20);
			doctorContactPanelDoctorInput.setEditable(false);
			doctorContactPanelDoctorInput.setColumns(10);
			doctorContactPanelDoctorInput.setText("N/A"); //sets the text for to the name in database
			
			doctorContactpanelIDInput = new JTextField();
			doctorContactpanelIDInput.setBounds(122, 114, 400, 20);
			doctorContactpanelIDInput.setEditable(false);
			doctorContactpanelIDInput.setColumns(10);
			doctorContactpanelIDInput.setText("N/A");	//sets the text for to the ID in database
			
			doctorContactPanelEmailInput = new JTextField();
			doctorContactPanelEmailInput.setBounds(122, 146, 400, 20);
			doctorContactPanelEmailInput.setEditable(false);
			doctorContactPanelEmailInput.setColumns(10);
			doctorContactPanelEmailInput.setText("N/A");	//sets the text for to the email in database
			
			doctorContactPanelZipInput = new JTextField();
			doctorContactPanelZipInput.setBounds(122, 348, 400, 20);
			doctorContactPanelZipInput.setEditable(false);
			doctorContactPanelZipInput.setColumns(10);
			doctorContactPanelZipInput.setText("N/A");	//sets the text for to the zip in database
			
			doctorContactPanelStateInput = new JTextField();
			doctorContactPanelStateInput.setBounds(122, 322, 400, 20);
			doctorContactPanelStateInput.setEditable(false);
			doctorContactPanelStateInput.setColumns(10);
			doctorContactPanelStateInput.setText("N/A");	//sets the text for to the state in database
			
			doctorContactPanelStreetInput = new JTextField();
			doctorContactPanelStreetInput.setBounds(122, 296, 400, 20);
			doctorContactPanelStreetInput.setEditable(false);
			doctorContactPanelStreetInput.setColumns(10);
			doctorContactPanelStreetInput.setText("N/A");	//sets the text for to the address in database
			
			label = new JLabel("Office Address:"); //creates new labels for address
			label.setBounds(34, 271, 118, 14);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			
			label_1 = new JLabel("Street:");
			label_1.setBounds(65, 302, 44, 14);
			label_2 = new JLabel("State:");
			label_2.setBounds(69, 328, 34, 14);
			label_3 = new JLabel("Zip:");
			label_3.setBounds(75, 354, 34, 14);
			
			doctorContactPanelOfficePhoneInput = new JTextField(); //input for phone
			doctorContactPanelOfficePhoneInput.setBounds(122, 226, 400, 20);
			doctorContactPanelOfficePhoneInput.setEditable(false);
			doctorContactPanelOfficePhoneInput.setColumns(10);
			doctorContactPanelOfficePhoneInput.setText("N/A");
			
			doctorContactPanel.setLayout(null); //sets layout to absolute
			doctorContactPanel.add(doctorContactBanner); //adds components
			doctorContactPanel.add(doctorContactDoctorLbl);
			doctorContactPanel.add(doctorContactPanelDoctorInput);
			doctorContactPanel.add(doctorContactDoctorIdLbl);
			doctorContactPanel.add(doctorContactpanelIDInput);
			doctorContactPanel.add(doctorContactEmailLbl);
			doctorContactPanel.add(doctorContactPanelEmailInput);
			doctorContactPanel.add(label);
			doctorContactPanel.add(label_2);
			doctorContactPanel.add(doctorContactPanelStateInput);
			doctorContactPanel.add(label_3);
			doctorContactPanel.add(doctorContactPanelZipInput);
			doctorContactPanel.add(doctorContactPhoneLbl);
			doctorContactPanel.add(doctorContactPanelOfficePhoneInput);
			doctorContactPanel.add(label_1);
			doctorContactPanel.add(doctorContactPanelStreetInput);

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
							"Patient ID:", "Patient First:", "Patient Last:", "Nurse ID:", "Last Checkup:" //table columns
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
			
				FileReader fr; //reads data from file
				try {
					fr = new FileReader(file);
				
				BufferedReader br = new BufferedReader(fr);
				name = br.readLine();
			
					id = br.readLine(); //sets lines to variables
					email = br.readLine();
					phone = br.readLine();
					address = br.readLine();
					state = br.readLine();
					zip = br.readLine();
				
				//people.printList();
				fr.close();
				
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				doctorContactPanelStreetInput.setText(address);
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
			doctorAddPatient.addActionListener(new ActionListener() { //when add pateint is selcted
				public void actionPerformed(ActionEvent arg0) 
				{
					//when the doctor selects add patient
					popUp p1=new popUp(); //creates new pop
					addPatientPanel ap=new addPatientPanel(); //creates new add patient panel
					p1.getContentPane().add(ap);  //adds addpateientPanel to popup window
					p1.pack();
					p1.show();
				}
			});
			doctorSelectPatient.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					//when the doctor clicks on a patient profile
					popUp p2=new popUp();
					selectedPatientPane spp=new selectedPatientPane(); //calls selected patient
					System.out.println("patient: " + doctorPatientList.getValueAt(doctorPatientList.getSelectedRow(), 0));
					String fileName = doctorPatientList.getValueAt(doctorPatientList.getSelectedRow(), 0)+ ".txt";
					spp.refreshPanel(fileName);
					p2.getContentPane().add(spp); //adds the selectedPateintPane to a popup window
					p2.pack();
					System.out.println(fileName);
					p2.show();
					
				}
			});
			doctorChangePassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					popUp p3=new popUp();
					changePassword cp=new changePassword(); //calls creatpasswrd panel
					p3.getContentPane().add(cp); //addes it to popup window
					p3.pack();
					p3.show();
				}
			});
			doctorRecoverPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					popUp p4=new popUp();
					passwordReset pr=new passwordReset(); //calls resetpassword Panel
					p4.getContentPane().add(pr); //adds it to popUpwindow
					p4.pack();
					p4.show();
				}
			});
			doctorManageSecurityQuestions.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					popUp p5=new popUp();
					securityQuestion sq=new securityQuestion(); //calls security question Panel
					p5.getContentPane().add(sq); //calls secuity question Panel
					p5.pack();
					p5.show();
				}
			});

		}
}
