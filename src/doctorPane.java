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


public class doctorPane extends JTabbedPane{
	
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
		private String name, id, email, phone, address, state, zip;
		
		public doctorPane()
		{
			
			FileReader fr;
			try {
				fr = new FileReader("dbach.txt");
			
			BufferedReader br = new BufferedReader(fr);
			name = br.readLine();
		
				id = br.readLine();
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
			
			setTabPlacement(JTabbedPane.LEFT);
			doctorContactPanel = new JPanel();
			doctorContactPanel.setBorder(null);
			addTab("Contact Information", null, doctorContactPanel, null);

			doctorContactBanner = new JTextArea();
			doctorContactBanner.setBounds(89, 11, 263, 54);
			doctorContactBanner.setText(" \t    Welcome\r\n\r\n            disGUIse Well-Check Clinic");
			doctorContactBanner.setForeground(new Color(0, 0, 102));
			doctorContactBanner.setFont(new Font("Times New Roman", Font.BOLD, 13));
			doctorContactBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
			doctorContactBanner.setBackground(Color.WHITE);

			doctorContactDoctorLbl = new JLabel("Doctor:");
			doctorContactDoctorLbl.setBounds(34, 76, 67, 14);
			doctorContactDoctorIdLbl = new JLabel("Doctor ID:");
			doctorContactDoctorIdLbl.setBounds(34, 114, 67, 14);
			doctorContactEmailLbl = new JLabel("Email Address:");
			doctorContactEmailLbl.setBounds(34, 152, 93, 14);
			doctorContactPhoneLbl = new JLabel("Office Phone:");
			doctorContactPhoneLbl.setBounds(34, 226, 78, 14);
			
			doctorContactPanelDoctorInput = new JTextField();
			doctorContactPanelDoctorInput.setBounds(122, 76, 400, 20);
			doctorContactPanelDoctorInput.setEditable(false);
			doctorContactPanelDoctorInput.setColumns(10);
			doctorContactPanelDoctorInput.setText(name);
			
			doctorContactpanelIDInput = new JTextField();
			doctorContactpanelIDInput.setBounds(122, 114, 400, 20);
			doctorContactpanelIDInput.setEditable(false);
			doctorContactpanelIDInput.setColumns(10);
			doctorContactpanelIDInput.setText(id);
			
			doctorContactPanelEmailInput = new JTextField();
			doctorContactPanelEmailInput.setBounds(122, 152, 400, 20);
			doctorContactPanelEmailInput.setEditable(false);
			doctorContactPanelEmailInput.setColumns(10);
			doctorContactPanelEmailInput.setText(email);
			
			doctorContactPanelZipInput = new JTextField();
			doctorContactPanelZipInput.setBounds(122, 348, 400, 20);
			doctorContactPanelZipInput.setEditable(false);
			doctorContactPanelZipInput.setColumns(10);
			doctorContactPanelZipInput.setText(zip);
			
			doctorContactPanelStateInput = new JTextField();
			doctorContactPanelStateInput.setBounds(122, 322, 400, 20);
			doctorContactPanelStateInput.setEditable(false);
			doctorContactPanelStateInput.setColumns(10);
			doctorContactPanelStateInput.setText(state);
			
			doctorContactPanelStreetInput = new JTextField();
			doctorContactPanelStreetInput.setBounds(122, 296, 400, 20);
			doctorContactPanelStreetInput.setEditable(false);
			doctorContactPanelStreetInput.setColumns(10);
			doctorContactPanelStreetInput.setText(address);
			
			label = new JLabel("Office Address:");
			label.setBounds(34, 271, 118, 14);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			
			label_1 = new JLabel("Street:");
			label_1.setBounds(65, 302, 44, 14);
			
			label_2 = new JLabel("State:");
			label_2.setBounds(69, 328, 34, 14);
			
			label_3 = new JLabel("Zip:");
			label_3.setBounds(75, 354, 34, 14);
			
			doctorContactPanelOfficePhoneInput = new JTextField();
			doctorContactPanelOfficePhoneInput.setBounds(122, 226, 400, 20);
			doctorContactPanelOfficePhoneInput.setEditable(false);
			doctorContactPanelOfficePhoneInput.setColumns(10);
			doctorContactPanelOfficePhoneInput.setText(phone);
			
			doctorContactPanel.setLayout(null);
			doctorContactPanel.add(doctorContactBanner);
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
			doctorPatientsPanel = new JPanel();
			addTab("Patient List", null, doctorPatientsPanel, null);

			doctorAddPatient = new JButton("Add Patient");
			doctorSelectPatient = new JButton("Select Patient");

			doctorScrollPane = new JScrollPane();
			doctorScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			doctorScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

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

			doctorPatientList = new JTable();
			doctorPatientList.setModel(new DefaultTableModel(
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
							"Patient ID:", "Patient First:", "Patient Last:", "Nurse ID:", "Last Checkup:"
					}
					));
			doctorPatientList.getColumnModel().getColumn(0).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(1).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(2).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(3).setPreferredWidth(80);
			doctorPatientList.getColumnModel().getColumn(4).setPreferredWidth(80);
			doctorScrollPane.setViewportView(doctorPatientList);
			doctorPatientsPanel.setLayout(gl_doctorPatientsPanel);

			/////////////////////////////////////////Doctor Account Management Tab
			doctorAccountPanel = new JPanel();
			addTab("Account Management", null, doctorAccountPanel, null);

			doctorManageSecurityQuestions = new JButton("Manage Security Questions?");
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
									.addContainerGap(86, Short.MAX_VALUE))
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
							.addContainerGap(217, Short.MAX_VALUE))
					);
			doctorAccountPanel.setLayout(gl_doctorAccountPanel);
			doctorPaneEvents();
		}
		private void doctorPaneEvents()
		{
			doctorAddPatient.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) 
				{
					//when the doctor selects add patient
					popUp p1=new popUp();
					addPatientPanel ap=new addPatientPanel();
					p1.getContentPane().add(ap);
					p1.pack();
					p1.show();
				}
			});
			doctorSelectPatient.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					//when the doctor clicks on a patient profile
					popUp p1=new popUp();
					selectedPatientPane spp=new selectedPatientPane();
					p1.getContentPane().add(spp);
					p1.pack();
					p1.show();
					
				}
			});
			doctorChangePassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					popUp p2=new popUp();
					changePassword cp=new changePassword();
					p2.getContentPane().add(cp);
					p2.pack();
					p2.show();
				}
			});
			doctorRecoverPassword.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					popUp p1=new popUp();
					passwordReset pr=new passwordReset();
					p1.add(pr);
					p1.pack();
					p1.show();
				}
			});
			doctorManageSecurityQuestions.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					popUp p3=new popUp();
					securityQuestion sq=new securityQuestion();
					p3.getContentPane().add(sq);
					p3.pack();
					p3.show();
					
				}
			});

		}
}
