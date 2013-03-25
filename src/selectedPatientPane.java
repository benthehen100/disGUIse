import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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

	public selectedPatientPane() {

		JPanel PatientInformationPanel = new JPanel();
		addTab("Patient Information", null, PatientInformationPanel, null);

		JLabel label = new JLabel("Address:");	
		JLabel label_1 = new JLabel("Email Address:");	
		JLabel label_2 = new JLabel("Telephone:");
		JLabel label_3 = new JLabel("Patient ID:");
		JLabel label_4 = new JLabel("Name:");
		JLabel label_5 = new JLabel("Insurance:");
		JLabel lblStreet = new JLabel("Street:");
		JLabel lblState = new JLabel("State:");
		JLabel lblZip = new JLabel("Zip:");
		JLabel lblPhone = new JLabel("Phone:");

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


		GroupLayout gl_PatientInformationPanel = new GroupLayout(PatientInformationPanel);
		gl_PatientInformationPanel.setHorizontalGroup(
				gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PatientInformationPanel.createSequentialGroup()
						.addGap(34)
						.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_PatientInformationPanel.createSequentialGroup()
										.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_PatientInformationPanel.createSequentialGroup()
														.addComponent(lblZip)
														.addGap(6))
														.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
																.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
																.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
																.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
																.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
																.addComponent(lblStreet)
																.addComponent(lblState))
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
																		.addComponent(patientInformationPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(patientInformationPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(patientInformationPanelPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(patientInformationPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(patientInformationPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(patientInformationPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																		.addComponent(patientInformationPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addGap(91)
																		.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
																				.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblPhone))
																				.addPreferredGap(ComponentPlacement.UNRELATED)
																				.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
																						.addComponent(patientInformationPanelInsurancePhoneInpu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																						.addComponent(patientInformationPanelInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
																						.addContainerGap(62, Short.MAX_VALUE))
				);
		gl_PatientInformationPanel.setVerticalGroup(
				gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PatientInformationPanel.createSequentialGroup()
						.addGap(40)
						.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_4)
										.addComponent(patientInformationPanelNameInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
												.addComponent(label_5)
												.addComponent(patientInformationPanelInsuranceInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_PatientInformationPanel.createSequentialGroup()
																.addGap(11)
																.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
																		.addComponent(label_3)
																		.addComponent(patientInformationPanelIdInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addGap(11)
																		.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
																				.addComponent(label_2)
																				.addComponent(patientInformationPanelPatientPhoneInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																				.addGap(11)
																				.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
																						.addComponent(label_1)
																						.addComponent(patientInformationPanelEmailInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																						.addGap(32)
																						.addComponent(label)
																						.addPreferredGap(ComponentPlacement.UNRELATED)
																						.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
																								.addComponent(patientInformationPanelStreetInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																								.addComponent(lblStreet))
																								.addPreferredGap(ComponentPlacement.RELATED)
																								.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
																										.addComponent(patientInformationPanelStateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																										.addComponent(lblState))
																										.addPreferredGap(ComponentPlacement.RELATED)
																										.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
																												.addComponent(patientInformationPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																												.addComponent(lblZip)))
																												.addGroup(gl_PatientInformationPanel.createSequentialGroup()
																														.addPreferredGap(ComponentPlacement.UNRELATED)
																														.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
																																.addComponent(lblPhone)
																																.addComponent(patientInformationPanelInsurancePhoneInpu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
																																.addContainerGap(104, Short.MAX_VALUE))
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
								.addComponent(updateIndicatorsPanelBanner, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
								.addComponent(updateIndicatorsPanelPrompt, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
										.addGap(43)
										.addComponent(updateIndicatorsPanelWeightInput, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
										.addGap(4)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
												.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(updateIndicatorsPanelPressureInput1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
												.addGap(33)
												.addComponent(updateIndicatorsPanelPressureInput2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
												.addGap(10)
												.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
														.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
														.addGap(15)
														.addComponent(updateIndicatorsPanelGlucoseInput, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
														.addGap(40)
														.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
																.addGap(133)
																.addComponent(updateIndicatorsPanelSubmit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
																.addContainerGap(34, Short.MAX_VALUE))
				);
		gl_updateIndicatorsPanel.setVerticalGroup(
				gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
						.addContainerGap()
						.addPreferredGap(ComponentPlacement.RELATED)
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
																								.addContainerGap(84, Short.MAX_VALUE))
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
			}
		});
	}
}
