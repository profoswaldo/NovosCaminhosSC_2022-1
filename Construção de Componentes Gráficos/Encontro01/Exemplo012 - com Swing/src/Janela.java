
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;


public class Janela extends JFrame {
	public Janela() {
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("New button");
		getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JButton btnNewButton_2 = new JButton("New button");
		getContentPane().add(btnNewButton_2, BorderLayout.WEST);
	}




}
