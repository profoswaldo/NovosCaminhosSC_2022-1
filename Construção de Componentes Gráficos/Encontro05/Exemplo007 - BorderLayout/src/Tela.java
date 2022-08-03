import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tela extends JFrame {


	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JPanel painelSul = new JPanel();
		
		setLayout(new BorderLayout());
		painelSul.setLayout(new FlowLayout());
		
		add(new JButton("Norte"), BorderLayout.NORTH);
		
		add(painelSul, BorderLayout.SOUTH);
		painelSul.add(new JButton("Sul1"));
		painelSul.add(new JButton("Sul2"));
		
		add(new JButton("Leste"), BorderLayout.EAST);
		
		add(new JButton("Oeste"), BorderLayout.WEST);
		
		add(new JButton("Centro"), BorderLayout.CENTER);

	}

}
