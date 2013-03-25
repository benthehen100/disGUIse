import javax.swing.JDialog;
import java.awt.Toolkit;


public class popUp extends JDialog{
	
	public popUp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(popUp.class.getResource("/disGUIse_images/new_add_plus_red.png")));
		setTitle("disGUIse Well-Check Clinic");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
	
		
		
	}
	public static void main(String[] args) {
		
		popUp dialog = new popUp();
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
		
}

}
