package visão;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controles.ControleAluno;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroAluno extends JFrame {
	
	private JTextField txtMatricula;
	private JLabel lblMatricula;
	private JTextField txtNome;
	private JLabel lblNome;
	private JButton btnIncluir;
	private JButton btnExcluir;
	private JButton btnAlterar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnSair;
	
	private ControleAluno controleAluno;

	public TelaCadastroAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 109);
		getContentPane().setLayout(new FlowLayout());
		
		inicializarComponentes();
		configurarComponentes();
		adicionarComponentes();
		configurarListeners();
	}
	
	private void inicializarComponentes() {
		controleAluno = new ControleAluno();
		lblMatricula = new JLabel("Matricula:");
		txtMatricula = new JTextField();
		lblNome = new JLabel("Nome:");
		txtNome = new JTextField();
		btnIncluir = new JButton("Incluir");
		btnExcluir = new JButton("Excluir");
		btnAlterar = new JButton("Alterar");
		btnConsultar = new JButton("Consultar");
		btnLimpar = new JButton("Limpar");
		btnSair = new JButton("Sair");

	}
	
	private void configurarComponentes() {
		txtMatricula.setColumns(10);
		txtNome.setColumns(25);
		setTitle("Tela de Cadastro de Alunos");
	}
	
	private void configurarListeners() {
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMatricula.setText(null);
				txtNome.setText(null);
			}
		});
		
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleAluno.incluir(txtMatricula.getText(), txtNome.getText());
			}
		});
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleAluno.excluir(txtMatricula.getText());
			}
		});
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controleAluno.alterar(txtMatricula.getText(), txtNome.getText());
			}
		});
		
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] alunos = controleAluno.consultar(txtMatricula.getText());
				txtMatricula.setText(alunos[0]);
				txtNome.setText(alunos[1]);
			}
		});
	}
	
	private void adicionarComponentes() {
		getContentPane().add(lblMatricula);
		getContentPane().add(txtMatricula);
		getContentPane().add(lblNome);
		getContentPane().add(txtNome);
		getContentPane().add(btnIncluir);
		getContentPane().add(btnExcluir);
		getContentPane().add(btnAlterar);
		getContentPane().add(btnConsultar);
		getContentPane().add(btnLimpar);
		getContentPane().add(btnSair);
	}

}
