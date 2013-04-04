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
import java.io.FileReader;


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
				
						patientContactNameLbl = new JLabel("Name:");
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
						GroupLayout gl_patientContactPanel = new GroupLayout(patientContactPanel);
						gl_patientContactPanel.setHorizontalGroup(
							gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_patientContactPanel.createSequentialGroup()
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(61)
													.addComponent(label_6))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(55)
													.addComponent(label_7))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(51)
													.addComponent(label_8))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(10)
													.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
														.addComponent(patientContactNameLbl)
														.addComponent(patientContactIdLbl)
														.addComponent(patientContactPhoneLbl)
														.addComponent(patientContactEmailLbl))))
											.addGap(10)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(patientContactPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(116)
													.addComponent(label_9))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(110)
													.addComponent(label_10))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(106)
													.addComponent(label_11))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(79)
													.addComponent(patientContactInsuranceLbl))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(90)
													.addComponent(patientContactDoctorLbl))
												.addGroup(gl_patientContactPanel.createSequentialGroup()
													.addGap(48)
													.addComponent(patientContactOffPhoneLbl)))
											.addGap(4)
											.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(patientContactPanelInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelDoctorInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelOfficePhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelOfficeStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelOfficeStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(patientContactPanelOfficeZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(20)
											.addComponent(patientContactAddressLbl)
											.addGap(193)
											.addComponent(patientContactOffAddLbl))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(100)
											.addComponent(patientContactBanner, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)))
									.addGap(114))
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
									.addGap(6)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(8)
											.addComponent(patientContactIdLbl))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(5)
											.addComponent(patientContactPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactDoctorLbl))
										.addComponent(patientContactPanelDoctorInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(11)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactPhoneLbl))
										.addComponent(patientContactPanelPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(5)
											.addComponent(patientContactOffPhoneLbl))
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(2)
											.addComponent(patientContactPanelOfficePhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(9)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactEmailLbl))
										.addComponent(patientContactPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(6)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(patientContactAddressLbl))
										.addComponent(patientContactOffAddLbl))
									.addGap(8)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(label_8))
										.addComponent(patientContactPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(6)
											.addComponent(label_11))
										.addComponent(patientContactPanelOfficeStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(6)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(label_7))
										.addComponent(patientContactPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(6)
											.addComponent(label_10))
										.addComponent(patientContactPanelOfficeStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(6)
									.addGroup(gl_patientContactPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(3)
											.addComponent(label_6))
										.addComponent(patientContactPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_patientContactPanel.createSequentialGroup()
											.addGap(6)
											.addComponent(label_9))
										.addComponent(patientContactPanelOfficeZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
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
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
						{null, null, null, null},
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
		
		JButton HealthRecordsPanelUpdateIndicatorsPanelSubmit = new JButton("Submit");
		JLabel label = new JLabel("mg/dL");
		HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput = new JTextField(5);
		JLabel label_1 = new JLabel("Blood Glucose");
		JLabel label_2 = new JLabel("Blood Pressure");
		HealthRecordsPanelUpdateIndicatorsPanelPressureInput1 = new JTextField(5);
		HealthRecordsPanelUpdateIndicatorsPanelPressureInput2 = new JTextField(5);
		JLabel label_3 = new JLabel("DIA");
		JLabel label_4 = new JLabel("lbs");
		HealthRecordsPanelUpdateIndicatorsPanelWeightInput = new JTextField(5);
		JLabel label_5 = new JLabel("Weight:");
		textField_4 = new JTextField(10);
		textField_4.setText("Update the textboxes with your Health Indicators, Submit to save.");
		textField_4.setEditable(false);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\t\tUpdate Health Indicators\r\n\r\n");
		textArea.setTabSize(5);
		textArea.setForeground(new Color(0, 0, 102));
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		GroupLayout gl_patientUpdateIndicatorsPanel = new GroupLayout(patientUpdateIndicatorsPanel);
		gl_patientUpdateIndicatorsPanel.setHorizontalGroup(
			gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
					.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_5)
								.addComponent(label_2)
								.addComponent(label_1))
							.addGap(10)
							.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
									.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(HealthRecordsPanelUpdateIndicatorsPanelWeightInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(HealthRecordsPanelUpdateIndicatorsPanelGlucoseInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(4)
									.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_4)
										.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
											.addComponent(label)
											.addGap(18)
											.addComponent(HealthRecordsPanelUpdateIndicatorsPanelSubmit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))))
								.addComponent(HealthRecordsPanelUpdateIndicatorsPanelPressureInput1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(12)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(12)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
							.addGap(172)
							.addComponent(HealthRecordsPanelUpdateIndicatorsPanelPressureInput2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_3)))
					.addGap(4))
		);
		gl_patientUpdateIndicatorsPanel.setVerticalGroup(
			gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_patientUpdateIndicatorsPanel.createSequentialGroup()
					.addGap(24)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
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
							.addGroup(gl_patientUpdateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(HealthRecordsPanelUpdateIndicatorsPanelSubmit)
								.addComponent(label))))
					.addGap(23))
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
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
						{null, null, null},
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
		patientChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				popUp p3=new popUp();
				changePassword cp=new changePassword();
				p3.getContentPane().add(cp);
				p3.pack();
				p3.show();
			}
		});
		patientRecoverPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				popUp p4=new popUp();
				passwordReset pr=new passwordReset();
				p4.getContentPane().add(pr);
				p4.pack();
				p4.show();
			}
		});
		patientManageSecurityQuestions.addActionListener(new ActionListener() {
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


