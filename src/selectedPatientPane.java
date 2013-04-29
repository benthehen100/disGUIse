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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class selectedPatientPane extends JTabbedPane { //new class of type Jtabbed pane
	//field variables
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
	private JButton btnGraph;
	private JTextField patientInformationPanelCityInput;
	private JTextField patientInformationPanelLastNameInput;
	private popUp p2;
	private JTextField updateIndicatorsPanelDateInput;
	String patientFileName, patientFile, patientID;
	String weightInput, dateInput, pressureInput1, pressureInput2, glucoseInput;
	private final Action action = new SwingAction();
	private JButton btnEditInformation;
	private JButton btnAccept;
	private String fName, id, email, phone, street, state, zip, insurance, doctor, nurse, doctorFile, lName, city, patientid;

	public selectedPatientPane() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String dateString = Integer.toString(date.getMonth()) + "/" + Integer.toString(date.getDate()) + "/" + Integer.toString(date.getYear()+1900);
		
		JPanel PatientInformationPanel = new JPanel(); //creates new JPanel
		addTab("Patient Information", null, PatientInformationPanel, null); //adds the Panel to the tab
		
		//creates labels for class
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
		JLabel lblCity = new JLabel("City:");
		lblCity.setVerticalAlignment(SwingConstants.TOP);
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setVerticalAlignment(SwingConstants.TOP);
		
		//creates new textboxes for information tab
		patientInformationPanelNameInput = new JTextField(10);
		patientInformationPanelLastNameInput = new JTextField(10);
		patientInformationPanelIdInput = new JTextField(10);
		patientInformationPanelPatientPhoneInput = new JTextField(10);
		patientInformationPanelEmailInput = new JTextField(10);
		patientInformationPanelStreetInput = new JTextField(10);
		patientInformationPanelStateInput = new JTextField(10);
		patientInformationPanelZipInput = new JTextField(10);
		patientInformationPanelInsuranceInput = new JTextField(10);
		patientInformationPanelInsurancePhoneInpu = new JTextField(10);
		patientInformationPanelCityInput = new JTextField(10);
		
		//sets textboxes to uneditable
		patientInformationPanelNameInput.setEditable(false);
		patientInformationPanelIdInput.setEditable(false);
		patientInformationPanelPatientPhoneInput.setEditable(false);
		patientInformationPanelEmailInput.setEditable(false);
		patientInformationPanelStreetInput.setEditable(false);
		patientInformationPanelStateInput.setEditable(false);
		patientInformationPanelZipInput.setEditable(false);
		patientInformationPanelInsuranceInput.setEditable(false);
		patientInformationPanelInsurancePhoneInpu.setEditable(false);	
		patientInformationPanelCityInput.setEditable(false);
		patientInformationPanelLastNameInput.setEditable(false);
		
		btnEditInformation = new JButton("Edit Information");
		btnAccept = new JButton("Accept");
		
		//sets new groupLayout for PatientInformation panel
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
				.addGroup(Alignment.TRAILING, gl_PatientInformationPanel.createSequentialGroup()
					.addContainerGap(370, Short.MAX_VALUE)
					.addComponent(btnEditInformation)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAccept)
					.addGap(49))
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
						.addComponent(patientInformationPanelZipInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
					.addGroup(gl_PatientInformationPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEditInformation)
						.addComponent(btnAccept))
					.addContainerGap())
		);
		PatientInformationPanel.setLayout(gl_PatientInformationPanel); //sets the patientinfo panel to the above layout
		//HealthRecords Tab
		JPanel HealthRecordsPanel = new JPanel(); //creates new panel for healthrecords
		addTab("HealthRecords", null, HealthRecordsPanel, null); //adds the panel to the Jtabbedpane
		
		//creates new scrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//sets the new layout for the HealthRecrods tab
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
		//creates new table for health records
		SelectedPatientPatientHealthRecordsTable = new JTable();
		SelectedPatientPatientHealthRecordsTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Date", "Weight", "Blood Pressure", "Blood Glucose" //columns of the table
				}
				));
		scrollPane.setViewportView(SelectedPatientPatientHealthRecordsTable);
		HealthRecordsPanel.setLayout(gl_HealthRecordsPanel); //sets the layout to the group layout
		
		////Indicators Tab
		JPanel updateIndicatorsPanel = new JPanel();//creates new Panel
		addTab("Update Indicators", null, updateIndicatorsPanel, null); //adds Panel to tab
		
		//creates new JTextArea
		JTextArea updateIndicatorsPanelBanner = new JTextArea();
		updateIndicatorsPanelBanner.setText("\t\tUpdate Health Indicators\r\n\r\n");
		updateIndicatorsPanelBanner.setTabSize(5);
		updateIndicatorsPanelBanner.setForeground(new Color(0, 0, 102));
		updateIndicatorsPanelBanner.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		updateIndicatorsPanelBanner.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		//creates new textfield for indicators Panel
		updateIndicatorsPanelPrompt = new JTextField(10);
		updateIndicatorsPanelPrompt.setText("Update the textboxes with your Health Indicators, Submit to save.");
		updateIndicatorsPanelPrompt.setEditable(false);
		updateIndicatorsPanelPressureInput1 = new JTextField(5);
		updateIndicatorsPanelWeightInput = new JTextField(5);
		updateIndicatorsPanelPressureInput2 = new JTextField(5);
		updateIndicatorsPanelGlucoseInput = new JTextField(5);
		updateIndicatorsPanelDateInput = new JTextField(5);
		updateIndicatorsPanelDateInput.setEditable(false);
		updateIndicatorsPanelDateInput.setText(dateString);
		
		//creates new Labels for indicators panel
		JLabel label_6 = new JLabel("Weight:");
		JLabel label_7 = new JLabel("lbs");
		JLabel label_8 = new JLabel("Blood Pressure");
		JLabel label_9 = new JLabel("DIA");
		JLabel label_10 = new JLabel("Blood Glucose");
		JLabel label_11 = new JLabel("mg/dL");
		JLabel lblDate = new JLabel("Date:");
		JLabel lblXxxxxxxx = new JLabel("xx/xx/xxxx");
		
		//creates Buttons for indicators panel
		updateIndicatorsPanelSubmit = new JButton("Submit");	
		btnGraph = new JButton("Graph"); //create graph button
		
		//creates layout for Indicators Panel using WindwoBuilder
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
							.addGap(33)
							.addComponent(updateIndicatorsPanelBanner, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
							.addGap(216)
							.addComponent(updateIndicatorsPanelPressureInput2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
								.addGap(166)
								.addComponent(updateIndicatorsPanelSubmit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnGraph, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_updateIndicatorsPanel.createSequentialGroup()
								.addGap(33)
								.addComponent(updateIndicatorsPanelPrompt, GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE))))
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
					.addGroup(gl_updateIndicatorsPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(updateIndicatorsPanelSubmit)
						.addComponent(btnGraph)))
		);
		updateIndicatorsPanel.setLayout(gl_updateIndicatorsPanel); //sets the layout of the indicator panel to the above
		//Prescriptions Tab
		
		JPanel prescriptionsPanel = new JPanel(); //creates new Panel for Prescriptions
		addTab("Prescriptions", null, prescriptionsPanel, null);//adds panel to tab
		
		//creates new scroll Pane
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//creates add prescription button
		prescriptionsPanelAddPrescriptions = new JButton("Add Prescription");
		
		//creates layout for prescriptions Panel
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
		
		//creates new Table for prescriptoins
		SelectedPatientPresciptionsTable = new JTable();
		SelectedPatientPresciptionsTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Date", "Prescription", "Comments" //table columns
				}
				));
		SelectedPatientPresciptionsTable.getColumnModel().getColumn(1).setPreferredWidth(140); //columns width
		SelectedPatientPresciptionsTable.getColumnModel().getColumn(2).setPreferredWidth(420);
		scrollPane_1.setViewportView(SelectedPatientPresciptionsTable);
		prescriptionsPanel.setLayout(gl_prescriptionsPanel); //sets layout to the layout above
		selectedPatientEvents(); //calls the events method
		
	}
	//method for button listener events
	private void selectedPatientEvents()
	{	
		btnEditInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//sets textfields to editable
				patientInformationPanelPatientPhoneInput.setEditable(true);
				patientInformationPanelEmailInput.setEditable(true);
				patientInformationPanelStreetInput.setEditable(true);
				patientInformationPanelStateInput.setEditable(true);
				patientInformationPanelZipInput.setEditable(true);
				patientInformationPanelInsuranceInput.setEditable(true);
				patientInformationPanelCityInput.setEditable(true);
			}
		});
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				//stores textfields into strings
				String sppPhone=patientInformationPanelPatientPhoneInput.getText();
				String sppEmail=patientInformationPanelEmailInput.getText();
				String sppStreet=patientInformationPanelStreetInput.getText();
				String sppCity=patientInformationPanelCityInput.getText();
				String sppState=patientInformationPanelStateInput.getText();
				String sppZip=patientInformationPanelZipInput.getText();
				String sppInsurance=patientInformationPanelInsuranceInput.getText();
				
				String userFile=patientFile+".txt"; 
				
				try
				{
				File file=new File(userFile); //opens the selected patiens file
				BufferedReader br=new BufferedReader(new FileReader(file));
				//reads every line from file and stores it into string
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
				
				//swaps old data with new data
				street=sppStreet;
				city=sppCity;
				state=sppState;
				zip=sppZip;
				insurance=sppInsurance;
				email=sppEmail;
				phone=sppPhone;
				
				//rewrites file using new data
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
				//sets textfields to be uneditable
				patientInformationPanelNameInput.setEditable(false);
				patientInformationPanelLastNameInput.setEditable(false);
				patientInformationPanelPatientPhoneInput.setEditable(false);
				patientInformationPanelEmailInput.setEditable(false);
				patientInformationPanelStreetInput.setEditable(false);
				patientInformationPanelStateInput.setEditable(false);
				patientInformationPanelZipInput.setEditable(false);
				patientInformationPanelInsuranceInput.setEditable(false);
				patientInformationPanelCityInput.setEditable(false);
			}
		});
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
				updateIndicatorsPanelSubmit.setEnabled(false);
				
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
				addPrescription prescript=new addPrescription(patientFile); //calls add prescription class
				
			}
		});
		btnGraph.addActionListener(new ActionListener() {
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
			
			public void actionPerformed(ActionEvent e) {

					ArrayList<String> data = new ArrayList<String>(); 				//These are arraylists for all the indicators.
					ArrayList<String> date = new ArrayList<String>();               //arraylists or vectors have to be used 
					ArrayList<Integer> weight = new ArrayList<Integer>();           //because of changing values.        
					ArrayList<Integer> syspressure = new ArrayList<Integer>();
					ArrayList<Integer> diapressure = new ArrayList<Integer>();
					ArrayList<Integer> bldsugar = new ArrayList<Integer>();
					
					String filename = "dasindicators";
					String filename2 = patientFile + "indicators.txt";
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
	//
	public void setButton()
	{
		prescriptionsPanelAddPrescriptions.setEnabled(false); //turns off addprescription button
	}
	
	public void refreshPrescriptionTable(String file)
	{
		DefaultTableModel model = (DefaultTableModel) SelectedPatientPresciptionsTable.getModel();
		String date, drug, comment;
		
		//clears the table, before table is repopulated;
		for(int i = 0; i < model.getRowCount(); i++)
		{
			model.removeRow(i);
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
		DefaultTableModel model = (DefaultTableModel) SelectedPatientPatientHealthRecordsTable.getModel(); //clears the table, before table is repopulated;
		int row = model.getRowCount()-1; // get the number of rows already in the table
		System.out.println("number of row is: " + row);
		while(row >= 0)
		{
			model.removeRow(row);
			System.out.println(row);
			row--;
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
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
