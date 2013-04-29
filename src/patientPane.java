import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;


public class patientPane extends JTabbedPane //creates patientPane class of type JTabbedPane
{
	//field variables
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
	private JLabel labeOfficeZip;
	private JLabel labelOfficeState;
	private JLabel labelOfficeStreet;
	private String fName, id, email, phone, street, state, zip, insurance, doctor, nurse, doctorFile, lName, city, patientid;
	String weightInput, dateInput, pressureInput1, pressureInput2, glucoseInput;
	private JTextField patientContactPanelOfficeInput;
	private JLabel lblOfficeCity;
	private JTextField patientContactPanelCityInput;
	private JLabel lblCity;
	private JLabel lblLastName;
	private JTextField patientContactPanelLastNameInput;
	private JButton btnPatientEditInformation;
	private JButton btnPatientAcceptInfo;
	private JButton HealthRecordsPanelUpdateIndicatorsPanelSubmit;
	private String user, userText;
	private JTextField updateIndicatorsPanelDateInput;
	private JButton HealthRecordsPanelUpdateIndicatorsPanelGraph;
	
	public void refreshPanel(String file)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String dateInput = Integer.toString(date.getMonth()+1) + "/" + Integer.toString(date.getDate()) + "/" + Integer.toString(date.getYear()+1900);
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
		patientContactPanelIdInput.setText(patientid);
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
	
	//main method
	public patientPane()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String dateInput = Integer.toString(date.getMonth()+1) + "/" + Integer.toString(date.getDate()) + "/" + Integer.toString(date.getYear()+1900);

		setTabPlacement(LEFT); //sets the patinets tabbs to the left
		patientRecordsPane = new JTabbedPane(JTabbedPane.TOP); //creats a new JTabbedPane with tabs on the top
		patientAccountPanel = new JPanel(); //creates new acountmanagement Panel
		patientContactPanel = new JPanel(); //creates new Contact Pannel

		addTab("Patient Information", null, patientContactPanel, null); //adds Patient Informaiton panel to the patientPane
		//creates Patient contact info banner
		patientContactBanner = new JTextArea();
		patientContactBanner.setTabSize(5);
		patientContactBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		patientContactBanner.setEditable(false);
		patientContactBanner.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		patientContactBanner.setForeground(new Color(0, 0, 128));
		patientContactBanner.setText("\tWelcome\r\n  disGUIse Well-Check Clinic");
		
		//creates new Labels for patient informaiton panel
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
		label_6 = new JLabel("Zip:");
		label_7 = new JLabel("State:");
		label_8 = new JLabel("Street:");
		lblCity = new JLabel("City:");
		lblLastName = new JLabel("Last Name:");
		labeOfficeZip = new JLabel("Zip:");
		labelOfficeState = new JLabel("State:");
		labelOfficeStreet = new JLabel("Street:");
		lblOfficeCity = new JLabel("City:");

		//creates textboxes that would be used in Contact information Panel
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

		patientContactPanelOfficeInput = new JTextField();
		patientContactPanelOfficeInput.setEditable(false);
		patientContactPanelOfficeInput.setColumns(10);

		patientContactPanelCityInput = new JTextField();
		patientContactPanelCityInput.setEditable(false);
		patientContactPanelCityInput.setColumns(10);

		patientContactPanelLastNameInput = new JTextField();
		patientContactPanelLastNameInput.setEditable(false);
		patientContactPanelLastNameInput.setColumns(10);
		//creates buttons for Contact info Panel
		btnPatientEditInformation = new JButton("Edit Information");
		btnPatientAcceptInfo = new JButton("Accept");

