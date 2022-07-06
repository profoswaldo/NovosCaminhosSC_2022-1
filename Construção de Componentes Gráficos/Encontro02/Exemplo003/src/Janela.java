import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame implements ActionListener{
	
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
		botao.addActionListener(this);
		add(rotulo);
		add(texto);
		add(botao);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		texto.setText("Oswaldo");
	}
	

}
