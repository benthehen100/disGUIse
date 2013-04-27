import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class patientPane extends JTabbedPane
{
	private JPanel patientContactPanel;
	private JPanel patientAccountPanel;
	private JTextArea patientContactBanner;
	private JLabel patientContactOffPhoneLbl;
	private JLabel patientContactDoctorLbl;
	private JLabel patientContactOffAddLbl;
	private JTabbedPane patientRecordsPane;
	private JPanel patientHealthRecordsPanel;
	private JLabel patientContactNameLbl;
	private JLabel patientContactIdLbl;
	private JLabel patientContactPhoneLbl;
	private JLabel patientContactEmailLbl;
	private JLabel patientContactAddressLbl;
	private JLabel patientContactInsuranceLbl;
	private JPanel patientUpdateIndicatorsPanel;
	private JPanel patientVisualIndicatorsPanel;
	private JPanel patientPrescriptionsPanel;
	private JScrollPane patientsHealthRecordsScrollPane;
	private JTable patientsHealthRecordsTable;
	private JScrollPane patientPrescriptionsScrollPane;
	private JTable patientsPrescriptionsTable;
	private JTextArea patientAccountManagementBanner;
	private JButton patientChangePassword;
	private JButton patientRecoverPassword;
	private JButton patientManageSecurityQuestions;
	private JTextField HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput;
	private JTextField HealthRecordsPanelUpdateIndicatorsPanelPressureInput1;
	private JTextField HealthRecordsPanelUpdateIndicatorsPanelPressureInput2;
	private JTextField HealthRecordsPanelUpdateIndicatorsPanelWeightInput;
	private JTextField textField_4;
	private JTextField patientContactPanelNameInput;
	private JTextField patientContactPanelIdInput;
	private JTextField patientContactPanelPatientPhoneInput;
	private JTextField patientContactPanelEmailInput;
	private JTextField patientContactPanelStreetInput;
	private JTextField patientContactPanelStateInput;
	private JTextField patientContactPanelZipInput;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JTextField patientContactPanelInsuranceInput;
	private JTextField patientContactPanelDoctorInput;
	private JTextField patientContactPanelOfficePhoneInput;
	private JTextField patientContactPanelOfficeStreetInput;
	private JTextField patientContactPanelOfficeStateInput;
	private JTextField patientContactPanelOfficeZipInput;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private String fName, id, email, phone, street, state, zip, insurance, doctor, nurse, doctorFile, lName, city, patientid;
	String weightInput, dateInput, pressureInput1, pressureInput2, glucoseInput;
	private JTextField patientContactPanelOfficeInput;
	private JLabel lblCity_1;
	private JTextField patientContactPanelCityInput;
	private JLabel lblCity;
	private JLabel lblLastName;
	private JTextField patientContactPanelLastNameInput;
	private JButton btnPatientEditInformation;
	private JButton btnPatientAcceptInfo;
	private JButton HealthRecordsPanelUpdateIndicatorsPanelSubmit;
	private String user, userText;
	private JTextField updateIndicatorsPanelDateInput;
	
	public void refreshPanel(String file)
	{
		userText = file;
		user = userText.replaceAll(".txt", "");
		FileReader fr; //reads data from file
		
		try {
			fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		fName = br.readLine();
		lName = br.readLine();
			patientid = br.readLine(); //sets lines to variables
			street = br.readLine();
			city = br.readLine();
			state = br.readLine();
			zip = br.readLine();
			nurse = br.readLine();
			doctor = br.readLine();
			insurance = br.readLine();
			email = br.readLine();
			phone = br.readLine();
		
		//people.printList();
		fr.close();
		
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		doctorFile = doctor + ".txt";
		patientContactPanelNameInput.setText(fName);
		patientContactPanelLastNameInput.setText(lName);
		patientContactPanelIdInput.setText(id);
		patientContactPanelPatientPhoneInput.setText(phone);
		patientContactPanelEmailInput.setText(email);
		patientContactPanelStreetInput.setText(street);
		patientContactPanelStateInput.setText(state);
		patientContactPanelCityInput.setText(city);
		patientContactPanelZipInput.setText(zip);
		patientContactPanelInsuranceInput.setText(insurance);
		patientContactPanelDoctorInput.setText(doctor);
		
		FileReader fr2; //reads data from file
		try {
			fr2 = new FileReader("dbach.txt"); // temporary fix, every patient will call on this file...or at least until a list of doctors is created to link each doctor to a text file.
		
		BufferedReader br2 = new BufferedReader(fr2);
		fName = br2.readLine();
	
			id = br2.readLine(); //sets lines to variables
			email = br2.readLine();
			phone = br2.readLine();
			street = br2.readLine();
			city = br2.readLine();
			state = br2.readLine();
			zip = br2.readLine();
		
		//people.printList();
		fr2.close();
		
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		patientContactPanelOfficeInput.setText(city);
		patientContactPanelOfficePhoneInput.setText(phone);
		patientContactPanelOfficeStreetInput.setText(street);
		patientContactPanelOfficeStateInput.setText(state);
		patientContactPanelOfficeZipInput.setText(zip);
	}

	public patientPane()
	{
		
		setTabPlacement(LEFT);
		patientRecordsPane = new JTabbedPane(JTabbedPane.TOP);
		patientAccountPanel = new JPanel();
		patientContactPanel = new JPanel();
		
				addTab("Patient Information", null, patientContactPanel, null);
				//////////////////////////////////////////////////////////////////////////
				patientContactBanner = new JTextArea();
				patientContactBanner.setTabSize(5);
				patientContactBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				patientContactBanner.setEditable(false);
				patientContactBanner.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				patientContactBanner.setForeground(new Color(0, 0, 128));
				patientContactBanner.setText("\tWelcome\r\n  disGUIse Well-Check Clinic");
				
						patientContactNameLbl = new JLabel("First Name:");
						patientContactIdLbl = new JLabel("Patient ID:");
						patientContactPhoneLbl = new JLabel("Telephone:");
						patientContactEmailLbl = new JLabel("Email Address:");
						patientContactAddressLbl = new JLabel("Address:");
						patientContactInsuranceLbl = new JLabel("Insurance:");
						patientContactInsuranceLbl.setHorizontalAlignment(SwingConstants.CENTER);
						patientContactOffPhoneLbl = new JLabel("Office Telephone:");
						patientContactOffPhoneLbl.setHorizontalAlignment(SwingConstants.CENTER);
						patientContactDoctorLbl = new JLabel("Doctor:");
						patientContactDoctorLbl.setHorizontalAlignment(SwingConstants.CENTER);
						patientContactOffAddLbl = new JLabel("Office Address:");
						patientContactOffAddLbl.setHorizontalAlignment(SwingConstants.CENTER);
						
						patientContactPanelNameInput = new JTextField();
						patientContactPanelNameInput.setEditable(false);
						patientContactPanelNameInput.setColumns(10);
						
						patientContactPanelIdInput = new JTextField();
						patientContactPanelIdInput.setEditable(false);
						patientContactPanelIdInput.setColumns(10);
						
						patientContactPanelPatientPhoneInput = new JTextField();
						patientContactPanelPatientPhoneInput.setEditable(false);
						patientContactPanelPatientPhoneInput.setColumns(10);
						
						patientContactPanelEmailInput = new JTextField();
						patientContactPanelEmailInput.setEditable(false);
						patientContactPanelEmailInput.setColumns(10);
						
						patientContactPanelStreetInput = new JTextField();
						patientContactPanelStreetInput.setEditable(false);
						patientContactPanelStreetInput.setColumns(10);
						
						patientContactPanelStateInput = new JTextField();
						patientContactPanelStateInput.setEditable(false);
						patientContactPanelStateInput.setColumns(10);
						
						patientContactPanelZipInput = new JTextField();
						patientContactPanelZipInput.setEditable(false);
						patientContactPanelZipInput.setColumns(10);
						
						label_6 = new JLabel("Zip:");
						
						label_7 = new JLabel("State:");
						
						label_8 = new JLabel("Street:");
						
						patientContactPanelInsuranceInput = new JTextField();
						patientContactPanelInsuranceInput.setEditable(false);
						patientContactPanelInsuranceInput.setHorizontalAlignment(SwingConstants.CENTER);
						patientContactPanelInsuranceInput.setColumns(10);
						
						patientContactPanelDoctorInput = new JTextField();
						patientContactPanelDoctorInput.setEditable(false);
						patientContactPanelDoctorInput.setHorizontalAlignment(SwingConstants.CENTER);
						patientContactPanelDoctorInput.setColumns(10);
						
						patientContactPanelOfficePhoneInput = new JTextField();
						patientContactPanelOfficePhoneInput.setEditable(false);
						patientContactPanelOfficePhoneInput.setHorizontalAlignment(SwingConstants.CENTER);
						patientContactPanelOfficePhoneInput.setColumns(10);
						
						patientContactPanelOfficeStreetInput = new JTextField();
						patientContactPanelOfficeStreetInput.setEditable(false);
						patientContactPanelOfficeStreetInput.setColumns(10);
						
						patientContactPanelOfficeStateInput = new JTextField();
						patientContactPanelOfficeStateInput.setEditable(false);
						patientContactPanelOfficeStateInput.setColumns(10);
						
						patientContactPanelOfficeZipInput = new JTextField();
						patientContactPanelOfficeZipInput.setEditable(false);
						patientContactPanelOfficeZipInput.setColumns(10);
						
						label_9 = new JLabel("Zip:");
						
						label_10 = new JLabel("State:");
						
						label_11 = new JLabel("Street:");
						
						patientContactPanelOfficeInput = new JTextField();
						patientContactPanelOfficeInput.setEditable(false);
						patientContactPanelOfficeInput.setColumns(10);
						
						lblCity_1 = new JLabel("City:");
						
						patientContactPanelCityInput = new JTextField();
						patientContactPanelCityInput.setEditable(false);
						patientContactPanelCityInput.setColumns(10);
						
						lblCity = new JLabel("City:");
						
						lblLastName = new JLabel("Last Name:");
						
						patientContactPanelLastNameInput = new JTextField();
						patientContactPanelLastNameInput.setEditable(false);
						patientContactPanelLastNameInput.setColumns(10);
						
						btnPatientEditInformation = new JButton("Edit Information");
						btnPatientAcceptInfo = new JButton("Accept");
						
						GroupLayout gl_patientContactPanel = new GroupLayout(patientContactPanel);
						gl_patientContactPanel.setHorizontalGroup(
							gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_patientContactPanel.createSequentialGroup()
									.addGap(100)
									.addComponent(patientContactBanner, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_patientContactPanel.createSequentialGroup()
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(10)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(patientContactNameLbl, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactIdLbl)
												.addComponent(patientContactPhoneLbl)
												.addComponent(patientContactEmailLbl))
											.addGap(14)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(patientContactPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelLastNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(51)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(label_6)
												.addComponent(label_7)
												.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_8))
											.addGap(10)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(patientContactPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(20)
											.addComponent(patientContactAddressLbl)))
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(79)
													.addComponent(patientContactInsuranceLbl))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(89)
													.addComponent(patientContactDoctorLbl))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(47)
													.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
														.addComponent(btnPatientEditInformation)
														.addComponent(patientContactOffPhoneLbl))))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(patientContactPanelOfficePhoneInput)
												.addComponent(patientContactPanelDoctorInput)
												.addComponent(patientContactPanelInsuranceInput)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addComponent(btnPatientAcceptInfo, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED))))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(69)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(31)
													.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
														.addComponent(label_9)
														.addComponent(label_10)
														.addComponent(lblCity_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
														.addComponent(label_11))
													.addGap(4)
													.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
														.addComponent(patientContactPanelOfficeZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(patientContactPanelOfficeStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(patientContactPanelOfficeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(patientContactPanelOfficeStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addComponent(patientContactOffAddLbl))))
									.addGap(57))
						);
						gl_patientContactPanel.setVerticalGroup(
							gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_patientContactPanel.createSequentialGroup()
									.addGap(11)
									.addComponent(patientContactBanner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactNameLbl))
										.addComponent(patientContactPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactInsuranceLbl))
										.addComponent(patientContactPanelInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(8)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(lblLastName))
										.addComponent(patientContactPanelLastNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(6)
											.addComponent(patientContactDoctorLbl))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactPanelDoctorInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(13)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactIdLbl))
										.addComponent(patientContactPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(8)
											.addComponent(patientContactOffPhoneLbl))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(5)
											.addComponent(patientContactPanelOfficePhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(6)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactPhoneLbl))
										.addComponent(patientContactPanelPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(11)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(3)
													.addComponent(patientContactEmailLbl))
												.addComponent(patientContactPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(9)
											.addComponent(patientContactAddressLbl)
											.addGap(8)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(3)
													.addComponent(label_8))
												.addComponent(patientContactPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(6)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(3)
													.addComponent(lblCity))
												.addComponent(patientContactPanelCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(8)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(3)
													.addComponent(label_7))
												.addComponent(patientContactPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(6)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(3)
													.addComponent(label_6))
												.addComponent(patientContactPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addComponent(patientContactOffAddLbl)
											.addGap(8)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(6)
													.addComponent(label_11))
												.addComponent(patientContactPanelOfficeStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(6)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(6)
													.addComponent(lblCity_1))
												.addComponent(patientContactPanelOfficeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(8)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(6)
													.addComponent(label_10))
												.addComponent(patientContactPanelOfficeStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(6)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(6)
													.addComponent(label_9))
												.addComponent(patientContactPanelOfficeZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnPatientEditInformation)
										.addComponent(btnPatientAcceptInfo))
									.addContainerGap())
						);
						patientContactPanel.setLayout(gl_patientContactPanel);
		addTab("Health Records", null, patientRecordsPane, null);
		addTab("Account Management", null, patientAccountPanel, null);

		////////////////////////////////////////////////////////////////////////////////////HealthRecords Tab
		patientHealthRecordsPanel = new JPanel();
		patientRecordsPane.addTab("Health Records", null, patientHealthRecordsPanel, null);

		patientsHealthRecordsScrollPane = new JScrollPane();
		patientsHealthRecordsScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		patientsHealthRecordsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		patientsHealthRecordsTable = new JTable();
		patientsHealthRecordsTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Date:", "Weight:", "Blood Pressure:", "Glucose:"
				}
				));
		patientsHealthRecordsTable.getColumnModel().getColumn(0).setPreferredWidth(100);
		patientsHealthRecordsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		patientsHealthRecordsTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		patientsHealthRecordsTable.getColumnModel().getColumn(3).setPreferredWidth(100);
		patientsHealthRecordsScrollPane.setViewportView(patientsHealthRecordsTable);
		GroupLayout gl_patientHealthRecordsPanel = new GroupLayout(patientHealthRecordsPanel);
		gl_patientHealthRecordsPanel.setHorizontalGroup(
			gl_patientHealthRecordsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientHealthRecordsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(patientsHealthRecordsScrollPane, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_patientHealthRecordsPanel.setVerticalGroup(
			gl_patientHealthRecordsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientHealthRecordsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(patientsHealthRecordsScrollPane, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
					.addContainerGap())
		);
		patientHealthRecordsPanel.setLayout(gl_patientHealthRecordsPanel);

		patientUpdateIndicatorsPanel = new JPanel();
		patientRecordsPane.addTab("Update Indicators", null, patientUpdateIndicatorsPanel, null);
		
		HealthRecordsPanelUpdateIndicatorsPanelSubmit = new JButton("Submit");
		JLabel label = new JLabel("mg/dL");
		HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput = new JTextField(5);
		JLabel label_1 = new JLabel("Blood Glucose");
		JLabel label_2 = new JLabel("Blood Pressure");
		HealthRecordsPanelUpdateIndicatorsPanelPressureInput1 = new JTextField(5);
		HealthRecordsPanelUpdateIndicatorsPanelPressureInput2 = new JTextField(5);
		JLabel label_3 = new JLabel("DIA");
		JLabel label_4 = new JLabel("lbs");
		HealthRecordsPanelUpdateIndicatorsPanelWeightInput = new JTextField(5);
		JLabel label_5 = new JLabel("Weight");
		textField_4 = new JTextField(10);
		textField_4.setText("Update the textboxes with your Health Indicators, Submit to save.");
		textField_4.setEditable(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\t\tUpdate Health Indicators\r\n\r\n");
		textArea.setTabSize(5);
		textArea.setForeground(new Color(0, 0, 102));
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		JLabel lblDate = new JLabel("Date");
		
		updateIndicatorsPanelDateInput = new JTextField(5);
		
		JLabel lblXxxxxxxx = new JLabel("xx/xx/xxxx");
		GroupLayout gl_patientUpdateIndicatorsPanel = new GroupLayout(patientUpdateIndicatorsPanel);
		gl_patientUpdateIndicatorsPanel.setHorizontalGroup(
			gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5)
								.addComponent(label_2)
								.addComponent(label_1))
							.addGap(10)
							.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(updateIndicatorsPanelDateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(HealthRecordsPanelUpdateIndicatorsPanelWeightInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(HealthRecordsPanelUpdateIndicatorsPanelPressureInput1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
									.addGap(4)
									.addComponent(lblXxxxxxxx, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
									.addGap(4)
									.addComponent(label_4))
								.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
									.addGap(33)
									.addComponent(HealthRecordsPanelUpdateIndicatorsPanelPressureInput2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(label_3))
								.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
									.addGap(4)
									.addComponent(label)
									.addGap(18)
									.addComponent(HealthRecordsPanelUpdateIndicatorsPanelSubmit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))))
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
					.addGap(58))
		);
		gl_patientUpdateIndicatorsPanel.setVerticalGroup(
			gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
					.addGap(24)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblDate))
						.addComponent(updateIndicatorsPanelDateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblXxxxxxxx)))
					.addGap(22)
					.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addComponent(HealthRecordsPanelUpdateIndicatorsPanelWeightInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4)))
					.addGap(18)
					.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(HealthRecordsPanelUpdateIndicatorsPanelPressureInput1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(HealthRecordsPanelUpdateIndicatorsPanelPressureInput2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_3)))
					.addGap(18)
					.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addComponent(HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label))
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(HealthRecordsPanelUpdateIndicatorsPanelSubmit))))
		);
		patientUpdateIndicatorsPanel.setLayout(gl_patientUpdateIndicatorsPanel);

		patientVisualIndicatorsPanel = new JPanel();
		patientPrescriptionsPanel = new JPanel();

		patientRecordsPane.addTab("Visual Indicators", null, patientVisualIndicatorsPanel, null);
		GroupLayout gl_patientVisualIndicatorsPanel = new GroupLayout(patientVisualIndicatorsPanel);
		gl_patientVisualIndicatorsPanel.setHorizontalGroup(
			gl_patientVisualIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 520, Short.MAX_VALUE)
		);
		gl_patientVisualIndicatorsPanel.setVerticalGroup(
			gl_patientVisualIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 417, Short.MAX_VALUE)
		);
		patientVisualIndicatorsPanel.setLayout(gl_patientVisualIndicatorsPanel);
		patientRecordsPane.addTab("Prescriptions", null, patientPrescriptionsPanel, null);

		patientPrescriptionsScrollPane = new JScrollPane();
		patientPrescriptionsScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		patientPrescriptionsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		patientsPrescriptionsTable = new JTable();
		patientsPrescriptionsTable.setModel(new DefaultTableModel(
				new Object[][] {
						
				},
				new String[] {
						"Date:", "Prescription", "Comments"
				}
				));
		patientsPrescriptionsTable.getColumnModel().getColumn(1).setPreferredWidth(140);
		patientsPrescriptionsTable.getColumnModel().getColumn(2).setPreferredWidth(420);
		patientPrescriptionsScrollPane.setViewportView(patientsPrescriptionsTable);
		GroupLayout gl_patientPrescriptionsPanel = new GroupLayout(patientPrescriptionsPanel);
		gl_patientPrescriptionsPanel.setHorizontalGroup(
			gl_patientPrescriptionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientPrescriptionsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(patientPrescriptionsScrollPane, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_patientPrescriptionsPanel.setVerticalGroup(
			gl_patientPrescriptionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientPrescriptionsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(patientPrescriptionsScrollPane, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
					.addContainerGap())
		);
		patientPrescriptionsPanel.setLayout(gl_patientPrescriptionsPanel);
		//////////////////////////////////////////////////////////////////////
		patientAccountManagementBanner = new JTextArea();
		patientAccountManagementBanner.setBounds(49, 26, 327, 46);
		patientAccountManagementBanner.setText("         disGUIse Account Management");
		patientAccountManagementBanner.setForeground(new Color(0, 0, 102));
		patientAccountManagementBanner.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		patientAccountManagementBanner.setEditable(false);
		patientAccountManagementBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));

		patientChangePassword = new JButton("Change Password?");
		patientChangePassword.setBounds(49, 128, 188, 23);
		patientRecoverPassword = new JButton("Recover Password?");
		patientRecoverPassword.setBounds(49, 169, 188, 23);
		patientManageSecurityQuestions = new JButton("Manage Security Questions?");
		patientManageSecurityQuestions.setBounds(49, 203, 188, 23);

		patientChangePassword.setForeground(new Color(0, 0, 102));
		patientRecoverPassword.setForeground(new Color(0, 0, 102));
		patientManageSecurityQuestions.setForeground(new Color(0, 0, 102));
		patientAccountPanel.setLayout(null);
		patientAccountPanel.add(patientAccountManagementBanner);
		patientAccountPanel.add(patientChangePassword);
		patientAccountPanel.add(patientRecoverPassword);
		patientAccountPanel.add(patientManageSecurityQuestions);
		patientPaneEvents();
	}
	private void patientPaneEvents()
	{
		HealthRecordsPanelUpdateIndicatorsPanelSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Updates patient indicators when 'Submit' is clicked
				
				String patientIndicatorFile; // Establishes variable for patient file
				
				System.out.println("Current patient: " + user); // console test
				
				// Fields are not editable after clicking the 'Submit' button
				updateIndicatorsPanelDateInput.setEditable(false);
				HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput.setEditable(false);
				HealthRecordsPanelUpdateIndicatorsPanelPressureInput1.setEditable(false);
				HealthRecordsPanelUpdateIndicatorsPanelPressureInput2.setEditable(false);
				HealthRecordsPanelUpdateIndicatorsPanelWeightInput.setEditable(false);
				
				// Defines patientIndicatorFile
				patientIndicatorFile = user + "indicators.txt";
				
				System.out.println("Current file: " + patientIndicatorFile); // console test
				
				try
				{
				File file1 = new File(patientIndicatorFile);
				
				// Creates new indicator file if one is not present already
				if (!file1.exists()) {
					file1.createNewFile();
				}
				
				BufferedReader br_ind = new BufferedReader(new FileReader(file1));
				
				// Reads information from text fields
				String newDateInput = updateIndicatorsPanelDateInput.getText();
				String newWeightInput = HealthRecordsPanelUpdateIndicatorsPanelWeightInput.getText();
				String newPressureInput1 = HealthRecordsPanelUpdateIndicatorsPanelPressureInput1.getText();
				String newPressureInput2 = HealthRecordsPanelUpdateIndicatorsPanelPressureInput2.getText();
				String newGlucoseInput = HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput.getText();
				
				// Sets text field information to variables
				dateInput = newDateInput;
				weightInput = newWeightInput;
				pressureInput1 = newPressureInput1;
				pressureInput2 = newPressureInput2;
				glucoseInput = newGlucoseInput;
				
				// Appends new indicators to end of old file
				FileWriter fw_ind=new FileWriter(patientIndicatorFile, true);
				fw_ind.write(dateInput + "\n");
				fw_ind.write(weightInput + "\n");
				fw_ind.write(pressureInput1 + "\n");
				fw_ind.write(pressureInput2 + "\n");
				fw_ind.write(glucoseInput + "\n");

				fw_ind.flush();
				fw_ind.close();
				br_ind.close();
				
				}catch (Throwable e1) {
					e1.printStackTrace();
				}
				refreshIndicatorTable(patientid);
			}
		});
		btnPatientEditInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				patientContactPanelPatientPhoneInput.setEditable(true);
				patientContactPanelEmailInput.setEditable(true);
				patientContactPanelStreetInput.setEditable(true);
				patientContactPanelCityInput.setEditable(true);
				patientContactPanelStateInput.setEditable(true);
				patientContactPanelZipInput.setEditable(true);
			}
		});
		btnPatientAcceptInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//updates file
				patientContactPanelPatientPhoneInput.setEditable(false);
				patientContactPanelEmailInput.setEditable(false);
				patientContactPanelStreetInput.setEditable(false);
				patientContactPanelCityInput.setEditable(false);
				patientContactPanelStateInput.setEditable(false);
				patientContactPanelZipInput.setEditable(false);
				
				try
				{
				File file=new File(user);
				BufferedReader br=new BufferedReader(new FileReader(file));


				String newPhone=patientContactPanelPatientPhoneInput.getText();
				String newEmail=patientContactPanelEmailInput.getText();
				String newStreet=patientContactPanelStreetInput.getText();
				String newCity=patientContactPanelCityInput.getText();
				String newState=patientContactPanelStateInput.getText();
				String newZip=patientContactPanelZipInput.getText();

				fName = br.readLine();
				lName = br.readLine();
				id = br.readLine(); //sets lines to variables
				street = br.readLine();
				city = br.readLine();
				state = br.readLine();
				zip = br.readLine();
				nurse = br.readLine();
				doctor = br.readLine();
				insurance = br.readLine();
				email = br.readLine();
				phone = br.readLine();


				phone=newPhone;
				email=newEmail;
				street=newStreet;
				city=newCity;
				state=newState;
				zip=newZip;

				FileWriter fr=new FileWriter(file);
				fr.write(fName+"\n");
				fr.write(lName+"\n");
				fr.write(id+"\n");
				fr.write(street+"\n");
				fr.write(city+"\n");
				fr.write(state+"\n");
				fr.write(zip+"\n");
				fr.write(nurse+"\n");
				fr.write(doctor+"\n");
				fr.write(insurance+"\n");
				fr.write(email+"\n");
				fr.write(phone+"\n");

				fr.close();

				}catch (Throwable e1) {
					e1.printStackTrace();
				}
			}
		});
		
		patientChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//popUp p3=new popUp();
				changePassword cp=new changePassword();
				//p3.getContentPane().add(cp);
				//p3.pack();
				//p3.show();
			}
		});
		patientRecoverPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//popUp p4=new popUp();
				passwordReset pr=new passwordReset();
				//p4.getContentPane().add(pr);
				//p4.pack();
				//p4.show();
			}
		});
		patientManageSecurityQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//popUp p5=new popUp();
				securityQuestion sq=new securityQuestion();
				//p5.getContentPane().add(sq);
				//p5.pack();
				//p5.show();
			}
		});
	}
	
	public void refreshPrescriptionTable(String file)
	{
		DefaultTableModel model = (DefaultTableModel) patientsPrescriptionsTable.getModel();
		String date, drug, comment;
		
		String fileName = file + "prescriptions.txt";
		FileReader fr; //reads data from file
		

		try {
			fr = new FileReader(fileName);
		
			BufferedReader br = new BufferedReader(fr);

			
			while( (date = br.readLine()) != null)
			{
				drug = br.readLine(); //sets lines to variables
				comment = br.readLine();
				model.addRow(new Object[]{date, drug, comment});
			}
				
			
		fr.close();
		
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void refreshIndicatorTable(String file)
	{
		DefaultTableModel model = (DefaultTableModel) patientsHealthRecordsTable.getModel(); //clears the table, before table is repopulated;
		for(int i = 0; i < model.getRowCount(); i++)
		{
			model.removeRow(i);
		}
		String date, weight, blood1, blood2, glucose;
		
		String fileName = file + "indicators.txt";
		FileReader fr; //reads data from file
		

		try {
			fr = new FileReader(fileName);
		
			BufferedReader br = new BufferedReader(fr);

			
			while( (date = br.readLine()) != null)
			{
				weight = br.readLine(); //sets lines to variables
				blood1 = br.readLine();
				blood2 = br.readLine();
				glucose= br.readLine();
				model.addRow(new Object[]{date, weight, blood1 + "/" + blood2,glucose});
			}
				
			
		fr.close();
		
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}


