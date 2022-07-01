import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	private FlowLayout layout;
	private JButton button;
	private JButton button2;
	private JLabel label;
	private JTextField textField;
	
	public Janela() {
		instanciar();
		configurar();
		adicionar();
	}
	
	private void instanciar() {
		button = new JButton("Pesquisar");
		button2 = new JButton("Limpar");
		label = new JLabel("Digite seu nome: ");
		textField = new JTextField(20);
		layout = new FlowLayout();
	}
	
	private void configurar() {
		setLayout(layout);
		setTitle("Exemplo013");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,200,300,150);
	}

	private void adicionar() {
		add(label);
		add(textField);
		add(button);
		add(button2);
	}
}
