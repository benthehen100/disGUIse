import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;


public class nursePane extends JTabbedPane {
		private JPanel nurseContactPanel;
		private JPanel nursePatientsPanel;
		private JPanel nurseAccountPanel;
		private JLabel nurseContactNameLbl;
		private JLabel nurseContactIdLbl;
		private JLabel nurseContactDoctorLbl;
		private JLabel nurseContactDoctorIdLbl;
		private JLabel nurseContactEmailLbl;
		private JLabel nurseContactPhoneLbl;
		private JScrollPane nurseScrollPane;
		private JTable nursePatientList;
		private JButton nurseAddPatient;
		private JButton nurseSelectPatient;
		private JTextArea nurseAccountManagementBanner;
		private JButton nurseChangePassword;
		private JButton nurseRecoverPassword;
		private JButton nurseManageSecurityQuestions;
		private JTextArea nurseContactBanner;
		private JTextField nurseContactPanelNameInput;
		private JTextField nurseContactPanelIdInput;
		private JTextField nurseContactPanelDoctorInput;
		private JTextField nurseContactPanelDoctorIdInput;
		private JTextField nurseContactPanelEmailInput;
		private JTextField nurseContactPanelOfficePhoneInput;
		private JLabel label;
		private JLabel label_1;
		private JLabel label_2;
		private JLabel label_3;
		private JTextField nurseContactPanelOfficeZipInput;
		private JTextField nurseContactPanelOfficeStateInput;
		private JTextField nurseContactPanelOfficeStreetInput;
		private String name, id, doctor, doctorID, email, phone, street, state, zip;
		
