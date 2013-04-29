import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//
public class addPrescription extends JPanel { //creates addprescription jPanel
	//creates field variables
	private JTextField addPrescriptionDateInput;
	private JTextField addPresciptionPrescriptionInput;
	private JTextArea addPrescriptionCommentInput;
	private JButton addPrescriptionSubmit;
	private JButton addPrescriptionCancel;
	private popUp p1;
	String patientFile;
	String dateInput, prescriptionInput, commentInput;
	
	public addPrescription(String patientFileID) { //main class
		
		//gets the date of time entered
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String dateInput = Integer.toString(date.getMonth()) + "/" + Integer.toString(date.getDate()) + "/" + Integer.toString(date.getYear()+1900);
		
		patientFile = patientFileID;
		System.out.println("Patient file passed through: " + patientFile); // console test
		
		//creates textfields
		addPrescriptionDateInput = new JTextField(10);
		addPrescriptionDateInput.setText(dateInput);
		addPrescriptionDateInput.setEditable(false);
		addPresciptionPrescriptionInput = new JTextField(10);
		
		//textarea for comments
		addPrescriptionCommentInput = new JTextArea(); 
		JLabel addPrescriptionPrescriptionLbl = new JLabel("Prescription: ");
		JLabel addPrescriptionDateLbl = new JLabel("Date: ");
		JLabel lblComments = new JLabel("Comments: "); //creates labels
		lblComments.setLabelFor(addPrescriptionCommentInput);
		//creates buttons
		addPrescriptionSubmit = new JButton("Submit");
		addPrescriptionCancel = new JButton("Cancel");
		
		//Banner add prescription
		JLabel lblAddPrescription = new JLabel("Add Prescription"); //add priscription banner
		lblAddPrescription.setForeground(new Color(0, 0, 139));
		lblAddPrescription.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
	
		//creates grouplayout for adprescription panel
		//this is used for positioning of Jcomponents
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(addPrescriptionPrescriptionLbl)
						.addComponent(addPrescriptionDateLbl)
						.addComponent(lblComments))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAddPrescription, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addComponent(addPrescriptionDateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(addPresciptionPrescriptionInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(addPrescriptionSubmit)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(addPrescriptionCancel))
							.addComponent(addPrescriptionCommentInput, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(lblAddPrescription, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(addPrescriptionDateLbl)
							.addGap(18)
							.addComponent(addPrescriptionPrescriptionLbl)
							.addGap(18)
							.addComponent(lblComments))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(addPrescriptionDateInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(addPresciptionPrescriptionInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(addPrescriptionCommentInput, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(addPrescriptionSubmit)
						.addComponent(addPrescriptionCancel))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		setLayout(groupLayout); //sets layout of this panel to grouplayout
		
		addPrescriptionEvents(); //calls the events
		p1=new popUp(); //creates new popup
		p1.getContentPane().add(this); //adds this panel to popup
		p1.pack();//packs frame
		p1.show(); //shows frame
	}
	private void addPrescriptionEvents()
	{
		addPrescriptionSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Updates patient prescriptions when 'Submit' is clicked
				String patientPrescriptionFile; // Establishes variable for patient file
				System.out.println("Current patient: " + patientFile); // console test
				
				// Reads information from text fields
				String newDateInput = addPrescriptionDateInput.getText();
				String newPrescriptionInput = addPresciptionPrescriptionInput.getText();
				String newCommentInput = addPrescriptionCommentInput.getText();
				
				// Defines patientIndicatorFile
				patientPrescriptionFile = patientFile + "prescriptions.txt";
				
				System.out.println("Current file: " + patientPrescriptionFile); // console test
				if(newPrescriptionInput.length()!=0 && newCommentInput.length()!=0) //makes sure all fields are entered
				{
				try
				{
				File file2 = new File(patientPrescriptionFile);
				
				// Creates new indicator file if one is not present already
				if (!file2.exists()) {
					file2.createNewFile();
				}
				
				BufferedReader br_pre = new BufferedReader(new FileReader(file2));
				
				// Sets text field information to variables
				dateInput = newDateInput;
				prescriptionInput = newPrescriptionInput;
				commentInput = newCommentInput;
				
				// Appends new prescriptions to end of old file
				FileWriter fw_pre=new FileWriter(patientPrescriptionFile, true);
				fw_pre.write(dateInput + "\n");
				fw_pre.write(prescriptionInput + "\n");
				fw_pre.write(commentInput + "\n");

				fw_pre.flush();
				fw_pre.close();
				br_pre.close();
				
				}catch (Throwable e1) {
					e1.printStackTrace();
				}
				// Fields are not editable after clicking the 'Submit' button
				addPrescriptionDateInput.setEditable(false);
				addPresciptionPrescriptionInput.setEditable(false);
				addPrescriptionCommentInput.setEditable(false);
				JOptionPane.showMessageDialog(addPrescriptionSubmit, "Prescription Added");//notifies that prscription is added
				disGuiseFrame.doctor.spp2.refreshPrescriptionTable(disGuiseFrame.doctor.spp2.patientID); //refreshes prescription table
				p1.dispose(); //closes frame
				}
				else
				{
					//prompts user to enter all fields
					JOptionPane.showMessageDialog(addPrescriptionSubmit, "Please Fill All Fields");
				}
			}
		});
		//
		addPrescriptionCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				p1.dispose();//closes window
			}
		});
		
	}
}