		GroupLayout gl_patientContactPanel = new GroupLayout(patientContactPanel); //creates new GroupLayout for Contact Panel
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
														.addComponent(labeOfficeZip)
														.addComponent(labelOfficeState)
														.addComponent(lblOfficeCity, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
														.addComponent(labelOfficeStreet))
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
													.addComponent(labelOfficeStreet))
												.addComponent(patientContactPanelOfficeStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(6)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(6)
													.addComponent(lblOfficeCity))
												.addComponent(patientContactPanelOfficeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(8)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(6)
													.addComponent(labelOfficeState))
												.addComponent(patientContactPanelOfficeStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGap(6)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(6)
													.addComponent(labeOfficeZip))
												.addComponent(patientContactPanelOfficeZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnPatientEditInformation)
										.addComponent(btnPatientAcceptInfo))
									.addContainerGap())
						);
		patientContactPanel.setLayout(gl_patientContactPanel); //sets the contact Panel Layout
		//adds Tabs to the Patient pane
		addTab("Health Records", null, patientRecordsPane, null);
		addTab("Account Management", null, patientAccountPanel, null);

		//HealthRecords Tab
		patientHealthRecordsPanel = new JPanel(); //creates new Panel
		patientRecordsPane.addTab("Health Records", null, patientHealthRecordsPanel, null); //adds panel to patientHealthRecordspanel

		patientsHealthRecordsScrollPane = new JScrollPane(); //creates new ScrollPane
		patientsHealthRecordsScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		patientsHealthRecordsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		patientsHealthRecordsTable = new JTable(); //creates new Table
		patientsHealthRecordsTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Date:", "Weight:", "Blood Pressure:", "Glucose:" //columns fo table
				}
				));
		patientsHealthRecordsTable.getColumnModel().getColumn(0).setPreferredWidth(100); //sets width of each column
		patientsHealthRecordsTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		patientsHealthRecordsTable.getColumnModel().getColumn(2).setPreferredWidth(100);
		patientsHealthRecordsTable.getColumnModel().getColumn(3).setPreferredWidth(100);
		patientsHealthRecordsScrollPane.setViewportView(patientsHealthRecordsTable);
		//creates new Layout for the HealthRecords Tab of the Patient
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
		patientHealthRecordsPanel.setLayout(gl_patientHealthRecordsPanel); //sets the layout to this

		patientUpdateIndicatorsPanel = new JPanel(); //adds new Panel for indicators
		patientRecordsPane.addTab("Update Indicators", null, patientUpdateIndicatorsPanel, null); //adds pane to PateintRecordspane
		
		//creates labels to be used in the Indicators Panel
		JLabel label = new JLabel("mg/dL");
		JLabel label_1 = new JLabel("Blood Glucose");
		JLabel label_2 = new JLabel("Blood Pressure");
		JLabel label_3 = new JLabel("DIA");
		JLabel label_4 = new JLabel("lbs");
		JLabel label_5 = new JLabel("Weight");
		JLabel lblDate = new JLabel("Date");
		JLabel lblXxxxxxxx = new JLabel("xx/xx/xxxx");
		//creates Textboxes to be used in the indicators panel
		HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput = new JTextField(5);
		HealthRecordsPanelUpdateIndicatorsPanelPressureInput1 = new JTextField(5);
		HealthRecordsPanelUpdateIndicatorsPanelPressureInput2 = new JTextField(5);
		HealthRecordsPanelUpdateIndicatorsPanelWeightInput = new JTextField(5);
		updateIndicatorsPanelDateInput = new JTextField(5);
		updateIndicatorsPanelDateInput.setText(dateInput);
		updateIndicatorsPanelDateInput.setEditable(false);
		textField_4 = new JTextField(10);
		textField_4.setText("Update the textboxes with your Health Indicators, Submit to save.");
		textField_4.setEditable(false);
		//creates new Banner for indicators Panel
		JTextArea textArea = new JTextArea();
		textArea.setText("\t\tUpdate Health Indicators\r\n\r\n");
		textArea.setTabSize(5);
		textArea.setForeground(new Color(0, 0, 102));
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		//creates new Butttons for the indicators Panel
		HealthRecordsPanelUpdateIndicatorsPanelSubmit = new JButton("Submit");
		HealthRecordsPanelUpdateIndicatorsPanelGraph = new JButton("Graph");
		
		//creates new Layout for Inidcators Panel
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
									.addComponent(HealthRecordsPanelUpdateIndicatorsPanelSubmit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(HealthRecordsPanelUpdateIndicatorsPanelGraph))))
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
							.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(HealthRecordsPanelUpdateIndicatorsPanelSubmit)
								.addComponent(HealthRecordsPanelUpdateIndicatorsPanelGraph)))))
		);
		patientUpdateIndicatorsPanel.setLayout(gl_patientUpdateIndicatorsPanel); //sets the indicator Panel to the layout above

		
		patientPrescriptionsPanel = new JPanel(); //creates new Prescriptions Panel
		patientRecordsPane.addTab("Prescriptions", null, patientPrescriptionsPanel, null);//adds prescriptionPanel to the RecoredsPane
		//adds new Scrollpane
		patientPrescriptionsScrollPane = new JScrollPane();
		patientPrescriptionsScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		patientPrescriptionsScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//adds new table for prescriptions
		patientsPrescriptionsTable = new JTable();
		patientsPrescriptionsTable.setModel(new DefaultTableModel(
				new Object[][] {
						
				},
				new String[] {
						"Date:", "Prescription", "Comments" //table columns
				}
				));
		patientsPrescriptionsTable.getColumnModel().getColumn(1).setPreferredWidth(140);//sets the width of the columns
		patientsPrescriptionsTable.getColumnModel().getColumn(2).setPreferredWidth(420);
		patientPrescriptionsScrollPane.setViewportView(patientsPrescriptionsTable);
		//sets layout for the prescriptions list Panel
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
		///Account tab
		//creates new Banner for the Patient Account managemetn Panel
		patientAccountManagementBanner = new JTextArea();
		patientAccountManagementBanner.setBounds(49, 26, 327, 46);
		patientAccountManagementBanner.setText("         disGUIse Account Management");
		patientAccountManagementBanner.setForeground(new Color(0, 0, 102));
		patientAccountManagementBanner.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		patientAccountManagementBanner.setEditable(false);
		patientAccountManagementBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		
		//creates new buttons
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
		//adds buttons to the pateint account panel
		patientAccountPanel.add(patientAccountManagementBanner);
		patientAccountPanel.add(patientChangePassword);
		patientAccountPanel.add(patientRecoverPassword);
		patientAccountPanel.add(patientManageSecurityQuestions);
		patientPaneEvents();
	}
	//method for button listeners
	private void patientPaneEvents()
	{
		HealthRecordsPanelUpdateIndicatorsPanelSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Updates patient indicators when 'Submit' is clicked
				
				String patientIndicatorFile; // Establishes variable for patient file
				System.out.println("Current patient: " + user); // console test
				
				String indGlucose=HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput.getText();
				String indP1=HealthRecordsPanelUpdateIndicatorsPanelPressureInput1.getText();
				String indP2=HealthRecordsPanelUpdateIndicatorsPanelPressureInput2.getText();
				String indWeight=HealthRecordsPanelUpdateIndicatorsPanelWeightInput.getText();
				
				if(indGlucose.length()!=0 &&
						indP1.length()!=0 &&
						indP2.length()!=0 &&
						indWeight.length()!=0)
				{
				// Fields are not editable after clicking the 'Submit' button
				updateIndicatorsPanelDateInput.setEditable(false);
				/*HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput.setEditable(false);
				HealthRecordsPanelUpdateIndicatorsPanelPressureInput1.setEditable(false);
				HealthRecordsPanelUpdateIndicatorsPanelPressureInput2.setEditable(false);
				HealthRecordsPanelUpdateIndicatorsPanelWeightInput.setEditable(false);*/
				
				HealthRecordsPanelUpdateIndicatorsPanelSubmit.setEnabled(false);
				
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
				else
				{
					JOptionPane.showMessageDialog(HealthRecordsPanelUpdateIndicatorsPanelSubmit, "Please Fill in All Fields");
				}
			}
		});
		btnPatientEditInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//sets information to editable
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
				//sets the textboxes to uneditable
				patientContactPanelPatientPhoneInput.setEditable(false);
				patientContactPanelEmailInput.setEditable(false);
				patientContactPanelStreetInput.setEditable(false);
				patientContactPanelCityInput.setEditable(false);
				patientContactPanelStateInput.setEditable(false);
				patientContactPanelZipInput.setEditable(false);
				
				try
				{
				String userFile2=user+".txt";
				File file=new File(userFile2);
				BufferedReader br=new BufferedReader(new FileReader(file));

				//gets information from textboxes and stores into strings
				String newPhone=patientContactPanelPatientPhoneInput.getText();
				String newEmail=patientContactPanelEmailInput.getText();
				String newStreet=patientContactPanelStreetInput.getText();
				String newCity=patientContactPanelCityInput.getText();
				String newState=patientContactPanelStateInput.getText();
				String newZip=patientContactPanelZipInput.getText();
				
				//reads information from ID patients .txt
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

				//swaps old info with new info
				phone=newPhone;
				email=newEmail;
				street=newStreet;
				city=newCity;
				state=newState;
				zip=newZip;

				//rewrites file using new info
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
				changePassword cp=new changePassword(); //calls changePassword Class
			}
		});
		patientRecoverPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordReset pr=new passwordReset(disGuiseFrame.Username); //calls password Reset class	
			}
		});
		patientManageSecurityQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				securityQuestion sq=new securityQuestion(); //calls secuityQuestion class	
			}
		});
		HealthRecordsPanelUpdateIndicatorsPanelGraph.addActionListener(new ActionListener() {
			
			public int[] convertIntegers(ArrayList<Integer> integers) 	//this method converts arrayLists into arrays
			{
			    int[] ret = new int[integers.size()];
			    Iterator<Integer> iterator = integers.iterator();
			    for (int i = 0; i < ret.length; i++)
			    {
			        ret[i] = iterator.next().intValue();
			    }
			    return ret;
			}
			
			public String[] convertStrings(ArrayList<String> strings)   //this method converts StringArraylists into array
			{
				String[] ret2 = new String[strings.size()];
				Iterator<String> iterator2 = strings.iterator();
				for (int i =0; i< ret2.length; i++)
				{
					ret2[i] = iterator2.next().toString();
				}
				return ret2;
	 		}
			
			public void actionPerformed(ActionEvent e) 
			{
				ArrayList<String> data = new ArrayList<String>(); 				//These are arraylists for all the indicators.
				ArrayList<String> date = new ArrayList<String>();               //arraylists or vectors have to be used 
				ArrayList<Integer> weight = new ArrayList<Integer>();           //because of changing values.        
				ArrayList<Integer> syspressure = new ArrayList<Integer>();
				ArrayList<Integer> diapressure = new ArrayList<Integer>();
				ArrayList<Integer> bldsugar = new ArrayList<Integer>();
				
				String filename = "dasindicators";
				String filename2 = user + "indicators.txt";
				Scanner fileScanner = null;
				try {
						fileScanner = new Scanner(new File(filename2));
				    } 
				    catch (FileNotFoundException a) 
				    {
				    	a.printStackTrace();
				    }
				
				String blank = null;           
				while (fileScanner.hasNext())  			//this code scans and reads the file. Blank is any line.
		     	{                                       //If the blank has a string length > 0, then it is 
					blank = fileScanner.nextLine();     //added to a big string arrayList of data.
					
					if (blank.length() > 0)
		            data.add(blank);
				}
				
				for(int i =0; i<data.size(); i=i+5)               //this seperates all the data into their
				{                                                 //respective int and string arraylists.
					date.add(data.get(i));     
					weight.add((int)(Double.parseDouble(data.get(i+1))));
					syspressure.add((int)(Double.parseDouble(data.get(i+2))));
					diapressure.add((int)(Double.parseDouble(data.get(i+3))));
					bldsugar.add((int)(Double.parseDouble(data.get(i+4))));
				}
				
				int datalength = date.size();

			graphPanel graph = new graphPanel();
			graph.getDataPoints(datalength);
		    graph.getAllIndicators(convertStrings(date), convertIntegers(weight), convertIntegers(syspressure), convertIntegers(diapressure), convertIntegers(bldsugar));
			
			
			popUp p3=new popUp();
			p3.getContentPane().add(graph);
			p3.setSize(500,500);					//addes it to popup window
			p3.show();
			}
		});
	}
	
	public void refreshPrescriptionTable(String file)
	{
		DefaultTableModel model = (DefaultTableModel) patientsPrescriptionsTable.getModel();
		String date, drug, comment;
		
		if (model.getRowCount()!= 0)
		{
			for(int i = model.getRowCount(); i > 0; i--)
			{
				model.removeRow(0);
			}
		}
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
		if (model.getRowCount()!= 0)
		{
			for(int i = model.getRowCount(); i > 0; i--)
			{
				model.removeRow(0);
			}
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
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date2 = new Date();
			String dateInput2 = Integer.toString(date2.getMonth()+1) + "/" + Integer.toString(date2.getDate()) + "/" + Integer.toString(date2.getYear()+1900);
			if(patientsHealthRecordsTable.getRowCount() != 0 && patientsHealthRecordsTable.getValueAt( patientsHealthRecordsTable.getRowCount()-1, 0).equals(dateInput2) )
			{
				HealthRecordsPanelUpdateIndicatorsPanelSubmit.setEnabled(false);
			}
			else
			{
				HealthRecordsPanelUpdateIndicatorsPanelSubmit.setEnabled(true);
			}
		fr.close();
		
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}


