import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Tela extends JFrame {


	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(new BorderLayout());
		
		add(new JButton("Click"));
		add(new JButton("Click"));
		add(new JButton("Click"));
		add(new JButton("Click"));

	}

}
