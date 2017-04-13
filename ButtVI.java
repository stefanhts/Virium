

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtVI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// TODO Auto-generated method stub
		// default icon, custom title
		Object[] options = { "QUIT", "GET HELP" };
		int n = JOptionPane.showOptionDialog(frame, "A VIRUS HAS BEEN DETECTED!!", "ATENTION!",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        if (JOptionPane.showConfirmDialog(frame, 
		            "Are you sure to close this window?", "Really Closing?", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		            System.exit(0);
		        }
		    }
		});
	}

}
