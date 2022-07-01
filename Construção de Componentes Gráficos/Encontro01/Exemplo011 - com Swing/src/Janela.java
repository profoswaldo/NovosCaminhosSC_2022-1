import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	private JButton botao1;
	private JButton botao2;
	private JButton botao3;
	private FlowLayout layout;
	
	public Janela() {
		this.layout = new FlowLayout();
		this.setLayout(layout);
		this.setBounds(200, 200, 1000, 200);
		this.setTitle("Exemplo006");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.botao1 = new JButton("CLick 1");
		this.botao2 = new JButton("CLick 2");
		this.botao3 = new JButton("CLick 3");
		this.add(botao1);
		this.add(botao2);
		this.add(botao3);
		
	}
	
	

}
