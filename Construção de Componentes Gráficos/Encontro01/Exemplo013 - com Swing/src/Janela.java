import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
	
	private FlowLayout layout;
	private JButton button;
	private JLabel label;
	private JTextField textField;
	
	public Janela() {
		button = new JButton("click");
		label = new JLabel("Digite seu nome: ");
		textField = new JTextField(20);
		layout = new FlowLayout();
		setLayout(layout);
		setTitle("Exemplo013");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,200,300,150);
		add(label);
		add(textField);
		add(button);
		
		
	}

}