		public void refreshPane(String username)
		{
			FileReader fr;
			try {
				fr = new FileReader(username);
			
			BufferedReader br = new BufferedReader(fr);
			name = br.readLine();
		
				id = br.readLine();
				doctor = br.readLine();
				doctorID = br.readLine();
				email = br.readLine();
				phone = br.readLine();
				street = br.readLine();
				state = br.readLine();
				zip = br.readLine();
			
			//people.printList();
			fr.close();
			
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			nurseContactPanelNameInput.setText(name);
			nurseContactPanelIdInput.setText(id);
			nurseContactPanelDoctorInput.setText(doctor);
			nurseContactPanelDoctorIdInput.setText(doctorID);
			nurseContactPanelEmailInput.setText(email);
			nurseContactPanelOfficePhoneInput.setText(phone);
			nurseContactPanelOfficeZipInput.setText(zip);
			nurseContactPanelOfficeStateInput.setText(state);
			nurseContactPanelOfficeStreetInput.setText(street);
			
			
			
		}
		
		public nursePane()
		{
			
			
			
			setTabPlacement(JTabbedPane.LEFT);
			nurseContactPanel = new JPanel();
			nurseContactPanel.setBorder(null);
			nurseContactPanel.setBackground(Color.WHITE);
			//nurseContactPanel.setVisible(true);
			addTab("Contact Information", null, nurseContactPanel, null);

			nurseContactBanner = new JTextArea();
			nurseContactBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			nurseContactBanner.setBackground(Color.WHITE);
			nurseContactBanner.setFont(new Font("Times New Roman", Font.BOLD, 13));
			nurseContactBanner.setForeground(new Color(0, 0, 102));
			nurseContactBanner.setText(" \t    Welcome\r\n\r\n            disGUIse Well-Check Clinic");

			nurseContactNameLbl = new JLabel("Name:");
			nurseContactIdLbl = new JLabel("ID:");
			nurseContactDoctorLbl = new JLabel("Doctor:");
			nurseContactDoctorIdLbl = new JLabel("Doctor ID:");
			nurseContactEmailLbl = new JLabel("Email Address:");
			nurseContactPhoneLbl = new JLabel("Office Phone:");
			
			nurseContactPanelNameInput = new JTextField();
			nurseContactPanelNameInput.setEditable(false);
			nurseContactPanelNameInput.setColumns(10);
			nurseContactPanelNameInput.setText("N/A");
			
			nurseContactPanelIdInput = new JTextField();
			nurseContactPanelIdInput.setEditable(false);
			nurseContactPanelIdInput.setColumns(10);
			nurseContactPanelIdInput.setText("N/A");
			
			nurseContactPanelDoctorInput = new JTextField();
			nurseContactPanelDoctorInput.setEditable(false);
			nurseContactPanelDoctorInput.setColumns(10);
			nurseContactPanelDoctorInput.setText("N/A");
			
			nurseContactPanelDoctorIdInput = new JTextField();
			nurseContactPanelDoctorIdInput.setEditable(false);
			nurseContactPanelDoctorIdInput.setColumns(10);
			nurseContactPanelDoctorIdInput.setText("N/A");
			
			nurseContactPanelEmailInput = new JTextField();
			nurseContactPanelEmailInput.setEditable(false);
			nurseContactPanelEmailInput.setColumns(10);
			nurseContactPanelEmailInput.setText("N/A");
			
			nurseContactPanelOfficePhoneInput = new JTextField();
			nurseContactPanelOfficePhoneInput.setEditable(false);
			nurseContactPanelOfficePhoneInput.setColumns(10);
			nurseContactPanelOfficePhoneInput.setText("N/A");
			
			label = new JLabel("Office Address:");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			
			label_1 = new JLabel("Street:");
			
			label_2 = new JLabel("State:");
			
			label_3 = new JLabel("Zip:");
			
			nurseContactPanelOfficeZipInput = new JTextField();
			nurseContactPanelOfficeZipInput.setEditable(false);
			nurseContactPanelOfficeZipInput.setColumns(10);
			
			nurseContactPanelOfficeStateInput = new JTextField();
			nurseContactPanelOfficeStateInput.setEditable(false);
			nurseContactPanelOfficeStateInput.setColumns(10);
			
			nurseContactPanelOfficeStreetInput = new JTextField();
			nurseContactPanelOfficeStreetInput.setEditable(false);
			nurseContactPanelOfficeStreetInput.setColumns(10);
			GroupLayout gl_nurseContactPanel = new GroupLayout(nurseContactPanel);
			gl_nurseContactPanel.setHorizontalGroup(
				gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(95)
						.addComponent(nurseContactBanner, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(10)
						.addComponent(nurseContactNameLbl, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(nurseContactPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(10)
						.addComponent(nurseContactIdLbl, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(nurseContactPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(10)
						.addComponent(nurseContactDoctorLbl, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(nurseContactPanelDoctorInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(10)
						.addComponent(nurseContactDoctorIdLbl, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(nurseContactPanelDoctorIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(10)
						.addComponent(nurseContactEmailLbl, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(nurseContactPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(10)
						.addComponent(nurseContactPhoneLbl, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addGap(10)
						.addComponent(nurseContactPanelOfficePhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(10)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(41)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
						.addGap(13)
						.addComponent(nurseContactPanelOfficeStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(45)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(19)
						.addComponent(nurseContactPanelOfficeStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(51)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGap(13)
						.addComponent(nurseContactPanelOfficeZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
			);
			gl_nurseContactPanel.setVerticalGroup(
				gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_nurseContactPanel.createSequentialGroup()
						.addGap(23)
						.addComponent(nurseContactBanner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(15)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_nurseContactPanel.createSequentialGroup()
								.addGap(3)
								.addComponent(nurseContactNameLbl))
							.addComponent(nurseContactPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(5)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_nurseContactPanel.createSequentialGroup()
								.addGap(3)
								.addComponent(nurseContactIdLbl))
							.addComponent(nurseContactPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(5)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_nurseContactPanel.createSequentialGroup()
								.addGap(3)
								.addComponent(nurseContactDoctorLbl))
							.addComponent(nurseContactPanelDoctorInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(8)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addComponent(nurseContactDoctorIdLbl)
							.addComponent(nurseContactPanelDoctorIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_nurseContactPanel.createSequentialGroup()
								.addGap(6)
								.addComponent(nurseContactEmailLbl))
							.addComponent(nurseContactPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(25)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_nurseContactPanel.createSequentialGroup()
								.addGap(6)
								.addComponent(nurseContactPhoneLbl))
							.addComponent(nurseContactPanelOfficePhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(23)
						.addComponent(label)
						.addGap(11)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_nurseContactPanel.createSequentialGroup()
								.addGap(6)
								.addComponent(label_1))
							.addComponent(nurseContactPanelOfficeStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(6)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_nurseContactPanel.createSequentialGroup()
								.addGap(6)
								.addComponent(label_2))
							.addComponent(nurseContactPanelOfficeStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(6)
						.addGroup(gl_nurseContactPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_nurseContactPanel.createSequentialGroup()
								.addGap(6)
								.addComponent(label_3))
							.addComponent(nurseContactPanelOfficeZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
			);
			nurseContactPanel.setLayout(gl_nurseContactPanel);
			
			nursePatientsPanel = new JPanel();
			addTab("Patient List", null, nursePatientsPanel, null);

			nurseScrollPane = new JScrollPane();
			nurseScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			nurseScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

			nurseAddPatient = new JButton("Add Patient");
			nurseSelectPatient = new JButton("Select Patient");

			GroupLayout gl_nursePatientsPanel = new GroupLayout(nursePatientsPanel);
			gl_nursePatientsPanel.setHorizontalGroup(
					gl_nursePatientsPanel.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_nursePatientsPanel.createSequentialGroup()
							.addGroup(gl_nursePatientsPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_nursePatientsPanel.createSequentialGroup()
											.addGap(70)
											.addComponent(nurseAddPatient)
											.addGap(97)
											.addComponent(nurseSelectPatient))
											.addGroup(gl_nursePatientsPanel.createSequentialGroup()
													.addContainerGap()
													.addComponent(nurseScrollPane, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)))
													.addContainerGap())
					);
			gl_nursePatientsPanel.setVerticalGroup(
					gl_nursePatientsPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_nursePatientsPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(nurseScrollPane, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_nursePatientsPanel.createParallelGroup(Alignment.BASELINE)
									.addComponent(nurseSelectPatient)
									.addComponent(nurseAddPatient))
									.addGap(43))
					);

			nursePatientList = new JTable();
			nursePatientList.setModel(new DefaultTableModel(
					new Object[][] {
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
							{null, null, null, null, null},
					},
					new String[] {
							"Patient ID:", "First Name:", "Last Name:", "Doctor ID:", "Last Checkup:"
					}
					));
			nursePatientList.getColumnModel().getColumn(0).setPreferredWidth(80);
			nursePatientList.getColumnModel().getColumn(1).setPreferredWidth(80);
			nursePatientList.getColumnModel().getColumn(2).setPreferredWidth(80);
			nursePatientList.getColumnModel().getColumn(3).setPreferredWidth(80);
			nursePatientList.getColumnModel().getColumn(4).setPreferredWidth(80);
			nurseScrollPane.setViewportView(nursePatientList);
			nursePatientsPanel.setLayout(gl_nursePatientsPanel);

			////////////////////////////////////AcountManagement Tab
			nurseAccountPanel = new JPanel();
			addTab("Account Management", null, nurseAccountPanel, null);

			nurseAccountManagementBanner = new JTextArea();
			nurseAccountManagementBanner.setEditable(false);
			nurseAccountManagementBanner.setFont(new Font("Times New Roman", Font.PLAIN, 18));
			nurseAccountManagementBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			nurseAccountManagementBanner.setForeground(new Color(0, 0, 102));
			nurseAccountManagementBanner.setText("         disGUIse Account Management");

			nurseChangePassword = new JButton("Change Password?");
			nurseRecoverPassword = new JButton("Recover Password?");
			nurseManageSecurityQuestions = new JButton("Manage Security Questions?");
			nurseChangePassword.setForeground(new Color(0, 0, 102));
			nurseRecoverPassword.setForeground(new Color(0, 0, 102));
			nurseManageSecurityQuestions.setForeground(new Color(0, 0, 102));

			GroupLayout gl_nurseAccountPanel = new GroupLayout(nurseAccountPanel);
			gl_nurseAccountPanel.setHorizontalGroup(
				gl_nurseAccountPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_nurseAccountPanel.createSequentialGroup()
						.addGap(54)
						.addGroup(gl_nurseAccountPanel.createParallelGroup(Alignment.LEADING)
							.addComponent(nurseManageSecurityQuestions)
							.addComponent(nurseRecoverPassword)
							.addComponent(nurseChangePassword)
							.addComponent(nurseAccountManagementBanner, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			gl_nurseAccountPanel.setVerticalGroup(
				gl_nurseAccountPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_nurseAccountPanel.createSequentialGroup()
						.addGap(11)
						.addComponent(nurseAccountManagementBanner, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addGap(56)
						.addComponent(nurseChangePassword)
						.addGap(18)
						.addComponent(nurseRecoverPassword)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(nurseManageSecurityQuestions)
						.addContainerGap(84, Short.MAX_VALUE))
			);
			gl_nurseAccountPanel.linkSize(SwingConstants.HORIZONTAL, new Component[] {nurseChangePassword, nurseRecoverPassword, nurseManageSecurityQuestions});
			nurseAccountPanel.setLayout(gl_nurseAccountPanel);
			nursePaneEvents();
		}
		private void nursePaneEvents()
		{
			nurseAddPatient.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					//when the nurse adds a patient
					popUp p1=new popUp();
					addPatientPanel ap=new addPatientPanel();
					p1.getContentPane().add(ap);
					p1.pack();
					p1.show();
				}
			});
			nurseSelectPatient.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					//when the nurse opens a patients profile
					popUp p2=new popUp();
					selectedPatientPane spp=new selectedPatientPane();
					p2.getContentPane().add(spp);
					p2.pack();
					p2.show();
				}
			});
			nurseChangePassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					popUp p3=new popUp();
					changePassword cp=new changePassword();
					p3.getContentPane().add(cp);
					p3.pack();
					p3.show();
				}
			});
			nurseRecoverPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					popUp p4=new popUp();
					passwordReset pr=new passwordReset();
					p4.getContentPane().add(pr);
					p4.pack();
					p4.show();
				}
			});
			nurseManageSecurityQuestions.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					popUp p5=new popUp();
					securityQuestion sq=new securityQuestion();
					p5.getContentPane().add(sq);
					p5.pack();
					p5.show();
				}
			});
		}
		
	}

