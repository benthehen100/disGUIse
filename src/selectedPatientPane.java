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
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	private popUp p2;
	private JTextField updateIndicatorsPanelDateInput;
	String patientFileName, patientFile, patientID;
	String weightInput, dateInput, pressureInput1, pressureInput2, glucoseInput;

	public selectedPatientPane() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String dateString = Integer.toString(date.getMonth()) + "/" + Integer.toString(date.getDate()) + "/" + Integer.toString(date.getYear()+1900);
		
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
		
		JLabel lblDate = new JLabel("Date:");
		
		updateIndicatorsPanelDateInput = new JTextField(5);
		updateIndicatorsPanelDateInput.setEditable(false);
		updateIndicatorsPanelDateInput.setText(dateString);
		
		
		JLabel lblXxxxxxxx = new JLabel("xx/xx/xxxx");
		GroupLayout gl_updateIndicatorsPanel = new GroupLayout(updateIndicatorsPanel);
		gl_updateIndicatorsPanel.setHorizontalGroup(
			gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(33)
							.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(updateIndicatorsPanelDateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(updateIndicatorsPanelWeightInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(updateIndicatorsPanelPressureInput1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(updateIndicatorsPanelGlucoseInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblXxxxxxxx, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(166)
							.addComponent(updateIndicatorsPanelSubmit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(33)
							.addComponent(updateIndicatorsPanelPrompt, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(33)
							.addComponent(updateIndicatorsPanelBanner, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(216)
							.addComponent(updateIndicatorsPanelPressureInput2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addGap(98))
		);
		gl_updateIndicatorsPanel.setVerticalGroup(
			gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
					.addGap(11)
					.addComponent(updateIndicatorsPanelBanner, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(updateIndicatorsPanelPrompt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
									.addGap(3)
									.addComponent(lblDate))
								.addComponent(updateIndicatorsPanelDateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(25)
							.addComponent(lblXxxxxxxx)))
					.addGap(15)
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
					.addComponent(updateIndicatorsPanelSubmit))
		);
		updateIndicatorsPanel.setLayout(gl_updateIndicatorsPanel);

		JPanel visualIndicatorsPanel = new JPanel();
		addTab("Visual Indicators", null, visualIndicatorsPanel, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		
		GroupLayout gl_visualIndicatorsPanel = new GroupLayout(visualIndicatorsPanel);
		gl_visualIndicatorsPanel.setHorizontalGroup(
				gl_visualIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_visualIndicatorsPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_visualIndicatorsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_visualIndicatorsPanel.createSequentialGroup()
										.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
										.addContainerGap())
										.addGroup(Alignment.TRAILING, gl_visualIndicatorsPanel.createSequentialGroup()
												.addGap(18))))
				);
		gl_visualIndicatorsPanel.setVerticalGroup(
				gl_visualIndicatorsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_visualIndicatorsPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		
		GraphED graph = new GraphED();

		scrollPane_2.setViewportView(graph);
		visualIndicatorsPanel.setLayout(gl_visualIndicatorsPanel);
		//selectedPatientEvents();
		
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
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				String dateString = Integer.toString(date.getMonth()) + "/" + Integer.toString(date.getDate()) + "/" + Integer.toString(date.getYear()+1900); //years after 1900
				// Updates patient indicators when 'Submit' is clicked
				
				String patientIndicatorFile; // Establishes variable for patient file
				
				
				System.out.println("Current patient: " + patientFile); // console test
				
				// Fields are not editable after clicking the 'Submit' button
				updateIndicatorsPanelDateInput.setEditable(false);
				updateIndicatorsPanelGlucoseInput.setEditable(false);
				updateIndicatorsPanelPressureInput1.setEditable(false);
				updateIndicatorsPanelPressureInput2.setEditable(false);
				updateIndicatorsPanelWeightInput.setEditable(false);
				updateIndicatorsPanelWeightInput.setEditable(false);
				
				// Defines patientIndicatorFile
				patientIndicatorFile = patientFile + "indicators.txt";
				
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
				String newDateInput = dateString;
				String newWeightInput = updateIndicatorsPanelWeightInput.getText();
				String newPressureInput1 = updateIndicatorsPanelPressureInput1.getText();
				String newPressureInput2 = updateIndicatorsPanelPressureInput2.getText();
				String newGlucoseInput = updateIndicatorsPanelGlucoseInput.getText();
				
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
				
				refreshIndicatorTable(patientID);
				disGuiseFrame.doctor.refreshTable();
				disGuiseFrame.nurse.refreshTable();
			}
		});
		//
		prescriptionsPanelAddPrescriptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//add Patient button
				
				System.out.println("Patient file to be passed: " + patientFile); // console test
				addPrescription prescript=new addPrescription(patientFile);
				
			}
		});
	}
	public void refreshPrescriptionTable(String file)
	{
		DefaultTableModel model = (DefaultTableModel) SelectedPatientPresciptionsTable.getModel();
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
		DefaultTableModel model = (DefaultTableModel) SelectedPatientPatientHealthRecordsTable.getModel(); //clears the table, before table is repopulated;
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
	
	
	public void refreshPanel(String file)
	{
		String fName, lName, id, phone, email, street, state, zip, insurance,doctor, nurse, doctor2,city;
		
		patientFileName = file;
		patientFile = patientFileName.replaceAll(".txt", "");
		System.out.println("Current patient: " + patientFileName); // console test
		
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
			
			patientInformationPanelNameInput.setText(fName);
			patientInformationPanelLastNameInput.setText(lName);
			patientInformationPanelCityInput.setText(city);
			
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
