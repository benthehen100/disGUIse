import javax.swing.JDialog;
import java.awt.Toolkit;


public class popUp extends JDialog{ //creates popUP class which extends JDialog box
	
	public popUp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(popUp.class.getResource("/disGUIse_images/new_add_plus_red.png"))); //sets the icon of the frame
		setTitle("disGUIse Well-Check Clinic");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); //exits on close
		setModal(true); //makes so other windows cant be chosen when this is open
	}
	public static void main(String[] args) {
		
		popUp dialog = new popUp(); //creates new dialog
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true); //visible is ture
		
}

}
