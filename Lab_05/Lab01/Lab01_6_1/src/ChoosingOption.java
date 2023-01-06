import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null,
					 "Do you want to change to the first class ticket?");
		
		if(option == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "You've chosen: Yes ");
		}
		if(option == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "You've chosen: No ");
		}
		
		System.exit(0);
	}
}
