import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame implements ActionListener {

	private JLabel lblValor1;
	private JLabel lblValor2;
	private JLabel lblResultado;

	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultado;

	private JButton btnSomar;
	private JButton btnSubtrair;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JButton btnLimpar;

	private Calculadora calculadora;

	public Tela() {

		calculadora = new Calculadora();
		setBounds(450, 300, 480, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setLayout(new FlowLayout());

		lblValor1 = new JLabel("Valor 1:");
		lblValor2 = new JLabel("Valor 2:");
		lblResultado = new JLabel("Resultado:");

		txtValor1 = new JTextField(15);
		txtValor2 = new JTextField(15);
		txtResultado = new JTextField(15);

		btnDividir = new JButton("Dividir");
		btnLimpar = new JButton("Limpar");
		btnMultiplicar = new JButton("Multiplicar");
		btnSomar = new JButton("Somar");
		btnSubtrair = new JButton("Subtrair");

		btnSomar.addActionListener(this);
		btnSubtrair.addActionListener(this);
		btnMultiplicar.addActionListener(this);
		btnDividir.addActionListener(this);
		btnLimpar.addActionListener(this);

		add(lblValor1);
		add(txtValor1);
		add(lblValor2);
		add(txtValor2);
		add(btnSomar);
		add(btnSubtrair);
		add(btnMultiplicar);
		add(btnDividir);
		add(btnLimpar);
		add(lblResultado);
		add(txtResultado);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		calculadora.setValor1(Double.parseDouble(txtValor1.getText()));
		calculadora.setValor2(Double.parseDouble(txtValor2.getText()));
		if (e.getSource()==btnSomar) 
			txtResultado.setText(Double.toString(calculadora.getSoma()));
		else if (e.getSource()==btnSubtrair) 
				txtResultado.setText(Double.toString(calculadora.getSubtracao()));
		else if (e.getSource()==btnMultiplicar) 
			txtResultado.setText(Double.toString(calculadora.getMultiplicacao()));
		else if (e.getSource()==btnDividir) 
			txtResultado.setText(Double.toString(calculadora.getDivisao()));
		else {
			txtResultado.setText(null);
			txtValor1.setText(null);
			txtValor2.setText(null);
		}
			
			
	

	}

}
