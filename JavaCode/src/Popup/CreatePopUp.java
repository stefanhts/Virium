package Popup;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JOptionPane;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class CreatePopUp extends JFrame implements ActionListener{
		
		JTextField password;
		JButton enter, reset;
		
		CreatePopUp(String title)
		{
			
			super(title);
			
			this.setSize(400, 200);
			
			this.init();	
			this.setVisible(true);
			
		}
		
		void init()
		{
			
			JLabel lwarning = new JLabel("An error has occured, please enter your password to resolve it.");
			

			password = new JTextField(10);
			
			JPanel panel = new JPanel();
			
			panel.add(lwarning);
			panel.add(password);
		
		
			
			enter = new JButton("Enter");
			reset = new JButton("Clear");
			
			enter.addActionListener(this);
			reset.addActionListener(this);
			
			panel.add(enter);
			panel.add(reset);
			
			this.add(panel);
			
		}

		@Override
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == enter) 
			{
				//if the entered text is a certain word then the box will close
				JOptionPane.showMessageDialog(this, "Incorrect, please try again",  "Uh-Oh", JOptionPane.WARNING_MESSAGE);
				
				
				MainFunction.main(null);
			}
			else
			{
				password.setText("");
				for (int i=0; i<=10; i++){
					MainFunction.main(null);
				}
				
			}
			
		}

	}

