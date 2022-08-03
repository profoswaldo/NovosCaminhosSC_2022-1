package visao;


import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;


public class TelaAluno extends JFrame {

	private JButton btnIncluir;
	private JButton btnExcluir;
	private JButton btnAlterar;
	private JButton btnConsultar;
	private JButton btnLimpar;
	private JButton btnSair;
	private JPanel painelCrud;
	private JPanel painelConteudo;
	private JLabel lblTitulo;
	private JLabel lblMatricula;
	private JLabel lblNome;
	private JLabel lblTeste;
	private JLabel lblProva;
	private JLabel lblMedia;
	private JLabel lblSituacao;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtTeste;
	private JTextField txtProva;
	private JTextField txtMedia;
	private JTextField txtSituacao;

	public TelaAluno() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 170);
		setTitle("Novos Caminhos");
		inicializarComponentes();
		organizandoComponentes();
	}
	
	private void inicializarComponentes() {
		painelCrud = new JPanel();
		painelConteudo = new JPanel();
		
		btnIncluir = new JButton("Incluir");
		btnExcluir = new JButton("Excluir");
		btnAlterar = new JButton("Alterar");
		btnConsultar = new JButton("Consultar");
		btnLimpar = new JButton("Limpar");
		btnSair = new JButton("Sair");
		
		lblTitulo = new JLabel("Cadastro de Alunos do Novos Caminhos");
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblMatricula = new JLabel("Matricula");
		lblNome = new JLabel("Nome");
		lblTeste = new JLabel("Teste");
		lblProva = new JLabel("Prova");
		lblMedia = new JLabel("Media");
		lblSituacao = new JLabel("Situacao");
		
		txtMatricula = new JTextField(10);
		txtNome = new JTextField(28);
		txtTeste = new JTextField(5);
		txtProva = new JTextField(5);
		txtMedia = new JTextField(5);
		txtMedia.setBackground(Color.ORANGE);
		txtMedia.setEditable(false);
		txtSituacao = new JTextField(15);
		txtSituacao.setBackground(Color.ORANGE);
		txtSituacao.setEditable(false);
	}
	
	private void organizandoComponentes() {
		getContentPane().add(lblTitulo, BorderLayout.NORTH);
		getContentPane().add(painelConteudo, BorderLayout.CENTER);
		getContentPane().add(painelCrud, BorderLayout.SOUTH);
		
		painelCrud.add(btnIncluir);
		painelCrud.add(btnExcluir);
		painelCrud.add(btnAlterar);
		painelCrud.add(btnConsultar);
		painelCrud.add(btnLimpar);
		painelCrud.add(btnSair);
		
		painelConteudo.add(lblMatricula);
		painelConteudo.add(txtMatricula);
		painelConteudo.add(lblNome);
		painelConteudo.add(txtNome);
		painelConteudo.add(lblTeste);
		painelConteudo.add(txtTeste);
		painelConteudo.add(lblProva);
		painelConteudo.add(txtProva);
		painelConteudo.add(lblMedia);
		painelConteudo.add(txtMedia);
		painelConteudo.add(lblSituacao);
		painelConteudo.add(txtSituacao);
	}
	
	
	
	

}
