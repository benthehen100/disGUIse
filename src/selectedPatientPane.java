import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;

public class selectedPatientPane extends JTabbedPane {
	private JTextField patientInformationPanelNameInput;
	private JTextField patientInformationPanelIdInput;
	private JTextField patientInformationPanelPatientPhoneInput;
	private JTextField patientInformationPanelEmailInput;
	private JTextField patientInformationPanelStreetInput;
	private JTextField patientInformationPanelStateInput;
	private JTextField patientInformationPanelZipInput;
	private JTextField patientInformationPanelInsuranceInput;
	private JTextField patientInformationPanelInsurancePhoneInpu;
	private JTable SelectedPatientPatientHealthRecordsTable;
	private JTextField updateIndicatorsPanelPrompt;
	private JTextField updateIndicatorsPanelWeightInput;
	private JTextField updateIndicatorsPanelPressureInput1;
	private JTextField updateIndicatorsPanelPressureInput2;
	private JTextField updateIndicatorsPanelGlucoseInput;
	private JTable SelectedPatientPresciptionsTable;
	private JButton updateIndicatorsPanelSubmit;
	private JButton prescriptionsPanelAddPrescriptions;
	private JTextField patientInformationPanelCityInput;
	private JTextField patientInformationPanelLastNameInput;

	public selectedPatientPane() {

		JPanel PatientInformationPanel = new JPanel();
		addTab("Patient Information", null, PatientInformationPanel, null);

		JLabel label = new JLabel("Address:");
		label.setVerticalAlignment(SwingConstants.TOP);
		JLabel label_1 = new JLabel("Email Address:");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		JLabel label_2 = new JLabel("Telephone:");
		label_2.setVerticalAlignment(SwingConstants.TOP);
		JLabel label_3 = new JLabel("Patient ID:");
		label_3.setVerticalAlignment(SwingConstants.TOP);
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setVerticalAlignment(SwingConstants.TOP);
		JLabel label_5 = new JLabel("Insurance:");
		label_5.setVerticalAlignment(SwingConstants.TOP);
		JLabel lblStreet = new JLabel("Street:");
		lblStreet.setVerticalAlignment(SwingConstants.TOP);
		JLabel lblState = new JLabel("State:");
		lblState.setVerticalAlignment(SwingConstants.TOP);
		JLabel lblZip = new JLabel("Zip:");
		lblZip.setVerticalAlignment(SwingConstants.TOP);
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setVerticalAlignment(SwingConstants.TOP);

		patientInformationPanelNameInput = new JTextField(10);
		patientInformationPanelIdInput = new JTextField(10);
		patientInformationPanelPatientPhoneInput = new JTextField(10);
		patientInformationPanelEmailInput = new JTextField(10);
		patientInformationPanelStreetInput = new JTextField(10);
		patientInformationPanelStateInput = new JTextField(10);
		patientInformationPanelZipInput = new JTextField(10);
		patientInformationPanelInsuranceInput = new JTextField(10);
		patientInformationPanelInsurancePhoneInpu = new JTextField(10);

		patientInformationPanelNameInput.setEditable(false);
		patientInformationPanelIdInput.setEditable(false);
		patientInformationPanelPatientPhoneInput.setEditable(false);
		patientInformationPanelEmailInput.setEditable(false);
		patientInformationPanelStreetInput.setEditable(false);
		patientInformationPanelStateInput.setEditable(false);
		patientInformationPanelZipInput.setEditable(false);
		patientInformationPanelInsuranceInput.setEditable(false);
		patientInformationPanelInsurancePhoneInpu.setEditable(false);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setVerticalAlignment(SwingConstants.TOP);
		
		patientInformationPanelCityInput = new JTextField(10);
		patientInformationPanelCityInput.setEditable(false);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setVerticalAlignment(SwingConstants.TOP);
		
		patientInformationPanelLastNameInput = new JTextField(10);
		patientInformationPanelLastNameInput.setEditable(false);
		GroupLayout gl_PatientInformationPanel = new GroupLayout(PatientInformationPanel);
		gl_PatientInformationPanel.setHorizontalGroup(
			gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PatientInformationPanel.createSequentialGroup()
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
							.addGap(8)
							.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(patientInformationPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(patientInformationPanelLastNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(patientInformationPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(patientInformationPanelPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(patientInformationPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(91)
							.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPhone, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(patientInformationPanelInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(patientInformationPanelInsurancePhoneInpu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(70)
							.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblZip, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PatientInformationPanel.createSequentialGroup()
									.addGap(44)
									.addComponent(patientInformationPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(70)
							.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PatientInformationPanel.createSequentialGroup()
									.addGap(44)
									.addComponent(patientInformationPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(70)
							.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PatientInformationPanel.createSequentialGroup()
									.addGap(44)
									.addComponent(patientInformationPanelCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(70)
							.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PatientInformationPanel.createSequentialGroup()
									.addGap(44)
									.addComponent(patientInformationPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblStreet, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(34)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
					.addGap(80))
		);
		gl_PatientInformationPanel.setVerticalGroup(
			gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PatientInformationPanel.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblFirstName))
						.addComponent(patientInformationPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addComponent(patientInformationPanelInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblLastName))
						.addComponent(patientInformationPanelLastNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(6)
							.addComponent(lblPhone))
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(patientInformationPanelInsurancePhoneInpu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_3))
						.addComponent(patientInformationPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(patientInformationPanelPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_1))
						.addComponent(patientInformationPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addComponent(label)
					.addGap(11)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(patientInformationPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblStreet)))
					.addGap(8)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblCity))
						.addComponent(patientInformationPanelCityInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(patientInformationPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblState)))
					.addGap(6)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_PatientInformationPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(lblZip))
						.addComponent(patientInformationPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		PatientInformationPanel.setLayout(gl_PatientInformationPanel);

		JPanel HealthRecordsPanel = new JPanel();
		addTab("HealthRecords", null, HealthRecordsPanel, null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		GroupLayout gl_HealthRecordsPanel = new GroupLayout(HealthRecordsPanel);
		gl_HealthRecordsPanel.setHorizontalGroup(
				gl_HealthRecordsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HealthRecordsPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
						.addContainerGap())
				);
		gl_HealthRecordsPanel.setVerticalGroup(
				gl_HealthRecordsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HealthRecordsPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
						.addContainerGap())
				);

		SelectedPatientPatientHealthRecordsTable = new JTable();
		SelectedPatientPatientHealthRecordsTable.setModel(new DefaultTableModel(
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
						"Date", "Weight", "Blood Pressure", "Blood Glucose"
				}
				));
		scrollPane.setViewportView(SelectedPatientPatientHealthRecordsTable);
		HealthRecordsPanel.setLayout(gl_HealthRecordsPanel);

		JPanel updateIndicatorsPanel = new JPanel();
		addTab("Update Indicators", null, updateIndicatorsPanel, null);

		JTextArea updateIndicatorsPanelBanner = new JTextArea();
		updateIndicatorsPanelBanner.setText("\t\tUpdate Health Indicators\r\n\r\n");
		updateIndicatorsPanelBanner.setTabSize(5);
		updateIndicatorsPanelBanner.setForeground(new Color(0, 0, 102));
		updateIndicatorsPanelBanner.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		updateIndicatorsPanelBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));

		updateIndicatorsPanelPrompt = new JTextField(10);
		updateIndicatorsPanelPrompt.setText("Update the textboxes with your Health Indicators, Submit to save.");
		updateIndicatorsPanelPrompt.setEditable(false);

		JLabel label_6 = new JLabel("Weight:");
		JLabel label_7 = new JLabel("lbs");
		JLabel label_8 = new JLabel("Blood Pressure");
		JLabel label_9 = new JLabel("DIA");
		JLabel label_10 = new JLabel("Blood Glucose");
		JLabel label_11 = new JLabel("mg/dL");

		updateIndicatorsPanelPressureInput1 = new JTextField(5);
		updateIndicatorsPanelWeightInput = new JTextField(5);
		updateIndicatorsPanelPressureInput2 = new JTextField(5);
		updateIndicatorsPanelGlucoseInput = new JTextField(5);


		updateIndicatorsPanelSubmit = new JButton("Submit");
		

		GroupLayout gl_updateIndicatorsPanel = new GroupLayout(updateIndicatorsPanel);
		gl_updateIndicatorsPanel.setHorizontalGroup(
			gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addComponent(label_6, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
							.addGap(43))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addComponent(label_8, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
							.addGap(10))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addComponent(label_10, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(15)))
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(updateIndicatorsPanelWeightInput, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(updateIndicatorsPanelPressureInput1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addComponent(updateIndicatorsPanelGlucoseInput, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(4)
							.addComponent(label_7, GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
							.addGap(290))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(33)
							.addComponent(updateIndicatorsPanelPressureInput2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_9, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
							.addGap(200))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(40)
							.addComponent(label_11, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
							.addGap(238)))
					.addGap(52))
				.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
					.addGap(166)
					.addComponent(updateIndicatorsPanelSubmit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(238))
				.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
					.addGap(33)
					.addComponent(updateIndicatorsPanelPrompt, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
					.addGap(101))
				.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
					.addGap(33)
					.addComponent(updateIndicatorsPanelBanner, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
					.addGap(52))
		);
		gl_updateIndicatorsPanel.setVerticalGroup(
			gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(updateIndicatorsPanelBanner, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(updateIndicatorsPanelPrompt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_6))
						.addComponent(updateIndicatorsPanelWeightInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_7)))
					.addGap(18)
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_8))
						.addComponent(updateIndicatorsPanelPressureInput1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(updateIndicatorsPanelPressureInput2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_9)))
					.addGap(18)
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_10))
						.addComponent(updateIndicatorsPanelGlucoseInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_11)))
					.addGap(6)
					.addComponent(updateIndicatorsPanelSubmit)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		updateIndicatorsPanel.setLayout(gl_updateIndicatorsPanel);

		JPanel visualIndicatorsPanel = new JPanel();
		addTab("Visual Indicators", null, visualIndicatorsPanel, null);

		JPanel prescriptionsPanel = new JPanel();
		addTab("Prescriptions", null, prescriptionsPanel, null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		prescriptionsPanelAddPrescriptions = new JButton("Add Prescription");
		
		GroupLayout gl_prescriptionsPanel = new GroupLayout(prescriptionsPanel);
		gl_prescriptionsPanel.setHorizontalGroup(
				gl_prescriptionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_prescriptionsPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_prescriptionsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_prescriptionsPanel.createSequentialGroup()
										.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
										.addContainerGap())
										.addGroup(Alignment.TRAILING, gl_prescriptionsPanel.createSequentialGroup()
												.addComponent(prescriptionsPanelAddPrescriptions)
												.addGap(18))))
				);
		gl_prescriptionsPanel.setVerticalGroup(
				gl_prescriptionsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_prescriptionsPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(prescriptionsPanelAddPrescriptions)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

		SelectedPatientPresciptionsTable = new JTable();
		SelectedPatientPresciptionsTable.setModel(new DefaultTableModel(
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
				},
				new String[] {
						"Date", "Prescription", "Comments"
				}
				));
		SelectedPatientPresciptionsTable.getColumnModel().getColumn(1).setPreferredWidth(140);
		SelectedPatientPresciptionsTable.getColumnModel().getColumn(2).setPreferredWidth(420);
		scrollPane_1.setViewportView(SelectedPatientPresciptionsTable);
		prescriptionsPanel.setLayout(gl_prescriptionsPanel);
		selectedPatientEvents();
	}
	private void selectedPatientEvents()
	{
		updateIndicatorsPanelSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//submit update indicators
			}
		});
		//
		prescriptionsPanelAddPrescriptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//add Patient button
				popUp p1=new popUp();
				addPrescription prescript=new addPrescription();
				p1.getContentPane().add(prescript);
				p1.pack();
				p1.show();
			}
		});
	}
	public void refreshPanel(String file)
	{
		String fName, lName, id, phone, email, street, state, zip, insurance,doctor, nurse, doctor2,city;
		
		FileReader fr; //reads data from file
		
		try {
			fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
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
			
			patientInformationPanelNameInput.setText(fName+ " " + lName);
			patientInformationPanelIdInput.setText(id);
			patientInformationPanelPatientPhoneInput.setText(phone);
			patientInformationPanelEmailInput.setText(email);
			patientInformationPanelStreetInput.setText(street);
			patientInformationPanelStateInput.setText(state);
			patientInformationPanelZipInput.setText(zip);
			patientInformationPanelInsuranceInput.setText(insurance);
			patientInformationPanelInsurancePhoneInpu.setText("239-481-4823");
		//people.printList();
		fr.close();
		
		} catch (Throwable e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		


;
		
	
	}
}
