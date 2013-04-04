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


public class addPrescription extends JPanel { //creates addprescription jPanel
	private JTextField addPrescriptionDateInput;
	private JTextField addPresciptionPrescriptionInput;
	private JButton addPresciptionSubmit;
	private JButton addPrescriptionCancel;
	
	public addPrescription() { //main calss
		
		addPrescriptionDateInput = new JTextField(10); //creates textfields
		addPresciptionPrescriptionInput = new JTextField(10);
		
		JTextArea addPresciptionsCommentInput = new JTextArea(); //textarea for comments
		JLabel addPrescriptionPrescriptionLbl = new JLabel("Prescription: ");
		JLabel addPrescriptionDateLbl = new JLabel("Date: ");
		
		JLabel lblComments = new JLabel("Comments: "); //creates labels
		lblComments.setLabelFor(addPresciptionsCommentInput);
		
		addPresciptionSubmit = new JButton("Submit");
		addPrescriptionCancel = new JButton("Cancel");
		
		
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
								.addComponent(addPresciptionSubmit)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(addPrescriptionCancel))
							.addComponent(addPresciptionsCommentInput, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)))
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
							.addComponent(addPresciptionsCommentInput, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(addPresciptionSubmit)
						.addComponent(addPrescriptionCancel))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		setLayout(groupLayout); //sets layout of this panel to grouplayout
		
		addPrescriptionEvents(); //calls the events
	}
	private void addPrescriptionEvents()
	{
		addPresciptionSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//submit button effects
			}
		});
		//
		addPrescriptionCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//cancel button effects
			}
		});
		
	}
}
