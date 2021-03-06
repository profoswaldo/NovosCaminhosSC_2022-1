import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	private JLabel rotulo;
	private JTextField texto;
	private JButton botao;
	
	public Janela() {
		configurarJanela();
		configurarComponentes();
	}
	
	private void configurarJanela() {
		setBounds(400, 250, 400, 200);
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
	}
	
	private void configurarComponentes() {
		rotulo = new JLabel("Nome:");
		texto = new JTextField(20);
		botao = new JButton("Click-me");
		add(rotulo);
		add(texto);
		add(botao);
	}
	

}
