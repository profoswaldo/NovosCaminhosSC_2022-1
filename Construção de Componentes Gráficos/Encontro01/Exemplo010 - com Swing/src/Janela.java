import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	private JButton botao;
	private FlowLayout layout;
	
	public Janela() {
		this.layout = new FlowLayout();
		this.setLayout(layout);
		this.setBounds(200, 200, 1000, 200);
		this.setTitle("Exemplo006");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.botao = new JButton("CLick");
		this.add(botao);
	}
	
	

}
