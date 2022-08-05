import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Tela extends JFrame {
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultado;
	private JPanel painelCentro;
	private JPanel painelSul;
	private JLabel titulo;
	private JButton btnSomar;
	private JButton btnSubtrair;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JButton btnLimpar;
	private JButton btnSair;
	private JMenuBar menuBar;
	private JMenu mnuOperacoesMatematicas;
	private JMenuItem mnuSomar;
	private JMenuItem mnuSubtrair;
	private JMenuItem mnuMultiplicar;
	private JMenuItem mnuDividir;
	private JSeparator separator;
	private JMenuItem mnuLimpar;
	private JMenuItem mnuSair;
	private JMenu mnuAjuda;
	private JMenuItem mnuSobre;
	private JLabel lblValor1;
	private JLabel lblValor2;
	private JLabel lblValor3;


	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 160);
		
		painelCentro = new JPanel();
		getContentPane().add(painelCentro, BorderLayout.CENTER);
		
		painelSul = new JPanel();
		getContentPane().add(painelSul, BorderLayout.SOUTH);
		
		titulo = new JLabel("Calculadora monstrenga");
		titulo.setFont(new Font("Segoe UI Black", Font.PLAIN, 21));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(titulo, BorderLayout.NORTH);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnuOperacoesMatematicas = new JMenu("Operações");
		menuBar.add(mnuOperacoesMatematicas);
		
		mnuSomar = new JMenuItem("Somar");
		mnuOperacoesMatematicas.add(mnuSomar);
		
		mnuSubtrair = new JMenuItem("Subtrair");
		mnuOperacoesMatematicas.add(mnuSubtrair);
		
		mnuMultiplicar = new JMenuItem("Multiplicar");
		mnuOperacoesMatematicas.add(mnuMultiplicar);
		
		mnuDividir = new JMenuItem("Dividir");
		mnuOperacoesMatematicas.add(mnuDividir);
		
		separator = new JSeparator();
		mnuOperacoesMatematicas.add(separator);
		
		mnuLimpar = new JMenuItem("Limpar");
		mnuLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		mnuOperacoesMatematicas.add(mnuLimpar);
		
		mnuSair = new JMenuItem("Sair");
		mnuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sair();
			}
		});
		
		mnuOperacoesMatematicas.add(mnuSair);
		
		mnuAjuda = new JMenu("Ajuda");
		menuBar.add(mnuAjuda);
		
		mnuSobre = new JMenuItem("Sobre");
		mnuAjuda.add(mnuSobre);
		
		lblValor1 = new JLabel("Valor 1:");
		painelCentro.add(lblValor1);
		
		txtValor1 = new JTextField();
		painelCentro.add(txtValor1);
		txtValor1.setColumns(10);
		
		lblValor2 = new JLabel("Valor 2:");
		painelCentro.add(lblValor2);
		
		txtValor2 = new JTextField();
		painelCentro.add(txtValor2);
		txtValor2.setColumns(10);
		
		lblValor3 = new JLabel("Resultado:");
		painelCentro.add(lblValor3);
		
		txtResultado = new JTextField();
		painelCentro.add(txtResultado);
		txtResultado.setColumns(10);
		
		btnSomar = new JButton("Somar");
		btnSubtrair = new JButton("Subtrair");
		btnMultiplicar = new JButton("Multiplicar");
		btnDividir = new JButton("Dividir");
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sair();
			}
		});
		
		
		painelSul.add(btnSomar);
		painelSul.add(btnSubtrair);
		painelSul.add(btnMultiplicar);
		painelSul.add(btnDividir);
		painelSul.add(btnLimpar);
		painelSul.add(btnSair);
		
		
	}
	
	
	private void sair() {
		JOptionPane.showMessageDialog(rootPane, "Até mais ver");
		dispose();
	}
	
	private void limpar() {
		txtValor1.setText("");
		txtValor2.setText("");
		txtResultado.setText("");
	}

}
